package com.example.quiz
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.ViewDebug
import android.widget.Button
import kotlinx.android.synthetic.main.activity_question3.*
import kotlinx.android.synthetic.main.activity_result.*
import android.R
import android.graphics.drawable.Drawable
//import androidx.core.app.ComponentActivity
//import androidx.core.app.ComponentActivity.ExtraData
import androidx.core.content.ContextCompat.getSystemService
import android.icu.lang.UCharacter.GraphemeClusterBreak.T
import androidx.core.app.ComponentActivity
import androidx.core.app.ComponentActivity.ExtraData
import androidx.core.content.ContextCompat.getSystemService
import android.icu.lang.UCharacter.GraphemeClusterBreak.T





class result_activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(com.example.quiz.R.layout.activity_result)

        val res = intent.getIntExtra("fr3", 0)
        if (res == 6) {
            textView4.text = getString(com.example.quiz.R.string.PIN)
            //imageResult.setImageDrawable(Drawable.createFromPath("drawable/pin.jpg"))
        }
        if (res == 5){
            textView4.text = getString(com.example.quiz.R.string.Losiash)
        }
        if (res == 1){
            textView4.text = getString(com.example.quiz.R.string.Barash)
        }
        if (res == 4) {
            textView4.text = getString(com.example.quiz.R.string.Kopatich)
        }
        if (res == 3){
            textView4.text = getString(com.example.quiz.R.string.Karkarich)
        }
        if (res == 2){
            textView4.text = getString(com.example.quiz.R.string.Nusha)
        }
        if (res == 0){
            textView4.text = getString(com.example.quiz.R.string.Krosh)
        }
        returnButton.setOnClickListener{
            val a = Intent(this, MainActivity::class.java)
            startActivity(a)
        }
        exitButton.setOnClickListener {
            finishAffinity()
        }

    }
}