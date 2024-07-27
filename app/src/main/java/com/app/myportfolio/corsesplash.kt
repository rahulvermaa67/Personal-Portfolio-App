package com.app.myportfolio

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper

class corsesplash : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_corsesplash)

        Handler(Looper.getMainLooper()).postDelayed({
            startActivity(Intent(this, mycorse::class.java))
            finish()
        }, 3000)
    }
}