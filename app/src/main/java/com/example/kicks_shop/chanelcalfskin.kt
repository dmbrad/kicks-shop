package com.example.kicks_shop

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class chanelcalfskin: AppCompatActivity() {
    lateinit var pay: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chanelcalfskin)

        pay = findViewById(R.id.mBtnbuynow)

        pay = findViewById(R.id.mBtnbuynow)
        pay.setOnClickListener {
            val intent = Intent(this,Modeofpayment ::class.java)
            startActivity(intent)
            Toast.makeText(this@chanelcalfskin, "Success", Toast.LENGTH_LONG).show()
        }
    }}

