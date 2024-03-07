package com.example.android.rgeneratorkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private lateinit var minimumInput: EditText
    private lateinit var maximumInput: EditText
    private lateinit var resultLabel: TextView
    private lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Подготовка экрана к показу
        minimumInput = findViewById(R.id.minEditText)
        maximumInput = findViewById(R.id.maxEditText)
        resultLabel = findViewById(R.id.resultText)
        button = findViewById(R.id.button)

        val toast = Toast.makeText(this@MainActivity, "Введите числа", Toast.LENGTH_LONG)
        toast.setGravity(Gravity.CENTER, 0, 0)
        toast.show()

        button.setOnClickListener {

            val minimumResult = Integer.parseInt(minimumInput.text.toString())
            val maximumResult = Integer.parseInt(maximumInput.text.toString())
            //Если буквы, показать Toast()
            //При открытии мин / макс показать цифровую клавиатуру
            val result = (minimumResult..maximumResult).random()
            resultLabel.text = result.toString()
        }

    }
}