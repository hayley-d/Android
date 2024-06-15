package com.hayleydodkins.shamlessselfpromoapp

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class PreviewActivity : AppCompatActivity() {
    lateinit var message : Message
    lateinit var messageText : String


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_preview)

        displayMessage()

    }


    private fun displayMessage() {
        //get the data values
        message = intent.getSerializableExtra("message") as Message //type casting

        messageText = "My name is : ${message.displayName} and I am ${message.getJobDescription()}\nI have a portfolio of applications to demonstrate my skills.\nI am able to start my new position ${message.getAvailability()}.\nPlease get in touch if you feel I am suitable.\nThanks and best regards,\n${message.contactName}"

        //set the text
        val messageView : TextView = findViewById(R.id.text_view_message)
        messageView.setText(messageText)
    }

    private fun setupButton()
    {
        val button : Button = findViewById(R.id.message_submit_button)
        button.setOnClickListener{
            //Send the message intent
            //Create an implicit intent
            //Create an sms message intent

            val messageIntent = Intent(Intent.ACTION_SENDTO).apply {
                data = Uri.parse("smsto: ${message.contactNumber}")
                putExtra("sms_body",messageText)
            }

            startActivity(messageIntent)

        }
    }
}