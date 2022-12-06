package io.github.glailton.borutoapp.domain.use_cases

import io.github.glailton.borutoapp.domain.use_cases.read_onboarding.ReadOnBoardingUseCase
import io.github.glailton.borutoapp.domain.use_cases.save_onboarding.SaveOnBoardingUseCase

data class UseCases(
    val saveOnBoardingUseCase: SaveOnBoardingUseCase,
    val readOnBoardingUseCase: ReadOnBoardingUseCase
)
