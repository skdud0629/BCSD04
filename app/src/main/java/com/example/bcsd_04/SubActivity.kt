package com.example.bcsd_04

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SubActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sub)

        val TEXT_range : TextView = findViewById<TextView>(R.id.TEXT_range)
        val COUNT_view : TextView = findViewById<TextView>(R.id.COUNT_view)
        val number = intent.getStringExtra("num").toString()
        val ran= (0..number.toInt())
        val random_num=ran.random()

        TEXT_range.text = "Here is a random number between 0 and " + number
        COUNT_view.text=random_num.toString()

        //Here is a random number between 0 and
    }
}