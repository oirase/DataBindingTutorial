package com.example.databindingtutorial

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.databindingtutorial.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        val binding: ActivityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)
            //binding.sampleTextView.text = "Hello Binding"
            binding.sampleButton.setOnClickListener {
                binding.sampleTextView.text = "Hello Binding"
            }
    }
}