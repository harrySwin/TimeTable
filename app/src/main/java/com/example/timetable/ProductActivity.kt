package com.example.timetable

import android.content.Intent
import android.graphics.text.TextRunShaper
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.annotation.RequiresApi

class ProductActivity : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.TIRAMISU)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product)

        val numbers = intent.getParcelableExtra<Numbers>("numbers")

        numbers?.let {
            val result = numbers.number1 * numbers.number2
            findViewById<TextView>(R.id.result).text = result.toString()
        }
    }
}