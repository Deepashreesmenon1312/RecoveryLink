package com.example.recoverylink

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Reference UI elements from the layout
        val usernameEditText = findViewById<EditText>(R.id.username)
        val passwordEditText = findViewById<EditText>(R.id.password)
        val signInButton = findViewById<Button>(R.id.signInButton)
        val forgotPasswordTextView = findViewById<TextView>(R.id.forgotPassword)

        // Handle Sign-In button click
        signInButton.setOnClickListener {
            val username = usernameEditText.text.toString()
            val password = passwordEditText.text.toString()

            if (username.isEmpty() || password.isEmpty()) {
                Toast.makeText(this, "Please fill in all fields", Toast.LENGTH_SHORT).show()
            } else {
                // Navigate to MainActivity2
                val intent = Intent(this, MainActivity2::class.java)
                startActivity(intent)
            }
        }

        // Handle Forgot Password text click
        forgotPasswordTextView.setOnClickListener {
            Toast.makeText(this, "Forgot Password? Feature coming soon!", Toast.LENGTH_SHORT).show()
        }
    }
}
