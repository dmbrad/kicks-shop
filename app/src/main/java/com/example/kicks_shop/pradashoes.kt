package com.example.kicks_shop

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast


class pradashoes: AppCompatActivity() {
    lateinit var imageone:ImageView
    lateinit var imagetwo:ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        setContentView(R.layout.activity_pradashoes)
        imageone = findViewById(R.id.blackprada)
        imagetwo = findViewById(R.id.pradaladies)
        imageone=findViewById(R.id.blackprada)
        imageone.setOnClickListener{
            val intent=Intent(this,prada::class.java )
            startActivity(intent)
            Toast.makeText(this@pradashoes,"Black",Toast.LENGTH_LONG).show()
        }
        imagetwo=findViewById(R.id.pradaladies)
        imagetwo.setOnClickListener{
            val intent=Intent(this,pradaboots::class.java )
            startActivity(intent)
            Toast.makeText(this@pradashoes,"black",Toast.LENGTH_LONG).show()
        }

    }
}