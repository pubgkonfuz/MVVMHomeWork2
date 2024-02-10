package com.example.mvvmhomework2

import android.app.Application
import androidx.room.Room
import com.example.mvvmhomework2.data.local.room.dao.entities.AppDatabase
private const val DATABASE_NAME = "car-database"
class App :Application() {

    companion object  {
        lateinit var db: AppDatabase
            private set
    }

    override fun onCreate() {
        super.onCreate()
        db = Room.databaseBuilder(
            applicationContext,
            AppDatabase::class.java,
            DATABASE_NAME
        ) .allowMainThreadQueries()
            .fallbackToDestructiveMigration()
            .build()
    }

}