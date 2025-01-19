package com.example.recoverylink

import android.content.Context
//import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity4: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)

        // Reference UI elements
        val titleEditText = findViewById<EditText>(R.id.journalTitle)
        val contentEditText = findViewById<EditText>(R.id.journalContent)
        val saveButton = findViewById<Button>(R.id.saveButton)
        val viewEntriesButton = findViewById<Button>(R.id.viewEntriesButton)

        // Handle Save button click
        saveButton.setOnClickListener {
            val title = titleEditText.text.toString()
            val content = contentEditText.text.toString()

            if (title.isEmpty() || content.isEmpty()) {
                Toast.makeText(this, "Please fill in all fields", Toast.LENGTH_SHORT).show()
            } else {
                saveJournalEntry(title, content)
                Toast.makeText(this, "Journal entry saved!", Toast.LENGTH_SHORT).show()
                titleEditText.text.clear()
                contentEditText.text.clear()
            }
        }

        // Handle View Entries button click
        viewEntriesButton.setOnClickListener {
            // Navigate to the view entries page
            Toast.makeText(this, "view entries clicked!", Toast.LENGTH_SHORT).show()

        }

    }

    // Function to save journal entry locally
    private fun saveJournalEntry(title: String, content: String) {
        val sharedPreferences = getSharedPreferences("JournalEntries", Context.MODE_PRIVATE)
        val editor = sharedPreferences.edit()
        val timestamp = System.currentTimeMillis()
        editor.putString("entry_$timestamp", "$title\n$content")
        editor.apply()
    }
}

