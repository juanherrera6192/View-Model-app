package com.example.cs481viewmodel

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.lifecycle.ViewModelProvider

open class ViewModel : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_view_model)

        val viewModel = ViewModelProvider(this).get(VMClass::class.java)

        findViewById<TextView>(R.id.tvVM).text = viewModel.counter.toString()

        findViewById<Button>(R.id.bIncVM).setOnClickListener {
            viewModel.IncNumber()
           findViewById<TextView>(R.id.tvVM).text = viewModel.counter.toString()
        }

    }
}


