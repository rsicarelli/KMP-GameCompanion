package app.dreamlightpal.navigation

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import com.arkivanov.decompose.router.stack.ChildStack
import com.arkivanov.decompose.value.Value

@Stable
interface HomeComponent {

    val listStack: Value<ChildStack<*, ListFeatureStack>>
    val detailStack: Value<ChildStack<*, DetailFeatureStack>>

    sealed interface ListFeatureStack {
        class List(val component: ListComponent) : ListFeatureStack
    }

    sealed interface DetailFeatureStack {
        class Details(val component: DetailComponent) : DetailFeatureStack
        object Hidden : DetailFeatureStack
    }
}

@Stable
interface ListComponent {

    val models: Value<Model>

    @Immutable
    data class Model(
        val isMemes: Boolean,
    )
}

@Stable
interface DetailComponent {

    val models: Value<Model>

    @Immutable
    data class Model(
        val isMemes: Boolean,
    )
}
