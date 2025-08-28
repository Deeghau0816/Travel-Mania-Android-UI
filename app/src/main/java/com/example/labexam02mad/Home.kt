package com.example.labexam02mad

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Home : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val esala = findViewById<TextView>(R.id.esalaPerahera)
        val yala = findViewById<TextView>(R.id.yalabutton)
        val homebutton = findViewById<Button>(R.id.homebutton)
        val explore = findViewById<Button>(R.id.explorebutton)
        val cart = findViewById<Button>(R.id.cartbutton)
        val profile = findViewById<Button>(R.id.profilebutton)

        esala.setOnClickListener {
            val intent = Intent(this, Esala1::class.java)
            startActivity(intent)
        }

        yala.setOnClickListener {
            val intent = Intent(this, Yala::class.java)
            startActivity(intent)
        }

        homebutton.setOnClickListener {
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
