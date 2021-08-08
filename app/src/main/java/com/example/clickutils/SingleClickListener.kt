package com.example.clickutils

import android.os.SystemClock
import android.view.View

abstract class SingleClickListener @JvmOverloads constructor(private var defaultInterval: Int = 1000) : View.OnClickListener {
    private var lastTimeClicked: Long = 0

    override fun onClick(v: View?) {
        if (SystemClock.elapsedRealtime() - lastTimeClicked < defaultInterval) {
            return
        }
        lastTimeClicked = SystemClock.elapsedRealtime()
        performClick(v)
    }

    abstract fun performClick(v: View?)

}