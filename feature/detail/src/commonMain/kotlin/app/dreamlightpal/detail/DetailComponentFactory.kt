package app.dreamlightpal.detail

import com.arkivanov.decompose.ComponentContext

fun interface DetailComponentFactory : (ComponentContext, OnClose) -> DetailComponent

typealias OnClose = () -> Unit

