package com.example.recoverylink

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import com.example.recoverylink.MainActivity6
import com.example.recoverylink.R

class MainActivity7 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main7)

        val groupChatButton: Button = findViewById(R.id.btn_group_chat)
        val peerSupportButton: Button = findViewById(R.id.btn_peer_support)
        val therapyNearMeButton: Button = findViewById(R.id.btn_therapy_near_me)

        groupChatButton.setOnClickListener {
            // Navigate to Group Chat Activity
          //  val intent = Intent(this, GroupChatActivity::class.java)
          //  startActivity(intent)
        }

        peerSupportButton.setOnClickListener {
            // Navigate to Peer Support Activity
        //    val intent = Intent(this, MainActivity9::class.java)
          //  startActivity(intent)
        }

        therapyNearMeButton.setOnClickListener {
            // Navigate to Therapy Near Me Activity
            val intent = Intent(this, MainActivity6::class.java)
            startActivity(intent)
        }
    }
}
