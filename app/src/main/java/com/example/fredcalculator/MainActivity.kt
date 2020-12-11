package com.example.fredcalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.*
import kotlin.math.log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var firstNumber = findViewById<TextView>(R.id.editTextNumber1)
        var secondNumber = findViewById<TextView>(R.id.editTextNumber2)
        var operators = findViewById<RadioGroup>(R.id.operators)
        var add = findViewById<RadioButton>(R.id.add)
        var subtract = findViewById<RadioButton>(R.id.subtract)
        var equals = findViewById<Button>(R.id.equals)
        var result = findViewById<TextView>(R.id.result)

        equals.setOnClickListener {

            var firstNumberValue = Integer.parseInt(firstNumber.getText().toString())
            var secondNumberValue = Integer.parseInt(secondNumber.getText().toString())

            var operatorButtonId = operators.checkedRadioButtonId

            var answer:Int? = null

            if(operatorButtonId == add.getId()){
                answer = firstNumberValue + secondNumberValue
            } else {
                answer = firstNumberValue - secondNumberValue
            }

            result.setText(answer.toString())
            Log.d("Fred", "Hello Fred.  Here's are the numbers $firstNumberValue and $secondNumberValue and $operatorButtonId and $answer")
        }

    }
}