package demidova.dictionary.domain

import com.google.gson.annotations.SerializedName

const val TEXT = "text"
class Translation(@SerializedName(TEXT) val translation: String?)
