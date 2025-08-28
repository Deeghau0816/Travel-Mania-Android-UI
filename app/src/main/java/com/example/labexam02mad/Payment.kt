package com.example.labexam02mad

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Payment : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_payment)

        val toHome = findViewById<Button>(R.id.payButton)

        toHome.setOnClickListener {
            val intent = Intent(this, AfterPayment::class.java)
            startActivity(intent)
        }

    }

}