package app.dreamlightpal.collection.domain.model

import kotlinx.serialization.Contextual
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@JvmInline
value class LocationId(val value: String)

@Serializable
data class Location(
    @SerialName("id") @Contextual
    val id: LocationId,
    @SerialName("name") val name: String,
    @SerialName("description") val description: String,
)
