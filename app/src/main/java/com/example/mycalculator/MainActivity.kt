package com.example.mycalculator

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val input1 = findViewById<EditText>(R.id.num1)
        val input2 = findViewById<EditText>(R.id.num2)

        //for buttons
        val addBtn = findViewById<Button>(R.id.sum)
        val subBtn = findViewById<Button>(R.id.sub)
        val mulBtn = findViewById<Button>(R.id.mul)
        val divBtn = findViewById<Button>(R.id.div)


        val result = findViewById<TextView>(R.id.result)

        addBtn.setOnClickListener {
            val num1 = input1.text.toString().toDoubleOrNull()
            val num2 = input2.text.toString().toDoubleOrNull()
            if(num1 != null && num2 != null ){
                result.text = "Result : ${num1 + num2}"
            }else
                result.text = "Invalid input"
        }

        subBtn.setOnClickListener {
            val num1 = input1.text.toString().toDoubleOrNull()
            val num2 = input2.text.toString().toDoubleOrNull()

            if(num1 != null && num2 != null){
                result.text = "Result : ${num1 - num2}"
            }else
                result.text = "Invalid input"
        }
        mulBtn.setOnClickListener {
            val num1 = input1.text.toString().toDoubleOrNull()
            val num2 = input2.text.toString().toDoubleOrNull()

            if(num1 != null && num2 != null){
                result.text = "Result : ${num1 * num2}"
            }else
                result.text = "Invalid input"
        }
        divBtn.setOnClickListener {
            val num1 = input1.text.toString().toDoubleOrNull()
            val num2 = input2.text.toString().toDoubleOrNull()

            if(num1 != null && num2 != null){
                result.text = "Result : ${num1 / num2}"
            }else
                result.text = "Invalid input"
        }
    }
}