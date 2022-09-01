package com.example.kicks_shop

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast


class cactusjack : AppCompatActivity() {
    lateinit var imageone:ImageView
    lateinit var imagetwo:ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        setContentView(R.layout.activity_cactusjack)
        imageone = findViewById(R.id.sbcactusjack)
        imagetwo = findViewById(R.id.fragment)


        imageone=findViewById(R.id.sbcactusjack)
        imageone.setOnClickListener{
            val intent=Intent(this,sbcactusjack::class.java )
            startActivity(intent)
            Toast.makeText(this@cactusjack,"sb cactus",Toast.LENGTH_LONG).show()
        }
        imagetwo=findViewById(R.id.fragment)
        imagetwo.setOnClickListener{
            val intent=Intent(this,fragment::class.java )
            startActivity(intent)
            Toast.makeText(this@cactusjack,"Travis fragment",Toast.LENGTH_LONG).show()
        }


    }
}