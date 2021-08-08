package com.example.clickutils

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.example.clickutils.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), ViewModelListener {
    private val TAG = "MainActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding =
            DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)
        binding.viewModel = MainViewModel("hello", 5, this@MainActivity)
        /*binding.buttonClick.setOnClickListener(object :SingleClickListener(){
            override fun performClick(v: View?) {
                Log.d(TAG, "performClick: "+"ABCD")
            }

        })*/

        /*binding.buttonClick.addSingleClickListenerExt {

        }*/

       /* binding.buttonClick.singleClickMethod {

        }
*/
    }

    override fun showMessage(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }
}