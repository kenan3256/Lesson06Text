package com.kenanhaciyev.lesson06text.DB

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.kenanhaciyev.lesson06text.DAO.ProdactDAO
import com.kenanhaciyev.lesson06text.entity.Prodact


@Database(entities = [Prodact::class], version = 1)
abstract class AppDatabase : RoomDatabase () {

    abstract fun prodactDao(): ProdactDAO

    companion object {
        private var database: AppDatabase? = null

        fun getDatabase(context: Context): AppDatabase {
            if (database != null) {
                return database!!

            } else {
                database = Room.databaseBuilder(
                    context,
                    AppDatabase::class.java,
                    "testProdactDB"
                ).build()
                return database!!
            }
        }

    }

}