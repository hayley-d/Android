package com.hayleydodkins.shamlessselfpromoapp

import android.os.Bundle
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
        val contactName = intent.getStringExtra("contactName")
        val contactNumber = intent.getStringExtra("contactNumber")
        val displayName = intent.getStringExtra("displayName")
        val startDate = intent.getStringExtra("startDate")
        val junior = intent.getBooleanExtra("junior",false)
        val immStart = intent.getBooleanExtra("immStart",false)
        val jobTitle = intent.getStringExtra("jobTitle")
    }
}