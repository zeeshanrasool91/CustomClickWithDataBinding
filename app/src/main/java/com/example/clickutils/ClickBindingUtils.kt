package com.example.clickutils


import android.view.View
import androidx.databinding.BindingAdapter

class ClickBindingUtils {
    companion object {
        @JvmStatic
        @BindingAdapter("onSingleClickWithReturn")
        fun singleClickMethod(view: View?, callback: (Any?) -> Unit) {
            view?.setOnClickListener(object : SingleClickListener() {
                override fun performClick(v: View?) {
                    callback.invoke(v)
                }
            })
        }

        @JvmStatic
        @BindingAdapter("onSingleClick")
        fun singleClickMethod(view: View?, callback: () -> Unit) {
            view?.setOnClickListener(object : SingleClickListener() {
                override fun performClick(v: View?) {
                    callback.invoke()
                }
            })
        }
    }
}