package com.example.labexam02mad

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Esala1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_esala1)

        val seatbook = findViewById<Button>(R.id.bookNowButton)
        val Esala1back = findViewById<ImageView>(R.id.backButton)

        seatbook.setOnClickListener {
            val intent = Intent(this, Esala2::class.java)
            startActivity(intent)
        }

        Esala1back.setOnClickListener {
            val intent = Intent(this, Home::class.java)
            startActivity(intent)
        }
    }
}