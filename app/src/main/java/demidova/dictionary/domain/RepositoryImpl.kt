package demidova.dictionary.domain

import demidova.dictionary.model.DataModel
import demidova.dictionary.dataSource.DataSource
import io.reactivex.Observable

class RepositoryImpl (private val dataSource: DataSource<List<DataModel>>) :
    Repository<List<DataModel>> {

    override fun getData(word: String): Observable<List<DataModel>> {
        return dataSource.getData(word)
    }
}