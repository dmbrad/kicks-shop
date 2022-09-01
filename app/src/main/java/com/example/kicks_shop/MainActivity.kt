package com.example.kicks_shop

import android.app.Activity
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.Button
import android.widget.ImageView
import com.example.kicks_shop.R.id.sign_up_btn
import com.example.kicks_shop.R.id.signup_btn
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseAuthRecentLoginRequiredException
import com.google.firebase.storage.FirebaseStorage
import com.google.firebase.storage.StorageReference

class MainActivity : AppCompatActivity() {
    lateinit var login:Button
    lateinit var signup:Button
    lateinit var  firebaseAuth: FirebaseAuth


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()


        login = findViewById(R.id.login_btn)

        firebaseAuth = FirebaseAuth.getInstance()

        login.setOnClickListener {
            checkuser()

        }
        signup = findViewById(signup_btn)
        signup.setOnClickListener {
            startActivity(Intent(this, Email_signup::class.java))

            }
    }



    private fun checkuser() {
        val firebaseUser =firebaseAuth.currentUser
       if (firebaseUser !=null){
           startActivity(Intent(this,Myhome::class.java))
           finish()
       }else{
           val intent = Intent(this,Email_signup::class.java)
           startActivity(intent)
       }
    }
}







