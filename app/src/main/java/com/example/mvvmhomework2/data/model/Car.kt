package com.example.mvvmhomework2.data.model

import androidx.annotation.DrawableRes
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "car_table")
data class Car(
    @PrimaryKey(autoGenerate = true)var id: Int = 0 ,
    @DrawableRes val image: Int,
    @ColumnInfo("name") val name: String,
    @ColumnInfo("riderNumber") val riderNumber: String
)
