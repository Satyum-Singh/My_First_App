package com.example.myfirstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val welBtn = findViewById<Button>(R.id.greet)
        val welText = findViewById<TextView>(R.id.hola)
        var count = 0
        welBtn.setOnClickListener{
            count += 1
            welText.text = count.toString()
            Toast.makeText(this,"Hey, I'm your assistant.",Toast.LENGTH_LONG).show()
        }
    }
}