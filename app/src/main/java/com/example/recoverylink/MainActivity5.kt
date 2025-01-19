package com.example.recoverylink

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main5)

        // Reference buttons
        val journalingButton = findViewById<Button>(R.id.journalingButton)
        val triggerLogButton = findViewById<Button>(R.id.triggerLogButton)

        // Navigate to JournalingActivity (MainActivity4) when Journaling button is clicked
        journalingButton.setOnClickListener {
            val intent = Intent(this,MainActivity4::class.java)
            startActivity(intent)
        }

        // Handle Trigger Log button (you can add functionality here)
        triggerLogButton.setOnClickListener {
            // Implement trigger log logic or navigate to another page
            // Example: Redirect to TriggerLogActivity
          //  val intent = Intent(this, TriggerLogActivity::class.java)
            startActivity(intent)
        }
    }
}
