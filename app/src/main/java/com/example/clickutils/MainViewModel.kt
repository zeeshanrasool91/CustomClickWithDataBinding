package com.example.clickutils

import android.util.Log
import android.view.View
import androidx.databinding.ObservableField
import androidx.databinding.ObservableInt

class MainViewModel(msg:String, num:Int, val listener:ViewModelListener) {

    val message = ObservableField(msg)
    val number = ObservableInt(num)

    fun handleClick() {
        listener.showMessage("You Clicked It!!")
    }

    fun handleClicks(view: Any?){
        val v=view as View
        Log.d("TEST_METHOD", "handleClicks: ${v.id}")
        listener.showMessage("You Clicked It With Return!!")
    }
}