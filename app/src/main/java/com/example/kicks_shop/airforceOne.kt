package com.example.kicks_shop

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast


class airforceOne : AppCompatActivity() {
    lateinit var imageone:ImageView
    lateinit var imagetwo:ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        setContentView(R.layout.activity_airforce_one)
        imageone = findViewById(R.id.plainwhite)
        imagetwo = findViewById(R.id.black)


        imageone=findViewById(R.id.plainwhite)
        imageone.setOnClickListener{
            val intent=Intent(this,airforceWhite::class.java )
            startActivity(intent)
            Toast.makeText(this@airforceOne,"White",Toast.LENGTH_LONG).show()
        }
        imagetwo=findViewById(R.id.black)
        imagetwo.setOnClickListener{
            val intent=Intent(this,airforceblack::class.java )
            startActivity(intent)
            Toast.makeText(this@airforceOne,"Black",Toast.LENGTH_LONG).show()
        }


    }
}