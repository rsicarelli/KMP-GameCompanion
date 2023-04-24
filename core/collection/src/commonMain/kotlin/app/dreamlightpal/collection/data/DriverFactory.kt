package app.dreamlightpal.collection.data

import app.dreamlightpal.DreamlightPal
import app.dreamlightpal.collection.domain.model.CollectionType
import appdreamlightpal.Collection_item
import com.squareup.sqldelight.ColumnAdapter
import com.squareup.sqldelight.db.SqlDriver

class DreamlightPalDatabaseFactory(
    private val driverFactory: DriverFactory,
) {

    fun createDatabase(): DreamlightPal {
        return DreamlightPal(
            driverFactory.createDriver(),
            collection_itemAdapter = Collection_item.Adapter(
                locationIdsAdapter = listOfStringsAdapter,
                typesAdapter = listOfTypesAdapter,
                externalTypeRefIdAdapter = listOfStringsAdapter,
                activityIdsAdapter = listOfStringsAdapter,
                collectionRecipeIdsAdapter = listOfStringsAdapter
            ),
        )
    }
}


expect class DriverFactory {

    fun createDriver(): SqlDriver
}

private val listOfStringsAdapter = object : ColumnAdapter<List<String>, String> {
    override fun decode(databaseValue: String) =
        if (databaseValue.isEmpty()) listOf()
        else databaseValue.split(",")

    override fun encode(value: List<String>) = value.joinToString(separator = ",")
}

private val listOfTypesAdapter = object : ColumnAdapter<List<CollectionType>, String> {
    override fun decode(databaseValue: String): List<CollectionType> =
        if (databaseValue.isEmpty()) listOf()
        else databaseValue.split(",")
            .map(CollectionType.Companion::fromString)

    override fun encode(value: List<CollectionType>): String = value.joinToString(separator = ",")
}
