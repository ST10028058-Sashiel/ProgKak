package com.example.progkak

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat



class MainActivity : AppCompatActivity() {

    private lateinit var btnOne : Button
    private lateinit var ValOne : EditText
    private lateinit var ValTwo : EditText
    private lateinit var Result : TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnOne = findViewById(R.id.button)
        ValOne = findViewById(R.id.edtTextVal1)
        ValTwo = findViewById(R.id.edtTextVal2)
        Result = findViewById(R.id.textView)

        btnOne.setOnClickListener {
            val num1 = ValOne.text.toString().toDoubleOrNull() ?: 0.0
            val num2 = ValTwo.text.toString().toDoubleOrNull() ?: 0.0
            val sum = num1 + num2
            Result.text = "Result: $sum"
        }


    }
}






