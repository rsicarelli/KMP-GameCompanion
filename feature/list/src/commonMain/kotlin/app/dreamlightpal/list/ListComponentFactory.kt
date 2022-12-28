package app.dreamlightpal.list

import com.arkivanov.decompose.ComponentContext

fun interface ListComponentFactory : (ComponentContext, OnItemSelected) -> ListComponent

typealias OnItemSelected = (id: String) -> Unit

