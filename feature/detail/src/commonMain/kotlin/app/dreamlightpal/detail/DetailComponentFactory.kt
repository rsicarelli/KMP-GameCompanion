package app.dreamlightpal.detail

import app.dreamlightpal.navigation.DetailComponent
import com.arkivanov.decompose.ComponentContext

fun interface DetailComponentFactory : (ComponentContext, OnClose) -> DetailComponent

typealias OnClose = () -> Unit

