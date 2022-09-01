package com.example.kicks_shop

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast


class yeezyproducts: AppCompatActivity() {
    lateinit var imageone:ImageView
    lateinit var imagetwo:ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        setContentView(R.layout.activity_yeezyproducts)
        imageone = findViewById(R.id.yeezy)
        imagetwo = findViewById(R.id.yeezyfoam)
        imageone=findViewById(R.id.yeezy)
        imageone.setOnClickListener{
            val intent=Intent(this,yeezy::class.java )
            startActivity(intent)
            Toast.makeText(this@yeezyproducts,"yeezy product",Toast.LENGTH_LONG).show()
        }
        imagetwo=findViewById(R.id.yeezyfoam)
        imagetwo.setOnClickListener{
            val intent=Intent(this,yeezyfoam::class.java )
            startActivity(intent)
            Toast.makeText(this@yeezyproducts,"yeezy product",Toast.LENGTH_LONG).show()
        }

    }
}