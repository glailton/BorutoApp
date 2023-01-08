package io.github.glailton.borutoapp.domain.use_cases.get_selected_hero

import io.github.glailton.borutoapp.data.repository.Repository
import io.github.glailton.borutoapp.domain.model.Hero

class GetSelectedHeroUseCase(
    private val repository: Repository
) {
    suspend operator fun invoke(heroId: Int): Hero {
        return repository.getSelectedHero(heroId)
    }
}