package com.example.kicks_shop

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast


class jordan4 : AppCompatActivity() {
    lateinit var imageone:ImageView
    lateinit var imagetwo:ImageView
    lateinit var imagethree:ImageView
    lateinit var imagefour:ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        setContentView(R.layout.activity_jordan4)
        imageone = findViewById(R.id.bred)
        imagetwo = findViewById(R.id.Millitaryblack)
        imagethree =findViewById(R.id.offwhite)
        imagefour =findViewById(R.id.lightening)


        imageone=findViewById(R.id.bred)
        imageone.setOnClickListener{
            val intent=Intent(this,bred::class.java )
            startActivity(intent)
            Toast.makeText(this@jordan4,"bred",Toast.LENGTH_LONG).show()
        }
        imagetwo=findViewById(R.id.Millitaryblack)
        imagetwo.setOnClickListener{
            val intent=Intent(this,millitaryblack::class.java )
            startActivity(intent)
            Toast.makeText(this@jordan4,"Millitary",Toast.LENGTH_LONG).show()
        }
        imagethree=findViewById(R.id.offwhite)
        imagethree.setOnClickListener{
            val intent=Intent(this,offwhite::class.java )
            startActivity(intent)
            Toast.makeText(this@jordan4,"Offwhite ",Toast.LENGTH_LONG).show()
        }
        imagefour=findViewById(R.id.lightening)
        imagefour.setOnClickListener{
            val intent=Intent(this,lightening::class.java )
            startActivity(intent)
            Toast.makeText(this@jordan4,"lightening",Toast.LENGTH_LONG).show()
        }

    }
}