package com.example.mvvmhomework2.data.repositories

import com.example.mvvmhomework2.R
import com.example.mvvmhomework2.data.models.Car

class Car3Repository {
     private val cars = mutableListOf(
        Car(R.drawable.shtorm,"Шторм", "20"),
        Car(R.drawable.makvin,"Маквин","95")
    )

    fun addCar(car: Car){
        cars.add(car)
    }

    fun getCar() = cars

}