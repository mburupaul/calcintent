package com.example.calcintent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var ButtonCal: Button
    lateinit var Buttonweb: Button
    lateinit var ButtonIntent: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ButtonCal=findViewById(R.id.btn_calc)
        Buttonweb=findViewById(R.id.btn_web)
        ButtonIntent=findViewById(R.id.btn_intent)

        ButtonCal.setOnClickListener {
            val intent=Intent(this,CalculatorActivity::class.java)
            startActivity(intent)
        }
        Buttonweb.setOnClickListener {
            val intent=Intent(this,WEBActivity::class.java)
            startActivity(intent)
        }
        ButtonIntent.setOnClickListener {
            val intent=Intent(this,IntentActivity::class.java)
            startActivity(intent)
        }
    }

}