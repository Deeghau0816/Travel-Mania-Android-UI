package com.example.labexam02mad

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main) // Ensure this XML file exists

        // Automatically navigate to Onboarding1 after 2 seconds
        Handler(Looper.getMainLooper()).postDelayed({
            val intent = Intent(this, Onboarding1::class.java)
            startActivity(intent)
            finish()
        }, 2000) // 2 seconds
    }
}
