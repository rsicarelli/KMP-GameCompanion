package app.dreamlightpal.root

import app.dreamlightpal.navigation.HomeComponent
import com.arkivanov.decompose.ComponentContext
import com.arkivanov.decompose.router.stack.ChildStack
import com.arkivanov.decompose.value.Value

class DefaultHomeComponent(
    componentContext: ComponentContext,
) : HomeComponent, ComponentContext by componentContext {

    override val models: Value<HomeComponent.Model>
        get() = TODO("Not yet implemented")
    override val listChildStack: Value<ChildStack<*, HomeComponent.ListChild>>
        get() = TODO("Not yet implemented")
    override val detailsChildStack: Value<ChildStack<*, HomeComponent.DetailsChild>>
        get() = TODO("Not yet implemented")

    override fun setMultiPane(isMultiPane: Boolean) {
        TODO("Not yet implemented")
    }

}
