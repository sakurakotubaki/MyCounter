package com.example.mycounter

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import kotlin.math.roundToInt

// MVVMを使用するには、ViewModelクラスを継承する必要があります。
class MyViewModel(): ViewModel(){
    var result by mutableStateOf(0)

    fun convertTemp(tempF: Int) {
        result = ((tempF -32) * 0.555).roundToInt()
    }

}