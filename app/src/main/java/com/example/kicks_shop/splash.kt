package com.example.kicks_shop
import android.content.Intent
import android.graphics.drawable.AnimationDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.LinearLayout
import com.google.firebase.auth.FirebaseAuth



class splash : AppCompatActivity() {

    private lateinit var splash_anim:AnimationDrawable

    private lateinit var auth: FirebaseAuth
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        supportActionBar?.hide()

        val splash = findViewById<LinearLayout>(R.id.splash_animation)
            .apply {
                setBackgroundResource(R.drawable.splash_anim)
                splash_anim = background as AnimationDrawable
                splash_anim.start()
            }


        Handler(Looper.getMainLooper()).postDelayed({
            intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()

        },5500)
    }
}
