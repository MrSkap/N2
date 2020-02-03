package com.example.quiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.CheckBox
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_question.*
import kotlinx.android.synthetic.main.activity_question3.*

class question1_activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question)
        //прибавляем 0
        checkBox3.setOnClickListener{
            perenos(0)
        }
        //прибвляем 1
        checkBox8.setOnClickListener{
            perenos(1)
        }
        //прибавляем 2
        checkBox7.setOnClickListener{
            perenos(2)
        }

    }
    fun perenos (otdaem:Int){
        val b = otdaem
        val a  = Intent(this, question2_activity::class.java)
        a.putExtra("res",b)
        startActivity(a)
    }



}