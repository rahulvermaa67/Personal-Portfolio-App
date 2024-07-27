package com.app.myportfolio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar


class skills : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skills)

        val textColor = getColor(R.color.black)
        val backgroundColor = getColor(R.color.paret)



        setupSnackbar(findViewById(R.id.tvheadingskil), "These Are My Skills", textColor, backgroundColor)
        setupSnackbar(findViewById(R.id.tvpython), "I have good Knowledge of Python", textColor, backgroundColor)
        setupSnackbar(findViewById(R.id.tvbootstrap), "I have good Knowledge of Bootstrap", textColor, backgroundColor)
        setupSnackbar(findViewById(R.id.tvjava), "I have good Knowledge of Java", textColor, backgroundColor)
        setupSnackbar(findViewById(R.id.tvc), "I am Good in C Language", textColor, backgroundColor)
        setupSnackbar(findViewById(R.id.tvkotline), "I am Good in Kotlin", textColor, backgroundColor)
        setupSnackbar(findViewById(R.id.tvhtml), "I have good Knowledge of HTML", textColor, backgroundColor)
        setupSnackbar(findViewById(R.id.tvwordprss), "I am Good in Wordpress", textColor, backgroundColor)
        setupSnackbar(findViewById(R.id.tvjs), "I am Good in JavaScript", textColor, backgroundColor)
        setupSnackbar(findViewById(R.id.tvxml), "I am Good in XML", textColor, backgroundColor)
        setupSnackbar(findViewById(R.id.tvgraphic), "I am Good in Graphic Design", textColor, backgroundColor)
        setupSnackbar(findViewById(R.id.tvsql), "I am Good in SQL", textColor, backgroundColor)
        setupSnackbar(findViewById(R.id.tvdigital), "I am Good in Digital Marketing", textColor, backgroundColor)
    }

//        val tvjava = findViewById<TextView>(R.id.tvjava)
//        val tvc = findViewById<TextView>(R.id.tvc)
//        val tvkotlin = findViewById<TextView>(R.id.tvkotline)
//        val tvhtml = findViewById<TextView>(R.id.tvhtml)
//        val tvbootstrap = findViewById<TextView>(R.id.tvbootstrap)
//        val tvjs = findViewById<TextView>(R.id.tvjs)
//        val tvwordpress = findViewById<TextView>(R.id.tvwordprss)
//        val tvxml = findViewById<TextView>(R.id.tvxml)
//        val tvgraphic = findViewById<TextView>(R.id.tvgraphic)
//        val tvsql = findViewById<TextView>(R.id.tvsql)
//        val tvdigital = findViewById<TextView>(R.id.tvdigital)
//        val tvheadskill = findViewById<TextView>(R.id.tvheadingskil)
//


 }
fun setupSnackbar(textView: TextView, message: String, textColor: Int, backgroundColor: Int) {
    textView.setOnClickListener {
        val snackbar = Snackbar.make(it, message, Snackbar.LENGTH_SHORT)
        snackbar.setTextColor(textColor)
        snackbar.view.setBackgroundColor(backgroundColor)
        snackbar.show()
    }
}
