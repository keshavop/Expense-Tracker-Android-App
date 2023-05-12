package com.keshav.budgettracker

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SignOrSignUp : AppCompatActivity() {
    lateinit var login : Button
    lateinit var signup: Button
    lateinit var guest: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_or_sign_up)

        login = findViewById<Button>(R.id.login)
        signup = findViewById<Button>(R.id.signup)
        guest = findViewById<Button>(R.id.guest)

        login.setOnClickListener {
            var intent = Intent(applicationContext,Login::class.java)
            startActivity(intent)
            finish()
        }

        signup.setOnClickListener {
            var intent = Intent(applicationContext,Signup::class.java)
            startActivity(intent)
            finish()
        }

        guest.setOnClickListener {
            var intent = Intent(applicationContext,MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }


}