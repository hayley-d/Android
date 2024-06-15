package com.hayleydodkins.shamlessselfpromoapp

import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class PreviewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_preview)

        //get the data values
        val message :Message = intent.getSerializableExtra("message") as Message //type casting

        val messageText ="My name is : ${message.displayName} and I am ${message.getJobDescription()}\nI have a portfolio of applications to demonstrate my skills.\nI am able to start my new position ${message.getAvailability()}.\nPlease get in touch if you feel I am suitable.\nThanks and best regards,\n${message.contactName}"

        //set the text
        val messageView : TextView = findViewById(R.id.text_view_message)
        messageView.setText(messageText)
    }



}