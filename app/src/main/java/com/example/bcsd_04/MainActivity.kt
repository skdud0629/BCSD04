package com.example.bcsd_04

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast





class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var TOAST_button : Button = findViewById(R.id.TOAST_button)
        var COUNT_button : Button = findViewById(R.id.COUNT_button)
        var RANDOM_button : Button = findViewById(R.id.RANDOM_button)
        val output_text : TextView= findViewById<TextView>(R.id.COUNT_view)
        var num=0;

        TOAST_button.setOnClickListener{
            Toast.makeText(this@MainActivity,"Toast message",Toast.LENGTH_SHORT).show()
        }

        COUNT_button.setOnClickListener{
            num++
            output_text.setText(num.toString())

        }

        RANDOM_button.setOnClickListener{
            val intent = Intent(this,SubActivity::class.java)
            intent.putExtra("num", num.toString())
            startActivity(intent)
        }

    }

}