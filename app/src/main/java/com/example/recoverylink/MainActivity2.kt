package com.example.recoverylink

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.recoverylink.R

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        // Reference the buttons
        val btnYourProgress = findViewById<Button>(R.id.btnYourProgress)
        val btnDailyPlanner = findViewById<Button>(R.id.btnDailyPlanner)
        val btnSupportCommunity = findViewById<Button>(R.id.btnSupportCommunity)
        val btnHealthandWellness = findViewById<Button>(R.id.btnHealthandWellness)
        val btnWithExperts = findViewById<Button>(R.id.btnWithExperts)
        val btnNotes= findViewById<Button>(R.id.btnNotes)
        val btnEventsActivities = findViewById<Button>(R.id.btnEventsActivities)

        // Set click listeners
        btnYourProgress.setOnClickListener {

            val intent = Intent(this, MainActivity8::class.java)
            startActivity(intent)

        }
        btnDailyPlanner.setOnClickListener {
            // Navigate to MainActivity3
            val intent = Intent(this, MainActivity3::class.java)
            startActivity(intent)


        }

        btnSupportCommunity.setOnClickListener {
            val intent = Intent(this, MainActivity7::class.java)
            startActivity(intent)
        }

        btnHealthandWellness.setOnClickListener {
            Toast.makeText(this, "Health and Wellness clicked!", Toast.LENGTH_SHORT).show()
        }
        btnWithExperts.setOnClickListener {
            Toast.makeText(this, "With Experts clicked!", Toast.LENGTH_SHORT).show()
        }// Navigate or perform actions here

        btnNotes.setOnClickListener {
            val intent = Intent(this, MainActivity5::class.java)
            startActivity(intent)
        }
        btnEventsActivities.setOnClickListener {
            Toast.makeText(this, "Events and Activities clicked!", Toast.LENGTH_SHORT).show()
        }
    }
}