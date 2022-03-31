package demidova.dictionary.presentation.view

import androidx.appcompat.app.AppCompatActivity
import demidova.dictionary.AppState
import demidova.dictionary.presentation.viewModels.BaseViewModel

abstract class BaseActivity<T : AppState> : AppCompatActivity() {

    abstract val model: BaseViewModel<T>

    abstract fun renderData(appState: T)
}