package com.example.cs481viewmodel

import androidx.lifecycle.ViewModel

class VMClass : ViewModel() {
    var counter = 0
    fun IncNumber(){
        counter++
    }
}