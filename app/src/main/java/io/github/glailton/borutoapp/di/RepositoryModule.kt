package io.github.glailton.borutoapp.di

import android.content.Context
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import io.github.glailton.borutoapp.data.repository.DataStoreOperationsImpl
import io.github.glailton.borutoapp.data.repository.Repository
import io.github.glailton.borutoapp.domain.repository.DataStoreOperations
import io.github.glailton.borutoapp.domain.use_cases.UseCases
import io.github.glailton.borutoapp.domain.use_cases.get_all_heroes.GetAllHeroesUseCase
import io.github.glailton.borutoapp.domain.use_cases.read_onboarding.ReadOnBoardingUseCase
import io.github.glailton.borutoapp.domain.use_cases.save_onboarding.SaveOnBoardingUseCase
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {

    @Provides
    @Singleton
    fun provideDataStoreOperations(@ApplicationContext context: Context): DataStoreOperations {
        return DataStoreOperationsImpl(context)
    }

    @Provides
    @Singleton
    fun provideUseCases(repository: Repository): UseCases {
        return UseCases(
            saveOnBoardingUseCase = SaveOnBoardingUseCase(repository),
            readOnBoardingUseCase = ReadOnBoardingUseCase(repository),
            getAllHeroesUseCase = GetAllHeroesUseCase(repository)
        )
    }
}