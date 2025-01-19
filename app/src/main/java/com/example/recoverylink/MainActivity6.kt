package com.example.recoverylink

import android.os.Bundle
import android.view.MotionEvent
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity6 : AppCompatActivity() {

    private lateinit var staticMap: ImageView
    private lateinit var searchBar: EditText
    private lateinit var saveLocationButton: Button
    private var selectedLocation: Pair<Float, Float>? = null  // Simulated coordinates (x, y on the image)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main6)

        // Reference UI elements
        staticMap = findViewById(R.id.staticMap)
        searchBar = findViewById(R.id.searchBar)
        saveLocationButton = findViewById(R.id.saveLocationButton)

        // Handle taps on the static map
        staticMap.setOnTouchListener { _, event ->
            if (event.action == MotionEvent.ACTION_DOWN) {
                val x = event.x
                val y = event.y
                selectedLocation = Pair(x, y)

                Toast.makeText(
                    this,
                    "Location Selected: x=$x, y=$y",
                    Toast.LENGTH_SHORT
                ).show()
            }
            true
        }

        // Handle Save Location button click
        saveLocationButton.setOnClickListener {
            if (selectedLocation != null) {
                // Save the selected location
                val (x, y) = selectedLocation!!
                saveLocation(x, y)
                Toast.makeText(
                    this,
                    "Location Saved: x=$x, y=$y",
                    Toast.LENGTH_SHORT
                ).show()
            } else {
                Toast.makeText(this, "No location selected", Toast.LENGTH_SHORT).show()
            }
        }

        // Simulated search bar functionality
        searchBar.setOnEditorActionListener { _, _, _ ->
            val query = searchBar.text.toString()
            if (query.isNotEmpty()) {
                Toast.makeText(
                    this,
                    "Simulated search for: $query",
                    Toast.LENGTH_SHORT
                ).show()
            }
            true
        }
    }

    private fun saveLocation(x: Float, y: Float) {
        // Save the location in SharedPreferences or handle it as needed
        val sharedPreferences = getSharedPreferences("SavedLocations", MODE_PRIVATE)
        val editor = sharedPreferences.edit()
        editor.putFloat("x", x)
        editor.putFloat("y", y)
        editor.apply()
    }
}
