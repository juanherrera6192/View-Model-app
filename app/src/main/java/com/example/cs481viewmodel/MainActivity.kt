package com.example.cs481viewmodel

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.bIncVM).setOnClickListener {
            startActivity(Intent(this, NoViewModel::class.java))
        }

        findViewById<Button>(R.id.bVM).setOnClickListener {
            startActivity(Intent(this, ViewModel::class.java))
        }

        findViewById<Button>(R.id.bLD).setOnClickListener {
            startActivity(Intent(this, LiveData::class.java))
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.bIncNVM)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}