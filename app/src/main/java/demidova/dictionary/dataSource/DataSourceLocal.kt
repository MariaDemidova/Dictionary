package demidova.dictionary.dataSource

import demidova.dictionary.model.DataModel
import io.reactivex.Observable

class DataSourceLocal (private val remoteProvider: RoomDataBaseImpl = RoomDataBaseImpl()) :
    DataSource<List<DataModel>> {

    override fun getData(word: String): Observable<List<DataModel>> = remoteProvider.getData(word)
}