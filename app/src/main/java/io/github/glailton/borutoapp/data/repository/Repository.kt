package io.github.glailton.borutoapp.data.repository

import androidx.paging.PagingData
import io.github.glailton.borutoapp.domain.model.Hero
import io.github.glailton.borutoapp.domain.repository.DataStoreOperations
import io.github.glailton.borutoapp.domain.repository.RemoteDataSource
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class Repository @Inject constructor(
    private val remote: RemoteDataSource,
    private val dataStore: DataStoreOperations
) {
    fun getAllHeroes(): Flow<PagingData<Hero>> {
        return remote.getAllHeroes()
    }

//    fun searchHeroes(query: String): Flow<PagingData<Hero>> {
//        return remote.searchHeroes(query = query)
//    }

    suspend fun saveOnBoardingState(completed: Boolean){
        dataStore.saveOnBoardingState(completed)
    }

    fun readOnBoardingState(): Flow<Boolean>{
        return dataStore.readOnBoardingState()
    }
}