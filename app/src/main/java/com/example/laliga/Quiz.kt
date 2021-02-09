package com.example.laliga

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.quiz.*

class Quiz : AppCompatActivity() {
    private var q:Int=0
    private var score:Int=0
    private val nums = arrayOf(4,2,3,1,2,4,3,1,4,3)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.quiz)

        question.setText(R.string.q1)
        buttona.setText("Atletico")
        buttonb.setText("Barcelona")
        buttonc.setText("Real Madrid")
        buttond.setText("Sevilla")
        scoretext.setText("Score: 0")
    }

    fun result(v:View) {
        var answer=v.getTag().toString().toInt()
        if (answer.equals(nums[q])){
            score += 1
        }
        q += 1
        when (q) {
            1 -> {
                question.setText(R.string.q2)
                buttona.setText("Real Betis")
                buttonb.setText("Athletic Club")
                buttonc.setText("Celta de Vigo")
                buttond.setText("Sevilla")

            }
            2 -> {
                question.setText(R.string.q3)
                buttona.setText("Atletico")
                buttonb.setText("Barcelona")
                buttonc.setText("Real Madrid")
                buttond.setText("Valencia")

            }
            3 -> {
                question.setText(R.string.q4)
                buttona.setText("Zubizarreta")
                buttonb.setText("Raul")
                buttonc.setText("Messi")
                buttond.setText("Ronaldo")

            }
            4 -> {
                question.setText(R.string.q5)
                buttona.setText("Real Sociedad")
                buttonb.setText("Barcelona")
                buttond.setText("Sevilla")
                buttonc.setText("Real Madrid")


            }
            5 -> {
                question.setText(R.string.q6)
                buttona.setText("5")
                buttonb.setText("4")
                buttonc.setText("6")
                buttond.setText("7")
            }
            6 -> {
                question.setText(R.string.q7)
                buttona.setText("Atletico")
                buttonb.setText("Barcelona")
                buttonc.setText("Real Madrid")
                buttond.setText("Sevilla")

            }
            7 -> {
                question.setText(R.string.q8)
                buttona.setText("Girona")
                buttonb.setText("Cadiz")
                buttonc.setText("Huesca")
                buttond.setText("Betis")


            }
            8 -> {
                question.setText(R.string.q9)
                buttona.setText("Raul")
                buttonb.setText("Hugo Sánchez")
                buttonc.setText("C.Ronaldo")
                buttond.setText("Messi")

            }
            9 -> {
                question.setText(R.string.q10)
                buttona.setText("Premier League")
                buttonb.setText("Bundesliga")
                buttonc.setText("La Liga")
                buttond.setText("Serie A")
            }
            10->{
                var intent= Intent(this, MainActivity::class.java)
                intent.putExtra("sco",score)
                startActivity(intent)
            }

        }
        scoretext.setText("Your score: "+score)
    }

}