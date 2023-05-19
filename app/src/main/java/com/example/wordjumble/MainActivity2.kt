package com.example.wordjumble

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import android.widget.Toast

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val info = findViewById<ImageButton>(R.id.info)
        val fill = findViewById<TextView>(R.id.fillWord)
        val but1 = findViewById<Button>(R.id.b1)
        val but2 = findViewById<Button>(R.id.b2)
        val but3 = findViewById<Button>(R.id.b3)
        val but4 = findViewById<Button>(R.id.b4)
        val but5 = findViewById<Button>(R.id.b5)
        val but6 = findViewById<Button>(R.id.b6)
        val but7 = findViewById<Button>(R.id.b7)
        val but8 = findViewById<Button>(R.id.b8)
        val but9 = findViewById<Button>(R.id.b9)
        val but10 = findViewById<Button>(R.id.b10)
        val but11 = findViewById<Button>(R.id.b11)
        val but12 = findViewById<Button>(R.id.b12)
        val but13 = findViewById<Button>(R.id.b13)
        val but14 = findViewById<Button>(R.id.b14)
        val but15 = findViewById<Button>(R.id.b15)
        val but16 = findViewById<Button>(R.id.b16)
        val restart = findViewById<Button>(R.id.reset)
        val check = findViewById<Button>(R.id.check)

        val frword = intent.getStringExtra("word")
        val frclue = intent.getStringExtra("clue")

        val wordfr = frword.toString()
        val array:Array<String> = wordfr.toCharArray().map { it.toString() }.toTypedArray()

        val butname = arrayOf(but1,but2,but3,but4,but5,but6,but7,but8,but9,but10,but11,but12,but13,but14,but15,but16)

        for(i in array){
            var k = RandomUnrepeated(0,16)
            var m = k.nextInt()
            val j = butname[m]
            if(j.text.toString().isEmpty()) {
                j.setText(i)}

        }
        val letters= arrayOf("A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z")
        val remlet = letters.filterNot { it in array }.toTypedArray()

        for(i in butname){
            var k = RandomUnrepeated(0,16)
            var m = k.nextInt()
            if(i.text.toString().isEmpty()) {
                i.setText(remlet[m])
            }
        }

        but1.setOnClickListener(View.OnClickListener {
            val cache = fill.text.toString()
            val but = but1.text.toString()
            fill.setText(cache+but)
        })

        but2.setOnClickListener(View.OnClickListener {
            val cache = fill.text.toString()
            val but = but2.text.toString()
            fill.setText(cache+but)
        })

        but3.setOnClickListener(View.OnClickListener {
            val cache = fill.text.toString()
            val but = but3.text.toString()
            fill.setText(cache+but)
        })

        but4.setOnClickListener(View.OnClickListener {
            val cache = fill.text.toString()
            val but = but4.text.toString()
            fill.setText(cache+but)
        })

        but5.setOnClickListener(View.OnClickListener {
            val cache = fill.text.toString()
            val but = but5.text.toString()
            fill.setText(cache+but)
        })

        but6.setOnClickListener(View.OnClickListener {
            val cache = fill.text.toString()
            val but = but6.text.toString()
            fill.setText(cache+but)
        })

        but7.setOnClickListener(View.OnClickListener {
            val cache = fill.text.toString()
            val but = but7.text.toString()
            fill.setText(cache+but)
        })

        but8.setOnClickListener(View.OnClickListener {
            val cache = fill.text.toString()
            val but = but8.text.toString()
            fill.setText(cache+but)
        })

        but9.setOnClickListener(View.OnClickListener {
            val cache = fill.text.toString()
            val but = but9.text.toString()
            fill.setText(cache+but)
        })

        but10.setOnClickListener(View.OnClickListener {
            val cache = fill.text.toString()
            val but = but10.text.toString()
            fill.setText(cache+but)
        })

        but11.setOnClickListener(View.OnClickListener {
            val cache = fill.text.toString()
            val but = but11.text.toString()
            fill.setText(cache+but)
        })

        but12.setOnClickListener(View.OnClickListener {
            val cache = fill.text.toString()
            val but = but12.text.toString()
            fill.setText(cache+but)
        })

        but13.setOnClickListener(View.OnClickListener {
            val cache = fill.text.toString()
            val but = but13.text.toString()
            fill.setText(cache+but)
        })

        but14.setOnClickListener(View.OnClickListener {
            val cache = fill.text.toString()
            val but = but14.text.toString()
            fill.setText(cache+but)
        })

        but15.setOnClickListener(View.OnClickListener {
            val cache = fill.text.toString()
            val but = but15.text.toString()
            fill.setText(cache+but)
        })

        but16.setOnClickListener(View.OnClickListener {
            val cache = fill.text.toString()
            val but = but16.text.toString()
            fill.setText(cache+but)
        })

        restart.setOnClickListener(View.OnClickListener { fill.setText("") })

        info.setOnClickListener(View.OnClickListener { startActivity(
            Intent(this,MainActivity3::class.java)
                .putExtra("frclue",frclue.toString())
        ) })

        check.setOnClickListener(View.OnClickListener {
            val tyword = fill.text.toString()
            var a=1
            if(tyword==frword){
                startActivity(
                    Intent(this,MainActivity4::class.java)
                        .putExtra("a",a.toInt()))
            }
            else{
                if(a<=3) {
                    Toast.makeText(this, "Try Again", Toast.LENGTH_SHORT).show()
                    a=a+1
                }
                else{
                    startActivity(Intent(this,MainActivity4::class.java))
                }
            }})


    }
}

class RandomUnrepeated(from:Int,to:Int){
    private var numbers = (from..to).toMutableList()
    fun nextInt():Int{
        var index = kotlin.random.Random.nextInt(numbers.size)
        var number = numbers[index]
        numbers.removeAt(index)
        return number
    }
}