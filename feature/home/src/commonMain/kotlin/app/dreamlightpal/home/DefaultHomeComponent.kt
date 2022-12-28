package app.dreamlightpal.home

import app.dreamlightpal.detail.DetailComponentFactory
import app.dreamlightpal.home.router.DetailRouter
import app.dreamlightpal.home.router.ListRouter
import app.dreamlightpal.list.ListComponentFactory
import app.dreamlightpal.navigation.HomeComponent
import app.dreamlightpal.navigation.HomeComponent.DetailFeatureStack
import com.arkivanov.decompose.ComponentContext
import com.arkivanov.decompose.router.stack.ChildStack
import com.arkivanov.decompose.value.Value

class DefaultHomeComponent(
    componentContext: ComponentContext,
    listComponentFactory: ListComponentFactory,
    detailComponentFactory: DetailComponentFactory,
) : HomeComponent, ComponentContext by componentContext {

    private val listRouter = ListRouter(this, listComponentFactory, ::onItemSelected)
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
