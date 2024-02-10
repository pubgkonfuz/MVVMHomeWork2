package com.example.mvvmhomework2.ui.models

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.mvvmhomework2.data.repositories.Car3Repository
import com.example.mvvmhomework2.data.model.Car
import com.example.mvvmhomework2.utils.UiState

class Car3ViewModel : ViewModel() {

    private val _carsLiveData = MutableLiveData<UiState<List<Car>>>()
    val carLiveData: LiveData<UiState<List<Car>>> = _carsLiveData
    private val car3Repository =  Car3Repository()

    init {
        getCars()
    }

    fun getCars() {
        _carsLiveData.value = UiState(isLoading = false, success =  car3Repository.getCar())
    }

    fun addBleach(car: Car) {
        car3Repository.addCar(car)
    }
}