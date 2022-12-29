package app.dreamlightpal.compose.resource

interface PlatformResource {

    val resId: Int?
    val fileName: String?
}

expect val SpikeBackground: PlatformResource
