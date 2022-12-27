package app.dreamlightpal.collection.data

import android.content.Context
import app.dreamlightpal.DreamlightPal
import com.squareup.sqldelight.android.AndroidSqliteDriver
import com.squareup.sqldelight.db.SqlDriver

actual class DriverFactory(private val context: Context) {

    actual fun createDriver(): SqlDriver =
        AndroidSqliteDriver(
            schema = DreamlightPal.Schema,
            context = context,
            name = "DreamlightPal.db"
        )

}
