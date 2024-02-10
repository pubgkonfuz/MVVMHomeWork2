package com.example.mvvmhomework2.data.local.room.dao.entities

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.mvvmhomework2.data.local.room.dao.CarDao
import com.example.mvvmhomework2.data.model.Car

@Database(entities = [Car::class], version = 2, exportSchema = false)
abstract class AppDatabase : RoomDatabase() {
    abstract fun CarDao(): CarDao
}