package com.example.mvvmhomework2.data.models

import androidx.annotation.DrawableRes

data class Car(
    @DrawableRes
    val image: Int,
    val name: String,
    val riderNumber: String
)
