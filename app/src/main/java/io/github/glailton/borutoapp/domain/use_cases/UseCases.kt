package io.github.glailton.borutoapp.domain.use_cases

import io.github.glailton.borutoapp.domain.use_cases.get_all_heroes.GetAllHeroesUseCase
import io.github.glailton.borutoapp.domain.use_cases.read_onboarding.ReadOnBoardingUseCase
import io.github.glailton.borutoapp.domain.use_cases.save_onboarding.SaveOnBoardingUseCase
import io.github.glailton.borutoapp.domain.use_cases.search_heroes.SearchHeroesUseCase

data class UseCases(
    val saveOnBoardingUseCase: SaveOnBoardingUseCase,
    val readOnBoardingUseCase: ReadOnBoardingUseCase,
    val getAllHeroesUseCase: GetAllHeroesUseCase,
    val searchHeroesUseCase: SearchHeroesUseCase,
)
