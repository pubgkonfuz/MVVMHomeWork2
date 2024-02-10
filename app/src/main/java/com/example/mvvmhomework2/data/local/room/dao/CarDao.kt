package com.example.mvvmhomework2.data.local.room.dao
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import com.example.mvvmhomework2.data.model.Car

@Dao
interface CarDao {
    //Получение всех даных:
    @Query("SELECT * FROM car_table")
    fun getAllCars(): List<Car>

    //Добавление:
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun addCar(car: Car)
    //Обновить данные:
    @Update
    fun updateCar(car: Car)

    //Удаление база данных:
    @Delete
    fun deleteCar(car: Car)

}