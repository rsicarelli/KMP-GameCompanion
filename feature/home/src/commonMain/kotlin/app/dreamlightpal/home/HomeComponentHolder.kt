package app.dreamlightpal.home

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import app.dreamlightpal.detail.DetailComponent
import app.dreamlightpal.detail.DetailComponentFactory
import app.dreamlightpal.home.router.DetailRouter
import app.dreamlightpal.home.router.ListRouter
import app.dreamlightpal.list.ListComponent
import app.dreamlightpal.list.ListComponentFactory
import com.arkivanov.decompose.ComponentContext
import com.arkivanov.decompose.router.stack.ChildStack
import com.arkivanov.decompose.value.MutableValue
import com.arkivanov.decompose.value.Value
import com.arkivanov.decompose.value.reduce

@Stable
interface HomeComponent {

    val models: Value<Model>

    fun setMultiPane(isMultiPane: Boolean)

    @Immutable
    data class Model(
        val isMultiPane: Boolean = false,
    )

    val listStack: Value<ChildStack<*, ListFeatureStack>>
    val detailStack: Value<ChildStack<*, DetailFeatureStack>>

    sealed interface ListFeatureStack {
        object Hidden : ListFeatureStack
        class List(val component: ListComponent) : ListFeatureStack
    }

    sealed interface DetailFeatureStack {
        class Details(val component: DetailComponent) : DetailFeatureStack
        object Hidden : DetailFeatureStack
    }
}

class HomeComponentHolder(
    componentContext: ComponentContext,
    listComponentFactory: ListComponentFactory,
    detailComponentFactory: DetailComponentFactory,
) : HomeComponent, ComponentContext by componentContext {

    private val listRouter = ListRouter(this, listComponentFactory)

    private val _models = MutableValue(HomeComponent.Model())
    override val models: Value<HomeComponent.Model> = _models

    override fun setMultiPane(isMultiPane: Boolean) {
        _models.reduce { it.copy(isMultiPane = isMultiPane) }
    }

    override val listStack: Value<ChildStack<*, HomeComponent.ListFeatureStack>> = listRouter.stack

    private val detailRouter = DetailRouter(this, detailComponentFactory, ::onClose)
    override val detailStack: Value<ChildStack<*, HomeComponent.DetailFeatureStack>> = detailRouter.stack

    fun onItemSelected(id: String, isMultiPane: Boolean = false) {
        if (!isMultiPane) {
            listRouter.hide()
        }
        detailRouter.showDetails(id)
    }

    fun onClose() {
        detailRouter.closeDetail()
    }

}
