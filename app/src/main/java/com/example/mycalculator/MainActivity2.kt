package com.example.mycalculator

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main2)
        val num1 = findViewById<EditText>(R.id.number1)
        val num2 = findViewById<EditText>(R.id.number2)
        val btnAdd = findViewById<Button>(R.id.btnAdd)
        val result = findViewById<TextView>(R.id.result)

        btnAdd.setOnClickListener {
            val val1 = num1.text.toString().toDoubleOrNull()
            val val2 = num2.text.toString().toDoubleOrNull()

            if (val1 != null && val2 != null) {
                result.text = "Result: ${val1 + val2}"
            } else {
                result.text = "Please enter valid numbers"
            }
        }
    }
}