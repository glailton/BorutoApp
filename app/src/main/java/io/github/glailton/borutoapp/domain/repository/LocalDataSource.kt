package io.github.glailton.borutoapp.domain.repository

import io.github.glailton.borutoapp.domain.model.Hero

interface LocalDataSource {
    suspend fun getSelectedHero(heroId: Int): Hero
}