package com.example.cs481viewmodel

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class NoViewModel : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_no_view_model)

        var counter = 0

        findViewById<Button>(R.id.bIncNVM).setOnClickListener {
            counter ++
            findViewById<TextView>(R.id.tvNVM).text = counter.toString()
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.bIncNVM)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}