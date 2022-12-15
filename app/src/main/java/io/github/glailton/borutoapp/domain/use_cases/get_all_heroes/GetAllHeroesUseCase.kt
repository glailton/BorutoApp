package io.github.glailton.borutoapp.domain.use_cases.get_all_heroes

import androidx.paging.PagingData
import io.github.glailton.borutoapp.data.repository.Repository
import io.github.glailton.borutoapp.domain.model.Hero
import kotlinx.coroutines.flow.Flow

class GetAllHeroesUseCase(
    private val repository: Repository
) {
    operator fun invoke(): Flow<PagingData<Hero>> {
        return repository.getAllHeroes()
    }
}