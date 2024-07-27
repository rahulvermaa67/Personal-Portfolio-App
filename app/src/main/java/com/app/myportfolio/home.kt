package com.app.myportfolio

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class home : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        // ------------- Day 1 --------------------

//        Create veriables for each elements used in the Design section !!
        val skl = findViewById<Button>(R.id.btnskill)
        val edu = findViewById<Button>(R.id.btneducation)
        val corse = findViewById<Button>(R.id.btncorse)
        val certi = findViewById<Button>(R.id.btncerti)
        val whtsbtn = findViewById<ImageButton>(R.id.whtsbtn)
        val lnkbtn = findViewById<ImageButton>(R.id.lnkdbtn)
        val instabtn = findViewById<ImageButton>(R.id.instabtn)
        val gmlbtn = findViewById<ImageButton>(R.id.gmailbtn)

        //may or may not be change Latter
        val nametxt = findViewById<TextView>(R.id.nametxt)
        val meimg = findViewById<ImageView>(R.id.meimg)
        val tvprof = findViewById<TextView>(R.id.tvprofection)

        //text view of About me
        tvprof.setOnClickListener {
            intent = Intent(this,newwating::class.java)
            startActivity(intent)
        }

        //my image Buttton
        meimg.setOnClickListener {
            intent = Intent(this,newwating::class.java)
            startActivity(intent)
        }

        //my name view
        nametxt.setOnClickListener {
            intent = Intent(this,newwating ::class.java)
            startActivity(intent)
        }

//        performing action / Task  When the Button is clicked (Intent )

        skl.setOnClickListener {
            intent = Intent(this,waiting::class.java)
            startActivity(intent)
        }
        //education button
        edu.setOnClickListener {
            intent = Intent(this,edusplash::class.java)
            startActivity(intent)
        }
        //Project button
        certi.setOnClickListener {
            intent = Intent(this,certisplash::class.java)
            startActivity(intent)
        }
        //Achivement Button
        corse.setOnClickListener {
            intent = Intent(this, corsesplash::class.java)
            startActivity(intent)
        }

        // -------------- Day 2 -------------

        //whatsapp Button Click to open Whatsapp
            whtsbtn.setOnClickListener{
//                intent  = packageManager.getLaunchIntentForPackage("com.whatsapp")
//                Intent.createChooser(intent,"Launch Whatsapp")
//                startActivity(intent)

                val message = "Hello, Rahul Verma "
                val phoneNumber = "9120067150"
                openWhatsAppChat(message)

            }

        lnkbtn.setOnClickListener {
//            intent = packageManager.getLaunchIntentForPackage("com.linkedin.android")
//            Intent.createChooser(intent,"Open Linkdein")
//            startActivity(intent)

            val username = "rahulverma67"
            openLinkdeinProfile(username)


        }
        instabtn.setOnClickListener {
//            intent = packageManager.getLaunchIntentForPackage("com.instagram.android")
//            Intent.createChooser(intent,"Open Instagram")
//            startActivity(intent)

            val username = "rahul.verma.67"
            openInstagramProfile(username)

        }

        gmlbtn.setOnClickListener {

            opengmail("rahulverma67672@gmail.com")
        }

    }
    private fun openWhatsAppChat(message: String) {
        try {
            val intent = Intent(Intent.ACTION_VIEW)
            val uri = "https://api.whatsapp.com/send?phone=+91 9120067150&text=${Uri.encode(message)}"
            intent.data = Uri.parse(uri)
            startActivity(intent)
        } catch (e: Exception) {
            Toast.makeText(this, "WhatsApp is not installed on your device", Toast.LENGTH_SHORT).show()
        }
    }

    private fun openInstagramProfile(username: String) {
        try {
            val intent = Intent(Intent.ACTION_VIEW)
            val uri = "http://instagram.com/_u/$username"
            intent.data = Uri.parse(uri)
            intent.setPackage("com.instagram.android")
            startActivity(intent)
        } catch (e: Exception) {
            Toast.makeText(this, "Instagram is not installed on your device", Toast.LENGTH_SHORT).show()
        }
    }

    private fun openLinkdeinProfile(username: String) {
        try {
            val intent = Intent(Intent.ACTION_VIEW)
            val uri = "https://www.linkedin.com/in/$username"
            intent.data = Uri.parse(uri)
            intent.setPackage("com.linkedin.android")
            startActivity(intent)
        } catch (e: Exception) {
            Toast.makeText(this, "Instagram is not installed on your device", Toast.LENGTH_SHORT).show()
        }
    }

    private fun opengmail(username: String) {
        try {
            val intent = Intent(Intent.ACTION_VIEW)
            val uri = "mailto:?subject= Android Development &body= Hello Rahul Verma , \n Good to See you !  &to=$username"
            intent.data = Uri.parse(uri)
            startActivity(intent)
        } catch (e: Exception) {
        Toast.makeText(this, "Gamil is not installed on your device", Toast.LENGTH_SHORT).show()
        }
    }


}

