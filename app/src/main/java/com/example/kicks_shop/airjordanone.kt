package com.example.kicks_shop

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast


class airjordanone : AppCompatActivity() {
    lateinit var imageone:ImageView
    lateinit var imagetwo:ImageView
    lateinit var imagethree:ImageView
    lateinit var imagefour:ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        setContentView(R.layout.activity_airjordanone)
        imageone = findViewById(R.id.jordanolivetoe)
        imagetwo = findViewById(R.id.jordanpanda)
        imagethree = findViewById(R.id.travisscottfragment)
        imagefour = findViewById(R.id.redandblack)

        imageone=findViewById(R.id.jordanolivetoe)
        imageone.setOnClickListener{
            val intent=Intent(this,jordanoneolivetoe::class.java )
            startActivity(intent)
            Toast.makeText(this@airjordanone,"Jordan One Olivetoe",Toast.LENGTH_LONG).show()
        }
        imagetwo=findViewById(R.id.jordanpanda)
        imagetwo.setOnClickListener{
            val intent=Intent(this,jordanonepanda::class.java )
            startActivity(intent)
            Toast.makeText(this@airjordanone,"panda",Toast.LENGTH_LONG).show()
        }
        imagethree=findViewById(R.id.travisscottfragment)
        imagethree.setOnClickListener{
            val intent=Intent(this,fragment::class.java )
            startActivity(intent)
            Toast.makeText(this@airjordanone,"travisscottfragment",Toast.LENGTH_LONG).show()
        }
        imagefour=findViewById(R.id.redandblack)
        imagefour.setOnClickListener{
            val intent=Intent(this,jordan_redandblack::class.java )
            startActivity(intent)
            Toast.makeText(this@airjordanone,"redandblack",Toast.LENGTH_LONG).show()
        }

    }
}