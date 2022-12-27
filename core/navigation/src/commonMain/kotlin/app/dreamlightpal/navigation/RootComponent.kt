package app.dreamlightpal.navigation

import com.arkivanov.decompose.router.stack.ChildStack
import com.arkivanov.decompose.value.Value

interface RootComponent {

    val childStack: Value<ChildStack<*, Child>>

    sealed class Child {
        class Home(val component: HomeComponent) : Child()
    }
}

interface HomeComponent {

    val models: Value<Model>

    val listChildStack: Value<ChildStack<*, ListChild>>
    val detailsChildStack: Value<ChildStack<*, DetailsChild>>

    fun setMultiPane(isMultiPane: Boolean)

    data class Model(
        val isMultiPane: Boolean = false,
    )

    sealed class ListChild {
        class List(val component: CollectionItemListComponent) : ListChild()
        object None : ListChild()
    }

    sealed class DetailsChild {
        object None : DetailsChild()
        data class Details(val component: CollectionItemDetailsComponent) : DetailsChild()
    }
}

interface CollectionItemListComponent {

    val models: Value<Model>

    data class Model(
        val isMemes: Boolean,
    )
}

interface CollectionItemDetailsComponent {

    val models: Value<Model>

    data class Model(
        val isMemes: Boolean,
    )
}
