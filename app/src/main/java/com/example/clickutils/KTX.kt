package com.example.clickutils

import android.view.View

fun View.addSingleClickListenerExt(onClicked: (View?) -> Unit) {
    this.setOnClickListener(object : SingleClickListener() {
        override fun performClick(v: View?) {
            onClicked.invoke(v)
        }
    })
}


/*
fun View.singleClickMethod(callback: (v: View?) -> Unit) {
    this.setOnClickListener(object : SingleClickListener() {
        override fun performClick(v: View?) {
            callback.invoke(v)
        }
    })
}*/
