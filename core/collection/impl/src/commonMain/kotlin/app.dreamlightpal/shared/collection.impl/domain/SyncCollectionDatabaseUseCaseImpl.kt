package app.dreamlightpal.shared.collection.impl.domain

import app.dreamlightpal.shared.api.domain.CollectionItem
import app.dreamlightpal.shared.api.domain.CollectionRepository
import app.dreamlightpal.shared.api.domain.SyncCollectionDatabaseUseCase
import app.dreamlightpal.shared.collection.impl.domain.SyncCollectionDatabaseDefaults.RawJson
import co.touchlab.kermit.Logger
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.Json

internal class SyncCollectionDatabaseUseCaseImpl(
    private val collectionRepository: CollectionRepository,
) : SyncCollectionDatabaseUseCase {

    override fun invoke(coroutineScope: CoroutineScope) {
        coroutineScope.launch(Dispatchers.Default) {
            runCatching { Json.decodeFromString(CollectionDto.serializer(), RawJson) }
                .onSuccess { (items) -> collectionRepository.addAll(items) }
                .onFailure { Logger.e("Failed to parse collection json", it) }
        }
    }
}

@Serializable
private data class CollectionDto(
    @SerialName("items")
    val items: List<CollectionItem>,
)

private object SyncCollectionDatabaseDefaults {

    const val RawJson =
        "{\"items\":[{\"itemId\":\"123\",\"parentGroupId\":\"456\",\"parentGroupIndex\":-1,\"localizedNameKey\":\"some_key\",\"localizedDescriptionKey\":\"some_key\",\"imageUrl\":\"www.image.com\",\"locationIds\":[\"1234\",\"3445\"],\"types\":[\"MEMORY\",\"CHARACTER\",\"CRAFTING\",\"CRITTER\",\"FISH\",\"FORAGING\",\"INGREDIENT\",\"MEAL\",\"GEM\",\"CLOTHING\",\"FURNITURE\"],\"externalTypeRefId\":\"234\",\"activityIds\":[\"123\",\"123\"],\"collectionRecipeIds\":[\"123\",\"456\"],\"starCount\":5,\"energyValue\":4334,\"buyPrice\":434,\"sellPrice\":23434}]}"

}
