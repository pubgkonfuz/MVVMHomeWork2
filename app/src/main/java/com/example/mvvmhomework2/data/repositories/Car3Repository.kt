package com.example.mvvmhomework2.data.repositories

import com.example.mvvmhomework2.App
import com.example.mvvmhomework2.R
import com.example.mvvmhomework2.data.model.Car

class Car3Repository {
     private val cars = mutableListOf(
        Car(0,R.drawable.shtorm,"Шторм", "20"),
        Car(1,R.drawable.makvin,"Маквин","95")
    )

    fun addCar(car: Car){
        App.db.CarDao().addCar(car)

    }

    fun getCar() = App.db.CarDao().getAllCars()

}