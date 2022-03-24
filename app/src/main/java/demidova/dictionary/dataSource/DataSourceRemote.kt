package demidova.dictionary.dataSource

import demidova.dictionary.model.DataModel
import io.reactivex.Observable

class DataSourceRemote (private val remoteProvider: RetrofitImpl = RetrofitImpl()) :
    DataSource<List<DataModel>> {

    override fun getData(word: String): Observable<List<DataModel>> = remoteProvider.getData(word)
}
