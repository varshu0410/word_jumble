package com.example.wordjumble

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val title = findViewById<TextView>(R.id.title)
        val heading = findViewById<TextView>(R.id.textView)
        val word = findViewById<EditText>(R.id.word)
        val headtwo = findViewById<TextView>(R.id.textView2)
        val start = findViewById<Button>(R.id.button)
        val clue = findViewById<EditText>(R.id.clue)

        val intent = Intent(this, MainActivity3::class.java)
        intent.putExtra("CLUEANS",clue.text.toString())
        start.setOnClickListener(View.OnClickListener {
            if((TextUtils.isEmpty(word.text.toString()))or( TextUtils.isEmpty(clue.text.toString()))){
                Toast.makeText(this, "Enter the fields", Toast.LENGTH_SHORT).show()
            }
            else{
                startActivity(
                    Intent(this,MainActivity2::class.java)
                    .putExtra("word",word.text.toString())
                    .putExtra("clue",clue.text.toString()))}

        })
    }
}

