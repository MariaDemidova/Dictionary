package demidova.dictionary.domain

import com.google.gson.annotations.SerializedName

class Meanings(
    @SerializedName("translation") val translation: Translation?,
    // @field:SerializedName("imageUrl") val imageUrl: String?
)