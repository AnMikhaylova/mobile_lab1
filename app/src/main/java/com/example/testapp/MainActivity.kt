package com.example.testapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val numbers = findViewById(R.id.numbersText) as TextView
        val average = findViewById(R.id.averageText) as TextView

        val updatebtn = findViewById(R.id.updateButton) as Button
        val resultbtn = findViewById(R.id.resultButton) as Button

        val result = findViewById(R.id.resultText) as TextView

        val logic = Logic()

        numbers.setText(logic.numbers.joinToString())
        average.setText(logic.numbers.average().toInt().toString())

        updatebtn.setOnClickListener{
            logic.updateNumbers()
            numbers.setText(logic.numbers.joinToString())
            average.setText(logic.numbers.average().toInt().toString())
        }

        resultbtn.setOnClickListener {
            val res = logic.numOfElem()
            result.setText(res.toString())
        }

    }
}