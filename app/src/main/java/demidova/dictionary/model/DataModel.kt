package demidova.dictionary.model

import com.google.gson.annotations.SerializedName
import demidova.dictionary.domain.Meanings

const val TEXT = "text"
const val MEANINGS = "meanings"

class DataModel(
    @SerializedName(TEXT) val text: String?,
    @SerializedName(MEANINGS) val meanings: List<Meanings>?
)