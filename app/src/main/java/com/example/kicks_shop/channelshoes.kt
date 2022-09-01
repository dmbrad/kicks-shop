package com.example.kicks_shop

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast


class channelshoes : AppCompatActivity() {
    lateinit var imageone:ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        setContentView(R.layout.activity_channelshoes)
        imageone = findViewById(R.id.channelshoes)


        imageone=findViewById(R.id.sbcactusjack)
        imageone.setOnClickListener{
            val intent=Intent(this,chanelcalfskin::class.java )
            startActivity(intent)
            Toast.makeText(this@channelshoes ,"chanelcalfskin",Toast.LENGTH_LONG).show()
        }


    }
}