package demidova.dictionary.model

import com.google.gson.annotations.SerializedName
import demidova.dictionary.domain.Meanings

class DataModel(
    @SerializedName("text") val text: String?,
    @SerializedName("meanings") val meanings: List<Meanings>?
)