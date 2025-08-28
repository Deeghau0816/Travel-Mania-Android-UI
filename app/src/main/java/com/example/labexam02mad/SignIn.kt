package com.example.labexam02mad

import android.content.Intent
import android.os.Bundle
import android.util.Patterns
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class SignIn : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)

        // grab views
        val nameInput = findViewById<EditText>(R.id.nameInput)
        val emailInput = findViewById<EditText>(R.id.emailInput)
        val passwordInput = findViewById<EditText>(R.id.passwordInput)
        val confirmPasswordInput = findViewById<EditText>(R.id.confirmPasswordInput)
        val termsCheck = findViewById<CheckBox>(R.id.termsCheck)
        val createBtn = findViewById<Button>(R.id.signIn)

        createBtn.setOnClickListener {
            val name = nameInput.text.toString().trim()
            val email = emailInput.text.toString().trim()
            val pass = passwordInput.text.toString().trim()
            val confirm = confirmPasswordInput.text.toString().trim()

            var hasError = false

            // inputs
            if (name.isEmpty()) {
                nameInput.error = "Name required"
                hasError = true
            } else nameInput.error = null

            if (email.isEmpty()) {
                emailInput.error = "Email required"
                hasError = true
            } else if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
                emailInput.error = "Enter a valid email"
                hasError = true
            } else emailInput.error = null

            if (pass.isEmpty()) {
                passwordInput.error = "Password required"
                hasError = true
            } else passwordInput.error = null

            if (confirm.isEmpty()) {
                confirmPasswordInput.error = "Confirm your password"
                hasError = true
            } else confirmPasswordInput.error = null

            // passwords
            if (pass.isNotEmpty() && confirm.isNotEmpty() && pass != confirm) {
                confirmPasswordInput.error = "Passwords don't match"
                hasError = true
            }

            // terms
            if (!termsCheck.isChecked) {
                Toast.makeText(this, "Please accept Terms and Conditions", Toast.LENGTH_SHORT).show()
                hasError = true
            }

            if (hasError) return@setOnClickListener

            // final nitification
            Toast.makeText(this, "Account created!", Toast.LENGTH_SHORT).show()
            startActivity(Intent(this, LogIn::class.java))
            finish()
        }
    }
}
