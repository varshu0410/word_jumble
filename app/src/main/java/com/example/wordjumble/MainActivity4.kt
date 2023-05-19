package com.example.wordjumble

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import android.widget.Toast

class MainActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)
        val plagain=findViewById<Button>(R.id.playagain)
        val scores = findViewById<TextView>(R.id.score)
        val over = findViewById<TextView>(R.id.over)

        val a = intent.getIntExtra("a",1)
        if(a==1){
            scores.setText("Your Score is 500")
        }
        if(a==2){
            scores.setText("Your Score is 400")
        }
        if(a==3){
            scores.setText("Your Score is 300")

            if(a>3)
                scores.setText("You Lost 3 lives")
        }


        plagain.setOnClickListener(View.OnClickListener {
            startActivity(Intent(this,MainActivity::class.java))})

    }
}



