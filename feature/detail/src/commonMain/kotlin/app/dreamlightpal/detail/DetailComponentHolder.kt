package app.dreamlightpal.detail

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import com.arkivanov.decompose.ComponentContext
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

@Stable
sealed interface DetailComponent {

    val state: StateFlow<State>

    @Immutable
    data class State(
        val item: CollectionListItem? = null,
    ) {

        @Immutable
        data class CollectionListItem(
            val localizedNameKey: String,
            val imageUrl: String,
        )
    }
}

internal class DetailComponentHolder(
    componentContext: ComponentContext,
    private val onClosed: OnClose,
) : DetailComponent, ComponentContext by componentContext {

    private val _state = MutableStateFlow(DetailComponent.State())
    override val state: StateFlow<DetailComponent.State> = _state.asStateFlow()

    fun onClose() = onClosed
}
