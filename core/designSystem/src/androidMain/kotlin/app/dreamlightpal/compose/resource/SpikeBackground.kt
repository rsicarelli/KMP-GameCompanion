package app.dreamlightpal.compose.resource

import app.dreamlightpal.core.designSystem.R
import com.rsicarelli.kmplatform.copan.compose.resource.AndroidRes
import com.rsicarelli.kmplatform.copan.compose.resource.CopanResource
import com.rsicarelli.kmplatform.copan.compose.resource.DesktopRes

actual val SpikeBackground: CopanResource
    get() = object : CopanResource {
        override val androidRes: AndroidRes
            get() = R.drawable.background_spike_white
        override val desktopRes: DesktopRes? = null
    }
