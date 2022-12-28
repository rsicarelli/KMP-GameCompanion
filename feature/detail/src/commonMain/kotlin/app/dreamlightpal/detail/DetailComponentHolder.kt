package app.dreamlightpal.detail

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import com.arkivanov.decompose.ComponentContext
import com.arkivanov.decompose.value.Value

@Stable
sealed interface DetailComponent {

    val models: Value<Model>

    @Immutable
    data class Model(
        val isMemes: Boolean,
    )
}

internal class DetailComponentHolder(
    componentContext: ComponentContext,
    onClosed: OnClose,
) : DetailComponent, ComponentContext by componentContext {

    override val models: Value<DetailComponent.Model>
        get() = TODO("Not yet implemented")
}
