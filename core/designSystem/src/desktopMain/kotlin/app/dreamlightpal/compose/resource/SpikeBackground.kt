package app.dreamlightpal.compose.resource

import com.rsicarelli.kmplatform.copan.compose.resource.AndroidRes
import com.rsicarelli.kmplatform.copan.compose.resource.CopanResource
import com.rsicarelli.kmplatform.copan.compose.resource.DesktopRes

actual val SpikeBackground: CopanResource
    get() = object : CopanResource {
        override val androidRes: AndroidRes? = null
        override val desktopRes: DesktopRes = "images/night_thorns_background.svg"
    }
