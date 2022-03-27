package demidova.dictionary.dataSource

import demidova.dictionary.model.DataModel

import io.reactivex.Observable

class RoomDataBaseImpl : DataSource<List<DataModel>> {

    override fun getData(word: String): Observable<List<DataModel>> {
        TODO("not implemented")
    }
}
