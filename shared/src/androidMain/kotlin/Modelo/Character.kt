package Modelo

import kotlinx.serialization.Serializable

@Serializable
class Character(
    val name: String,
    val description: String,
    val thumbnail: Thumbnail,
)

@Serializable
data class Thumbnail(
    val path: String,
    val extension: String
) {
    fun toUrl() = "$path.$extension"
}