package com.example.quiz
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.ViewDebug
import android.widget.Button
import kotlinx.android.synthetic.main.activity_question2.*
import kotlinx.android.synthetic.main.activity_question3.*

class question_activity3 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question3)

        var count = 0
        count = intent.getIntExtra("fr2", 0)
        checkBox1.setOnClickListener{
            count += 0
            perenos (count)
        }
        checkBox2.setOnClickListener{
            count += 2
            perenos (count)
        }
        checkBox0.setOnClickListener{
            count += 1
            perenos (count)
        }
    }
    fun perenos (otdaem:Int){
        val b = otdaem
        val a  = Intent(this, result_activity::class.java)
        a.putExtra("fr3",b)
        startActivity(a)
    }

}