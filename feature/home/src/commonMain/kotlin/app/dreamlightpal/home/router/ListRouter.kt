package app.dreamlightpal.home.router

import app.dreamlightpal.home.HomeComponent
import app.dreamlightpal.list.ListComponentFactory
import app.dreamlightpal.list.OnItemSelected
import com.arkivanov.decompose.ComponentContext
import com.arkivanov.decompose.router.stack.ChildStack
import com.arkivanov.decompose.router.stack.StackNavigation
import com.arkivanov.decompose.router.stack.active
import com.arkivanov.decompose.router.stack.childStack
import com.arkivanov.decompose.router.stack.pop
import com.arkivanov.decompose.value.Value
import com.arkivanov.essenty.parcelable.Parcelable
import com.arkivanov.essenty.parcelable.Parcelize


class ListRouter(
    componentContext: ComponentContext,
    private val listStackFactory: ListComponentFactory,
    private val onItemSelected: OnItemSelected,
    private val navigation: StackNavigation<Config> = StackNavigation(),
) {

    val stack: Value<ChildStack<Config, HomeComponent.ListFeatureStack>> =
        componentContext.childStack(
            source = navigation,
            initialConfiguration = Config.List,
            key = "ListRouter",
            childFactory = ::createChild,
        )

    private fun createChild(config: Config, componentContext: ComponentContext): HomeComponent.ListFeatureStack =
        when (config) {
            is Config.List -> HomeComponent.ListFeatureStack.List(listStackFactory(componentContext, onItemSelected))
        }

    fun show() {
        if (stack.active.configuration !is Config.List) {
            navigation.pop()
        }
    }

    sealed class Config : Parcelable {
        @Parcelize
        object List : Config()
    }
}
