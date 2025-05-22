package com.ucb.testmovdos.home

import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.State
import androidx.lifecycle.ViewModel

class HomeViewModel : ViewModel() {
    private val _message = mutableStateOf("Hola, UCB mobile, preciso su ayuda")
    val message: State<String> = _message

    val phoneNumber = "59160498335"
}