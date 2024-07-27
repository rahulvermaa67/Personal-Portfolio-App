package com.app.myportfolio

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper

class certisplash : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_certisplash)

        Handler(Looper.getMainLooper()).postDelayed({
            startActivity(Intent(this, mycerti::class.java))
            finish()
        }, 3000)
    }
}