package com.abdykadyr.mathviewtestproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.abdykadyr.mathviewtestproject.databinding.ActivityMainBinding

    lateinit var binding: ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val text = "$$ c = \\pm\\sqrt{a^3 + b^2} $$"
        binding.katexText.setText(text)
    }
}