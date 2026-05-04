package com.example.lifehackormyth

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ScoreActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_score)

        val txtScore =findViewById<TextView>(R.id.txtScore)
        val txtFeedback=findViewById<TextView>(R.id.txtFeedback)
        val btnReview =findViewById<TextView>(R.id.btnReview)

        val score =intent.getIntExtra("score",0)
        val totalQuestions =15

        txtScore.text = getString(R.string.your_score, score, totalQuestions)

        when {
            score >= 12 -> {
                "Good job!"
            }
            score >= 8 -> {
                "You're getting there!"
            }
            else ->{
                "Keep on trying"
            }
        }


        }

    }
