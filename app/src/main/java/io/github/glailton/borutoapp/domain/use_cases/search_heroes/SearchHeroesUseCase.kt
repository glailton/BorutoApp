package io.github.glailton.borutoapp.domain.use_cases.search_heroes

import androidx.paging.PagingData
import io.github.glailton.borutoapp.data.repository.Repository
import io.github.glailton.borutoapp.domain.model.Hero
import kotlinx.coroutines.flow.Flow

class SearchHeroesUseCase(
    private val repository: Repository
) {
    operator fun invoke(query: String): Flow<PagingData<Hero>> {
        return repository.searchHeroes(query = query)
    }
}