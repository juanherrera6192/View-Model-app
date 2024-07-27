package com.example.cs481viewmodel

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.lifecycle.ViewModelProvider

class LiveData : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_live_date)

        val viewModel = ViewModelProvider(this).get(LDClass::class.java)

        viewModel.counter.observe(this, {
            findViewById<TextView>(R.id.tvLD).text = it.toString()

        })

        findViewById<Button>(R.id.bINCLD)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.bIncNVM)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}