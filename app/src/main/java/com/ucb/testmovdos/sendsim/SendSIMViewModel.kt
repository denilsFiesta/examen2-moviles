package com.ucb.testmovdos.sendsim

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

class SendSIMViewModel : ViewModel() {

    private val _phone = MutableStateFlow("")
    val phone = _phone.asStateFlow()

    private val _latitude = MutableStateFlow("")
    val latitude = _latitude.asStateFlow()

    private val _longitude = MutableStateFlow("")
    val longitude = _longitude.asStateFlow()

    fun onPhoneChange(newValue: String) {
        _phone.value = newValue
    }

    fun onLatitudeChange(newValue: String) {
        _latitude.value = newValue
    }

    fun onLongitudeChange(newValue: String) {
        _longitude.value = newValue
    }

}