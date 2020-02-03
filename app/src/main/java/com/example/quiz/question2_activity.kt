package com.example.quiz
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.ViewDebug
import android.widget.Button
import kotlinx.android.synthetic.main.activity_question2.*
import kotlinx.android.synthetic.main.activity_question3.*

class question2_activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question2)
        var count = 0
        val from1 = intent.getIntExtra("res", 0)

        count += from1
        BallButton.setOnClickListener{
            count += 0
            perenos (count)
        }
        planeButton.setOnClickListener{
            count += 2
            perenos (count)
        }
        pumButton.setOnClickListener{
            count += 1
            perenos (count)
        }
    }
    fun perenos (otdaem:Int){
        val b = otdaem
        val a  = Intent(this, question_activity3::class.java)
        a.putExtra("fr2",b)
        startActivity(a)
    }
}