package app.dreamlightpal.home.router

import app.dreamlightpal.detail.DetailComponentFactory
import app.dreamlightpal.detail.OnClose
import app.dreamlightpal.navigation.HomeComponent.DetailFeatureStack
import app.dreamlightpal.navigation.HomeComponent.DetailFeatureStack.Details
import app.dreamlightpal.navigation.HomeComponent.DetailFeatureStack.Hidden
import com.arkivanov.decompose.ComponentContext
import com.arkivanov.decompose.router.stack.ChildStack
import com.arkivanov.decompose.router.stack.StackNavigation
import com.arkivanov.decompose.router.stack.childStack
import com.arkivanov.decompose.router.stack.navigate
import com.arkivanov.decompose.router.stack.popWhile
import com.arkivanov.decompose.value.Value
import com.arkivanov.essenty.parcelable.Parcelable
import com.arkivanov.essenty.parcelable.Parcelize

class DetailRouter(
    componentContext: ComponentContext,
    private val detailComponentFactory: DetailComponentFactory,
    private val onClose: OnClose,
) {

    private val navigation = StackNavigation<Config>()

    val stack: Value<ChildStack<Config, DetailFeatureStack>> =
        componentContext.childStack(
            source = navigation,
            initialConfiguration = Config.Hidden,
            key = "DetailRouter",
            childFactory = ::createChild,
        )

    private fun createChild(config: Config, componentContext: ComponentContext): DetailFeatureStack {
        val detailFeatureStack = when (config) {
            is Config.Detail -> Details(detailComponentFactory(componentContext, onClose))
            is Config.Hidden -> Hidden
        }
        return detailFeatureStack
    }

    fun closeDetail() {
        navigation.popWhile { it !is Config.Hidden }
    }

    fun showDetails(id: String) {
        navigation.navigate { stack ->
            stack
                .dropLastWhile { it is Config.Detail }
                .plus(Config.Detail(id = id))
        }
    }

    sealed class Config : Parcelable {
        @Parcelize
        object Hidden : Config()

        @Parcelize
        data class Detail(val id: String) : Config()
    }
}
