package com.example.labexam02mad

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Esala2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_esala2)

        val bookseatToPayment = findViewById<Button>(R.id.bookNowButton2)
        val toEsala1 = findViewById<ImageView>(R.id.backButtonEsala2)

        bookseatToPayment.setOnClickListener {
            val intent = Intent(this, Payment::class.java)
            startActivity(intent)
        }

        toEsala1.setOnClickListener {
            val intent = Intent(this, Esala1::class.java)
            startActivity(intent)
        }

    }
}