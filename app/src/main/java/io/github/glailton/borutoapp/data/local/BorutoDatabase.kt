package io.github.glailton.borutoapp.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import io.github.glailton.borutoapp.data.local.dao.HeroDao
import io.github.glailton.borutoapp.data.local.dao.HeroRemoteKeysDao
import io.github.glailton.borutoapp.domain.model.Hero
import io.github.glailton.borutoapp.domain.model.HeroRemoteKeys

@Database(entities = [Hero::class, HeroRemoteKeys::class], version = 1)
@TypeConverters(DatabaseConverter::class)
abstract class BorutoDatabase : RoomDatabase() {
    abstract fun heroDao(): HeroDao
    abstract fun heroRemoteKeysDao(): HeroRemoteKeysDao
}