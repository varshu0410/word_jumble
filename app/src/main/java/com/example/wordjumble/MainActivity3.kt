package com.example.wordjumble

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        val clueprint=findViewById<TextView>(R.id.clueans)
        val ok = findViewById<Button>(R.id.okay)

        val clueans = intent.getStringExtra("frclue")

        clueprint.text=clueans+("")


        ok.setOnClickListener(View.OnClickListener {
            startActivity(Intent(this,MainActivity2::class.java))})
    }
}