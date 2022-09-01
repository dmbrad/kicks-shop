package com.example.kicks_shop

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast


class alexandermcqueen : AppCompatActivity() {
    lateinit var imageone:ImageView
    lateinit var imagetwo:ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        setContentView(R.layout.activity_alexandermcqueen)
        imageone = findViewById(R.id.alexanderblack)
        imagetwo = findViewById(R.id.alexanderwhite)
        imageone=findViewById(R.id.alexanderblack)
        imageone.setOnClickListener{
            val intent=Intent(this,alexanderblack::class.java )
            startActivity(intent)
            Toast.makeText(this@alexandermcqueen,"Black",Toast.LENGTH_LONG).show()
        }
        imagetwo=findViewById(R.id.alexanderwhite)
        imagetwo.setOnClickListener{
            val intent=Intent(this,alexanderwhite::class.java )
            startActivity(intent)
            Toast.makeText(this@alexandermcqueen,"black",Toast.LENGTH_LONG).show()
        }

    }
}