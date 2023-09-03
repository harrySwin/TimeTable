package com.example.timetable

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val numbers = Numbers(
            Random.nextInt(from = 1, until = 13),
            Random.nextInt(from = 1, until = 13))

        findViewById<TextView>(R.id.number1).text = numbers.number1.toString()
        findViewById<TextView>(R.id.number2).text = numbers.number2.toString()

        val equals = findViewById<Button>(R.id.equals)
        equals.setOnClickListener {
            val intent = Intent(this, ProductActivity::class.java).apply {
                putExtra("numbers", numbers)
            }
            startActivity(intent)
        }

    }
}