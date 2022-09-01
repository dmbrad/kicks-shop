package com.example.kicks_shop

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast


class italianofficialshoes : AppCompatActivity() {
    lateinit var imageone:ImageView
    lateinit var imagetwo:ImageView
    lateinit var imagethree:ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        setContentView(R.layout.activity_italianofficialshoes)
        imageone = findViewById(R.id.italianoxfordshoe)
        imagetwo = findViewById(R.id.italianstylish)
        imagethree =findViewById(R.id.formalleather)


        imageone=findViewById(R.id.italianoxfordshoe)
        imageone.setOnClickListener{
            val intent=Intent(this,italianoxfordshoe::class.java )
            startActivity(intent)
            Toast.makeText(this@italianofficialshoes,"Oxford shoe",Toast.LENGTH_LONG).show()
        }
        imagetwo=findViewById(R.id.italianstylish)
        imagetwo.setOnClickListener{
            val intent=Intent(this,italianstylishshoe::class.java )
            startActivity(intent)
            Toast.makeText(this@italianofficialshoes,"italian stylish",Toast.LENGTH_LONG).show()
        }
        imagethree=findViewById(R.id.formalleather)
        imagethree.setOnClickListener{
            val intent=Intent(this,formalleathershoe::class.java )
            startActivity(intent)
            Toast.makeText(this@italianofficialshoes,"formal leather shoe",Toast.LENGTH_LONG).show()
        }


    }
}