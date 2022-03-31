package demidova.dictionary.domain

import com.google.gson.annotations.SerializedName

const val TRANSLATION = "translation"
class Meanings(
    @SerializedName(TRANSLATION) val translation: Translation?,
    // @field:SerializedName("imageUrl") val imageUrl: String?
)