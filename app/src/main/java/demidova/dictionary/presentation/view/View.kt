package demidova.dictionary.presentation.view

import demidova.dictionary.AppState

interface View {
    fun renderData(appState: AppState)
}