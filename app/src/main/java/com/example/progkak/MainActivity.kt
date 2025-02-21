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
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

       btnOne = findViewById(R.id.button)
        ValOne = findViewById(R.id.edtTextVal1)
        ValTwo = findViewById(R.id.edtTextVal2)
        Result = findViewById(R.id.textView)

//
//       val int Num1 = ValOne
//     val int Num2 = ValTwo



    }


    private fun add(Num1:Int ,Num2 :Int ){
        val Result = Num1+Num2


    }

}