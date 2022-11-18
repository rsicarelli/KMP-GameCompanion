package decorators

import com.android.build.api.dsl.CommonExtension
import org.gradle.api.Project
import org.gradle.api.tasks.testing.Test
import org.gradle.api.tasks.testing.TestDescriptor
import org.gradle.api.tasks.testing.TestListener
import org.gradle.api.tasks.testing.TestResult
import org.gradle.api.tasks.testing.logging.TestExceptionFormat
import org.gradle.api.tasks.testing.logging.TestLogEvent.FAILED
import org.gradle.api.tasks.testing.logging.TestLogEvent.PASSED
import org.gradle.api.tasks.testing.logging.TestLogEvent.SKIPPED
import org.gradle.api.tasks.testing.logging.TestLogEvent.STANDARD_ERROR
import org.gradle.api.tasks.testing.logging.TestLogEvent.STANDARD_OUT
import org.gradle.api.tasks.testing.logging.TestLogEvent.STARTED
import org.gradle.kotlin.dsl.withType
import org.gradle.api.logging.Logger as GradleLogger

// https://junit.org/junit5/docs/current/user-guide/#writing-tests-test-instance-lifecycle-changing-default
// ideally be preset at JUnit Platform configuration file
internal fun Test.setDefaultTestInstanceLifecycle(lifecycle: String = "per_class") {
    this.systemProperty("junit.jupiter.testinstance.lifecycle.default", lifecycle)
}

internal fun Project.applyJUnit5(
    commonExtension: CommonExtension<*, *, *, *>,
) {
    commonExtension.apply {
        tasks.withType<Test>().all {
            useJUnitPlatform {
                setDefaultTestInstanceLifecycle()
            }

            testLogging.run {
                events = setOf(FAILED, PASSED, SKIPPED, STANDARD_OUT)
                exceptionFormat = TestExceptionFormat.FULL
                showExceptions = true
                showCauses = true
                showStackTraces = true

                debug {
                    events = setOf(STARTED, FAILED, PASSED, SKIPPED, STANDARD_ERROR, STANDARD_OUT)
                    exceptionFormat = TestExceptionFormat.FULL
                }

                info.events = debug.events
                info.exceptionFormat = debug.exceptionFormat
            }

            addTestListener(testListener)
        }
    }
}

private val Project.testListener: TestListener
    get() {
        val failedTests = mutableListOf<TestDescriptor>()
        val skippedTests = mutableListOf<TestDescriptor>()

        return object : TestListener {
            override fun beforeSuite(suite: TestDescriptor) = Unit
            override fun beforeTest(testDescriptor: TestDescriptor) = Unit
            override fun afterTest(testDescriptor: TestDescriptor, result: TestResult) {
                when (result.resultType) {
                    TestResult.ResultType.FAILURE -> failedTests.add(testDescriptor)
                    TestResult.ResultType.SKIPPED -> skippedTests.add(testDescriptor)
                    else -> Unit
                }
            }

            override fun afterSuite(suite: TestDescriptor, result: TestResult) {
                if (suite.parent == null) {
                    logger.lifecycle("----")
                    logger.lifecycle("Test result: ${result.resultType}")
                    logger.lifecycle(
                        "Test summary: ${result.testCount} tests, " +
                                "${result.successfulTestCount} succeeded, " +
                                "${result.failedTestCount} failed, " +
                                "${result.skippedTestCount} skipped"
                    )

                    failedTests.report("Failed Tests", logger, this@testListener)
                    skippedTests.report("Skipped Tests", logger, this@testListener)
                }
            }
        }
    }

private fun MutableList<TestDescriptor>.report(
    headerText: String,
    logger: GradleLogger,
    parent: Project?,
) {
    if (isNotEmpty()) {
        logger.lifecycle("\t$headerText:")
        asSequence().forEach {
            parent?.let { parent ->
                logger.lifecycle("\t\t${parent.name} - ${it.name}")
            } ?: logger.lifecycle("\t\t${it.name}")
        }
    }
}