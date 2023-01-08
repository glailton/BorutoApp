package io.github.glailton.borutoapp.data.repository

import io.github.glailton.borutoapp.data.local.BorutoDatabase
import io.github.glailton.borutoapp.domain.model.Hero
import io.github.glailton.borutoapp.domain.repository.LocalDataSource

class LocalDataSourceImpl(borutoDatabase: BorutoDatabase): LocalDataSource {

    private val heroDao = borutoDatabase.heroDao()

    override suspend fun getSelectedHero(heroId: Int): Hero {
        return heroDao.getSelectedHero(heroId)
    }
}