package io.github.glailton.borutoapp.di

import android.content.Context
import androidx.room.Room
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import io.github.glailton.borutoapp.data.local.BorutoDatabase
import io.github.glailton.borutoapp.data.repository.LocalDataSourceImpl
import io.github.glailton.borutoapp.domain.repository.LocalDataSource
import io.github.glailton.borutoapp.util.Constants.BORUTO_DATABASE
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {

    @Provides
    @Singleton
    fun provideDatabase(@ApplicationContext context: Context): BorutoDatabase {
        return Room.databaseBuilder(context, BorutoDatabase::class.java, BORUTO_DATABASE).build()
    }

    @Provides
    @Singleton
    fun provideLocalDataSource(data: BorutoDatabase): LocalDataSource {
        return LocalDataSourceImpl(
            borutoDatabase = data
        )
    }
}