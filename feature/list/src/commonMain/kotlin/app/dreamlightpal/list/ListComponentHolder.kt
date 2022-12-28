package app.dreamlightpal.list

import app.dreamlightpal.navigation.ListComponent
import com.arkivanov.decompose.ComponentContext
import com.arkivanov.decompose.value.Value

internal class ListComponentHolder(
    componentContext: ComponentContext,
    onItemSelected: OnItemSelected,
) : ListComponent, ComponentContext by componentContext {

    override val models: Value<ListComponent.Model>
        get() = TODO("Not yet implemented")
}
