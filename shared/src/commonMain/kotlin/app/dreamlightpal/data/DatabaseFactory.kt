package app.dreamlightpal.data

import app.dreamlightpal.DreamlightPal
import app.dreamlightpal.domain.CollectionItem
import appdreamlightpal.Collection_item
import com.squareup.sqldelight.ColumnAdapter
import com.squareup.sqldelight.db.SqlDriver

class HomeHuntDatabaseFactory(
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

private val listOfTypesAdapter = object : ColumnAdapter<List<CollectionItem.Type>, String> {
    override fun decode(databaseValue: String): List<CollectionItem.Type> =
        if (databaseValue.isEmpty()) listOf()
        else databaseValue.split(",")
            .map(CollectionItem.Type::fromString)

    override fun encode(value: List<CollectionItem.Type>): String = value.joinToString(separator = ",")
}
