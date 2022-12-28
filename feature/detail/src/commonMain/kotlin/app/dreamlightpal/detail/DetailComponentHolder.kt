package app.dreamlightpal.detail

import app.dreamlightpal.navigation.DetailComponent
import com.arkivanov.decompose.ComponentContext
import com.arkivanov.decompose.value.Value

internal class DetailComponentHolder(
    componentContext: ComponentContext,
    onClosed: OnClose,
) : DetailComponent, ComponentContext by componentContext {

    override val models: Value<DetailComponent.Model>
        get() = TODO("Not yet implemented")
}
