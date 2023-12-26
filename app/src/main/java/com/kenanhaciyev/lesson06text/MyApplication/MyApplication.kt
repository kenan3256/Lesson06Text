package com.kenanhaciyev.lesson06text.MyApplication

import android.app.Application
import com.kenanhaciyev.lesson06text.DB.AppDatabase
import com.kenanhaciyev.repository.ProdactRepository

class MyApplication : Application () {
    val database by lazy { AppDatabase.getDatabase(this) }
    val repository by lazy { ProdactRepository(database.prodactDao()) }

    override fun onCreate() {
        super.onCreate()
    }

    override fun onTerminate() {
        super.onTerminate()
    }

}
