package com.example.kicks_shop

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout
import com.google.firebase.auth.FirebaseAuth


class shop : AppCompatActivity() {
    lateinit var imageone: ImageView
    lateinit var imagetwo: ImageView
    lateinit var imagethree: ImageView
    lateinit var imagefour: ImageView
    lateinit var imagefive: ImageView
    lateinit var imagesix: ImageView
    lateinit var imageseven: ImageView
    lateinit var imageeight: ImageView
    lateinit var imagenine: ImageView
    lateinit var imageten: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        setContentView(R.layout.activity_shop)
        imageone = findViewById(R.id.img1)
        imagetwo = findViewById(R.id.img2)
        imagethree = findViewById(R.id.img3)
        imagefour = findViewById(R.id.img4)
        imagefive = findViewById(R.id.img5)
        imagesix = findViewById(R.id.img6)
        imageseven = findViewById(R.id.img7)
        imageeight = findViewById(R.id.img8)
        imagenine = findViewById(R.id.img9)
        imageten = findViewById(R.id.img10)


        imageone = findViewById(R.id.img1)
        imageone.setOnClickListener {
            val intent = Intent(this, cactusjack::class.java)
            startActivity(intent)
            Toast.makeText(this@shop, "cactus jack", Toast.LENGTH_LONG).show()
        }
        imagetwo = findViewById(R.id.img2)
        imagetwo.setOnClickListener {
            val intent = Intent(this, airforceOne::class.java)
            Toast.makeText(this@shop, "airforceOne", Toast.LENGTH_LONG).show()
        }
        imagethree = findViewById(R.id.img3)
        imagethree.setOnClickListener {
            val intent = Intent(this, airjordanone::class.java)
            startActivity(intent)
            Toast.makeText(this@shop, "airjordanone", Toast.LENGTH_LONG).show()
            }
            imagefour=findViewById(R.id.img4)
            imagefour.setOnClickListener{
                val intent=Intent(this,jordan4::class.java )
                startActivity(intent)
                Toast.makeText(this@shop,"Jordan4",Toast.LENGTH_LONG).show()
            }
            imagefive=findViewById(R.id.img5)
            imagefive.setOnClickListener{
                val intent=Intent(this,sbdunk::class.java )
                startActivity(intent)
                Toast.makeText(this@shop,"sbdunk",Toast.LENGTH_LONG).show()
            }
            imagesix=findViewById(R.id.img6)
            imagesix.setOnClickListener {
                val intent = Intent(this, Luisviton::class.java)
                startActivity(intent)
                Toast.makeText(this@shop, "Luisvuitton", Toast.LENGTH_LONG).show()
            }
            imageseven=findViewById(R.id.img7)
            imageseven.setOnClickListener {
                val intent = Intent(this, italianofficialshoes::class.java)
                startActivity(intent)
                Toast.makeText(this@shop, "italianofficialshoes", Toast.LENGTH_LONG).show()
            }
            imageeight=findViewById(R.id.img8)
            imageeight.setOnClickListener {
                val intent = Intent(this, pradashoes::class.java)
               startActivity(intent)
                Toast.makeText(this@shop, "Prada", Toast.LENGTH_LONG).show()
            }
            imagenine=findViewById(R.id.img9)
            imagenine.setOnClickListener {
                val intent = Intent(this,yeezyproducts ::class.java)
                startActivity(intent)
                Toast.makeText(this@shop, "Yeezy", Toast.LENGTH_LONG).show()
           }
            imageten=findViewById(R.id.img10)
            imageten.setOnClickListener {
                val intent = Intent(this,alexandermcqueen ::class.java)
                startActivity(intent)
                Toast.makeText(this@shop, "Alexander Mcqueen", Toast.LENGTH_LONG).show()
            }

        }
    }

