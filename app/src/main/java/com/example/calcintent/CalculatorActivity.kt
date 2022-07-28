package com.example.calcintent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class CalculatorActivity : AppCompatActivity() {
    lateinit var Buttonadd:Button
    lateinit var ButtonSub:Button
    lateinit var ButtonMult:Button
    lateinit var ButtonDivide:Button
    lateinit var firstnumber:EditText
    lateinit var secondnumber:EditText
    lateinit var textanswer:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator)
        Buttonadd=findViewById(R.id.btn_add)
        ButtonSub=findViewById(R.id.btn_subtract)
        ButtonMult=findViewById(R.id.btn_multiply)
        ButtonDivide=findViewById(R.id.btn_divide)
        firstnumber=findViewById(R.id.edit_firstnumber)
        secondnumber=findViewById(R.id.edit_secondnumber)
        textanswer=findViewById(R.id.txt_answer)


        Buttonadd.setOnClickListener {
            var firstnum=firstnumber.text.toString()
            var secondnum=secondnumber.text.toString()
            if (firstnum.isEmpty() && secondnum.isEmpty()){
                textanswer.text="Please fill in all inputs"
        } else {
                var answer = firstnum.toDouble() + secondnum.toDouble()
                textanswer.text = answer.toString()
            }
        }
        ButtonSub.setOnClickListener {
            var firstnum=firstnumber.text.toString()
            var secondnum=secondnumber.text.toString()
            if (firstnum.isEmpty() && secondnum.isEmpty()){
                textanswer.text="Please fill in all inputs"
            } else {
                var answer = firstnum.toDouble() - secondnum.toDouble()
                textanswer.text = answer.toString()
            }
        }
        ButtonMult.setOnClickListener {
            var firstnum=firstnumber.text.toString()
            var secondnum=secondnumber.text.toString()
            if (firstnum.isEmpty() && secondnum.isEmpty()){
                textanswer.text="Please fill in all inputs"
            } else {
                var answer = firstnum.toDouble() * secondnum.toDouble()
                textanswer.text = answer.toString()
            }
        }
        ButtonDivide.setOnClickListener {
            var firstnum=firstnumber.text.toString()
            var secondnum=secondnumber.text.toString()
            if (firstnum.isEmpty() && secondnum.isEmpty()){
                textanswer.text="Please fill in all inputs"
            }else{
                var answer=firstnum.toDouble()/secondnum.toDouble()
                textanswer.text=answer.toString()
            }
        }

    }
}