package demidova.dictionary.view

import demidova.dictionary.AppState

interface View {
    fun renderData(appState: AppState)
}