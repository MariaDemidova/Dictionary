package demidova.dictionary.presenter

import demidova.dictionary.AppState
import demidova.dictionary.view.View

interface Presenter<T: AppState, V: View> {
    fun attachView(view: V)

    fun detachView(view: V)

    fun getData(word: String, isOnline: Boolean)
}