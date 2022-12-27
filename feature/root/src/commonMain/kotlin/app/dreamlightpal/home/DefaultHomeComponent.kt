package app.dreamlightpal.home

import app.dreamlightpal.navigation.HomeComponent
import app.dreamlightpal.navigation.RootComponent
import com.arkivanov.decompose.ComponentContext
import com.arkivanov.decompose.router.stack.ChildStack
import com.arkivanov.decompose.router.stack.StackNavigation
import com.arkivanov.decompose.router.stack.childStack
import com.arkivanov.decompose.value.Value
import com.arkivanov.essenty.parcelable.Parcelable

class DefaultRootComponent(
    componentContext: ComponentContext,
    val homeFactory: (ComponentContext) -> HomeComponent,
) : RootComponent, ComponentContext by componentContext {

    private val navigation = StackNavigation<Config>()

    private val stack =
        childStack(
            source = navigation,
            initialStack = { listOf(Config.Home) },
            childFactory = ::child,
        )

    override val childStack: Value<ChildStack<*, RootComponent.Child>> = stack

    private fun child(config: Config, componentContext: ComponentContext): RootComponent.Child =
        when (config) {
            is Config.Home -> RootComponent.Child.Home(homeFactory(componentContext))
        }

    private sealed interface Config : Parcelable {
        object Home : Config
    }
}
