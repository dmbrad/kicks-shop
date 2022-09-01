package com.example.kicks_shop

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast


class sbdunk: AppCompatActivity() {
    lateinit var imageone:ImageView
    lateinit var imagetwo:ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        setContentView(R.layout.activity_sbdunk)
        imageone = findViewById(R.id.sbcactusjack)
        imagetwo = findViewById(R.id.sbpanda)
        imageone=findViewById(R.id.sbcactusjack)
        imageone.setOnClickListener{
            val intent=Intent(this,sbcactusjack::class.java )
            startActivity(intent)
            Toast.makeText(this@sbdunk,"sbdunk",Toast.LENGTH_LONG).show()
        }
        imagetwo=findViewById(R.id.sbpanda)
        imagetwo.setOnClickListener{
            val intent=Intent(this,sbpanda::class.java )
            startActivity(intent)
            Toast.makeText(this@sbdunk,"sbdunk",Toast.LENGTH_LONG).show()
        }

    }
}