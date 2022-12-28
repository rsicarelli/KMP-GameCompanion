package app.dreamlightpal.home

import app.dreamlightpal.detail.DetailComponentFactory
import app.dreamlightpal.home.router.DetailRouter
import app.dreamlightpal.home.router.ListRouter
import app.dreamlightpal.list.ListComponentFactory
import app.dreamlightpal.navigation.HomeComponent
import app.dreamlightpal.navigation.HomeComponent.DetailFeatureStack
import com.arkivanov.decompose.ComponentContext
import com.arkivanov.decompose.router.stack.ChildStack
import com.arkivanov.decompose.value.MutableValue
import com.arkivanov.decompose.value.Value
import com.arkivanov.decompose.value.reduce

class HomeComponentHolder(
    componentContext: ComponentContext,
    listComponentFactory: ListComponentFactory,
    detailComponentFactory: DetailComponentFactory,
) : HomeComponent, ComponentContext by componentContext {

    private val listRouter = ListRouter(this, listComponentFactory, ::onItemSelected)

    private val _models = MutableValue(HomeComponent.Model())
    override val models: Value<HomeComponent.Model> = _models

    override fun setMultiPane(isMultiPane: Boolean) {
        _models.reduce { it.copy(isMultiPane = isMultiPane) }

    }

    private fun switchToMultiPane() {
    }

    private fun switchToSinglePane() {
    }

    override val listStack: Value<ChildStack<*, HomeComponent.ListFeatureStack>> = listRouter.stack

    private val detailRouter = DetailRouter(this, detailComponentFactory, ::onClose)
    override val detailStack: Value<ChildStack<*, DetailFeatureStack>> = detailRouter.stack

    fun onItemSelected(id: String) {
        detailRouter.showDetails(id)
    }

    fun onClose() {
        detailRouter.closeDetail()
    }

}
