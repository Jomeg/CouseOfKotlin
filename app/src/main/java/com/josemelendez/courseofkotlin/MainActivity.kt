package com.josemelendez.courseofkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tvComencemos = findViewById<TextView>(R.id.tv3)

        findViewById<Button>(R.id.btn1).setOnClickListener {
            tvComencemos.visibility = View.VISIBLE

            findViewById<TextView>(R.id.tv2).text = "Tu puedes Jose!"
        }
    }
}