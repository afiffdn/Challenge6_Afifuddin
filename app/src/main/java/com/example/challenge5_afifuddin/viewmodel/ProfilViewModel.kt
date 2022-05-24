package com.example.challenge5_afifuddin.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.challenge5_afifuddin.model.User

class ProfilViewModel : ViewModel() {
    val userData : MutableLiveData<User> = MutableLiveData()
    fun dataUser(userEntity: User){
        userData.postValue(userEntity)
    }
}