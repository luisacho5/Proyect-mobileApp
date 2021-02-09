package com.example.laliga

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var sco = intent.getIntExtra("sco", -1)
        if(sco>=0) {
            when(sco){

                in(0..4)->quiz_mark.text = "YOUR SCORE IN THE QUIZ IS: "+sco.toString()+"\tCome ooon you can improve ;) take a look on the teams and try again"
                in(5..7)->quiz_mark.text = "YOUR SCORE IN THE QUIZ IS: "+sco.toString()+"\tYou did good but you Can do more!!"
                in(8..9)->quiz_mark.text = "YOUR SCORE IN THE QUIZ IS: "+sco.toString()+"\tYou are really good, almost perfect try again and maybe you get the ten"
                10->quiz_mark.text = "YOUR SCORE IN THE QUIZ IS: "+sco.toString()+"\tWOW YOU ARE NOW  A MASTER OF LA LIGA CONGRATZ"
            }
        }

    }

    fun goList(view: View) {
        startActivity(Intent(this, ListTeams::class.java))
    }

    fun goQuiz(view: View) {
        startActivity(Intent(this, Quiz::class.java))
    }
}
