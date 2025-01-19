package com.example.recoverylink
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class MainActivity3 : AppCompatActivity() {

    private var isRunning = false
    private var elapsedTime: Long = 0
    private val handler = Handler(Looper.getMainLooper())

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        // CalendarView
        val calendarView: CalendarView = findViewById(R.id.calendarView)
        calendarView.setOnDateChangeListener { _, year, month, dayOfMonth ->
            Toast.makeText(
                this,
                "Selected Date: $dayOfMonth/${month + 1}/$year",
                Toast.LENGTH_SHORT
            ).show()
        }

        // Timer
        val tvStopwatch: TextView = findViewById(R.id.tvStopwatch)
        val btnStart: Button = findViewById(R.id.btnStart)
        val btnStop: Button = findViewById(R.id.btnStop)
        val btnReset: Button = findViewById(R.id.btnReset)

        val runnable = object : Runnable {
            override fun run() {
                elapsedTime++
                tvStopwatch.text = String.format(
                    "%02d:%02d:%02d",
                    elapsedTime / 3600,
                    (elapsedTime % 3600) / 60,
                    elapsedTime % 60
                )
                handler.postDelayed(this, 1000)
            }
        }

        btnStart.setOnClickListener {
            if (!isRunning) {
                isRunning = true
                handler.post(runnable)
            }
        }

        btnStop.setOnClickListener {
            isRunning = false
            handler.removeCallbacks(runnable)
        }

        btnReset.setOnClickListener {
            isRunning = false
            handler.removeCallbacks(runnable)
            elapsedTime = 0
            tvStopwatch.text = "00:00:00"
        }
    }
}