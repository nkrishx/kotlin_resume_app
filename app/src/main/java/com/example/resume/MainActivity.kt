package com.example.resume

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var workHistory = findViewById<Button>(R.id.workHistory)

        workHistory.setOnClickListener {
            println("pressed")

            var moveToWorkHistory = Intent(getApplicationContext(),previousWorkHistoryActivity::class.java)
            startActivity(moveToWorkHistory)
        }

        var emailButton = findViewById<Button>(R.id.emailButton)

        emailButton.setOnClickListener {
            println("email")

            var emailIntent = Intent(Intent.ACTION_SEND)
            emailIntent.setType("plain/text")
            emailIntent.putExtra(Intent.EXTRA_EMAIL,"test@gmail.com")
            emailIntent.putExtra(Intent.EXTRA_SUBJECT,"cool resume")
            emailIntent.putExtra(Intent.EXTRA_TEXT,"blah blah blah blah")
            startActivity(emailIntent)
        }

        var callButton = findViewById<Button>(R.id.callButton)

        callButton.setOnClickListener {
            println("call")
            var phoneURI = Uri.parse("tel:899874800")
            var callIntent = Intent(Intent.ACTION_DIAL,phoneURI)
            startActivity(callIntent)
        }
    }
}