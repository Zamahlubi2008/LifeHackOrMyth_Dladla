package com.example.lifehackormyth

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

//MainActivity= Welcome Screen
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //Connects this activity_main.xml
        setContentView(R.layout.activity_main)

        //Start button navigation
        val btnStart =findViewById<Button>(R.id.btnStart)

        btnStart.setOnClickListener {
            val intent = Intent (this, QuizActivity::class.javaClass)
            btnStart
        }

    }
}