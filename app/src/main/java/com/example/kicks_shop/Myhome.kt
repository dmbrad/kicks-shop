package com.example.kicks_shop

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.firebase.auth.FirebaseAuth

class Myhome : AppCompatActivity() {
    lateinit var ordernow:Button
    lateinit var logout:Button
    lateinit var auth:FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_myhome)

        supportActionBar?.hide()
        ordernow = findViewById(R.id.mBtnOrdernow)
        logout = findViewById(R.id.logoutbtn)
        auth = FirebaseAuth.getInstance()
        logout.setOnClickListener {
            auth.signOut()
                startActivity(Intent(this, MainActivity::class.java))

        }
        ordernow.setOnClickListener {
            intent = Intent(this, shop::class.java)
            startActivity(intent)
        }

    }
}