package com.keshav.budgettracker

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper

class SplashScrrenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_scrren)

        Handler(Looper.getMainLooper()).postDelayed({
            startActivity(Intent(this, SignOrSignUp::class.java))
            finish()
        }, 1000)
    }
}