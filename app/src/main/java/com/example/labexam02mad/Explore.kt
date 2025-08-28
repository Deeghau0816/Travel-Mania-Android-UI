package com.example.labexam02mad

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Explore : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_explore)

        val backToHome = findViewById<ImageView>(R.id.backButtonExplore3)
        val homebuttonNav = findViewById<Button>(R.id.homebutton)
        val explore = findViewById<Button>(R.id.explorebutton)
        val cart = findViewById<Button>(R.id.cartbutton)
        val profile = findViewById<Button>(R.id.profilebutton)

        backToHome.setOnClickListener {
            val intent = Intent(this, Home::class.java)
            startActivity(intent)
        }

        homebuttonNav.setOnClickListener {
            val intent = Intent(this, Home::class.java)
            startActivity(intent)
        }

        explore.setOnClickListener {
            val intent = Intent(this, Explore::class.java)
            startActivity(intent)
        }

        cart.setOnClickListener {
            val intent = Intent(this, Cart::class.java)
            startActivity(intent)
        }

        profile.setOnClickListener {
            val intent = Intent(this, Profile::class.java)
            startActivity(intent)
        }
    }
}