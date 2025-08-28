package com.example.labexam02mad

import android.content.Intent
import android.media.Image
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Yala : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_yala)

        val backyala = findViewById<ImageView>(R.id.backButtonYala)

        backyala.setOnClickListener {
            val intent = Intent(this, Home::class.java)
            startActivity(intent)
        }

    }
}