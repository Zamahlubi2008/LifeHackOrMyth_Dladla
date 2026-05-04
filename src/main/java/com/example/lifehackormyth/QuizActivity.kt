package com.example.lifehackormyth

import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

//Data for question
data class Question(
    val text: String,
    val answer: Boolean,
    val explanation: String
)

class QuizActivity: AppCompatActivity (){
    private lateinit var txtQuestion: TextView
    private lateinit var txtFeedback: TextView
    private lateinit var btnTrue: Button
    private lateinit var btnNext: Button

    private var currentIndex =0
    private var score =0

    private val questions =listOf(

        Question("Rice can fix water damaged phones",false, "Rice cannot fix water damaged phones"),
        Question("Chewing gum can improve focus",true, "It does help with concentration"),
        Question("Taking breaks improves productivity",true, "Breaks help the brain to rest"),
        Question("Sugar causes hyperactivity",false, "No scientific proof"),
        Question("Writing things down improves memory" ,true, "It strengthens recall"),
        Question("Energy drinks provide bodies with long lasting energy" ,false,"They cause crashes later"),
        Question("Humans only use 10% of their brains" ,false, "We use most of our brains"),
        Question("Laughter improves health" ,true, "It reduces stress and boosts mood"),
        Question("Stretching before exercise is always best" ,false,"Warm-ups are best"),
        Question("Music can improve focus",true, "It helps some people concentrate"),
        Question("Dark mode saves battery",true,"Especially on OLED screens"),
        Question("Phone radiation is proven harmful",false, "No strong scientific proof"),
        Question("Exercise improves mental health",true,"Reduces depression and anxiety"),
        Question("Carrots give perfect vision",false,"This is a  myth"),
        Question("Everyone needs 8 glasses of water daily",false,"Hydration is vary"),


        )
        }

