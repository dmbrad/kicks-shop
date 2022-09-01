package com.example.kicks_shop

import android.Manifest
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import com.google.firebase.auth.FirebaseAuth

class Modeofpayment : AppCompatActivity() {
    lateinit var Mpesa: ImageView
    lateinit var Phone: TextView

    //firebase Auth
    private lateinit var firebaseAuth: FirebaseAuth
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_modeofpayment)

        supportActionBar?.hide()

        Mpesa = findViewById(R.id.mImgMpesa)
        Phone = findViewById(R.id.mTvPhone)
//set to access MPESa
        Mpesa.setOnClickListener {
            val simToolKitLaunchIntent =
                applicationContext.packageManager.getLaunchIntentForPackage("com.android.stk")
            simToolKitLaunchIntent?.let { startActivity(it) }
        }
        //set for calls
        Phone.setOnClickListener {
            val intent = Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "0742582053"))
            if (ContextCompat.checkSelfPermission(
                    this@Modeofpayment,
                    Manifest.permission.CALL_PHONE
                ) != PackageManager.PERMISSION_GRANTED
            ) {
                ActivityCompat.requestPermissions(
                    this@Modeofpayment,
                    arrayOf(Manifest.permission.CALL_PHONE),
                    1
                )
            } else {
                startActivity(intent)

                firebaseAuth = FirebaseAuth.getInstance()

            }
        }


    }
}

