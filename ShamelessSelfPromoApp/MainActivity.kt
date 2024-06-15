package com.hayleydodkins.shamlessselfpromoapp

import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.CheckBox
import android.widget.Spinner
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.textfield.TextInputEditText




class MainActivity : AppCompatActivity() {

    private var contactNameInput : TextInputEditText? = null
    private var numberInput : TextInputEditText? = null
    private var displayNameInput : TextInputEditText? = null

    private var startDateInput : TextInputEditText? = null
    private var juniorCheckBox : CheckBox? = null
    private var immStartCheckBox : CheckBox? = null
    private var jobTitleInput : Spinner? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val button : Button = findViewById(R.id.submit_button)

        button.setOnClickListener{
            Toast.makeText(this,"Creating Promo ...",Toast.LENGTH_LONG).show()
            onSubmitClick()
        }

        val spinnerValues : Array<String> = arrayOf("Software Engineer","Penetration Tester","Chief Information Security Officer","Network Engineer","Front-end Developer","Backend Developer","Game Designer")

        val spinnerAdapter = ArrayAdapter<String> (this,android.R.layout.simple_spinner_dropdown_item,spinnerValues)
        jobTitleInput  = findViewById(R.id.spinner_job_title)
        jobTitleInput?.adapter = spinnerAdapter
    }


    private fun onSubmitClick (){
        //Get the input data
         contactNameInput  = findViewById(R.id.edit_text_contact_name)
         numberInput  = findViewById(R.id.edit_text_contact_number)
         displayNameInput  = findViewById(R.id.edit_text_display_name)
        startDateInput  = findViewById(R.id.edit_text_start)
        juniorCheckBox  = findViewById(R.id.check_box_junior)
        immStartCheckBox  = findViewById(R.id.check_box_im_start)


        //Convert into strings
        val contactName = contactNameInput?.getText().toString()
        val number = numberInput?.getText().toString()
        val displayName = displayNameInput?.getText().toString()
        val date = startDateInput?.getText().toString()
        val junior = juniorCheckBox?.isChecked
        val immStart = immStartCheckBox?.isChecked
        val jobTitle = jobTitleInput?.selectedItem.toString()

        if(jobTitle != null && immStart != null && junior != null)
        {
            val textStr = "Contact Name: $contactName\n Contact Number: $number\nDisplay Name: $displayName\nStart Date: $date\nIs Junior: $junior\nImmidate Start: $immStart\nJob Title: $jobTitle"
        }

        //Create new explicit intent
        val previewActivityIntent = Intent(this,PreviewActivity::class.java)

        //Pass the data through
        previewActivityIntent.putExtra("contactName",contactName)
        previewActivityIntent.putExtra("contactNumber",number)
        previewActivityIntent.putExtra("displayName",displayName)
        previewActivityIntent.putExtra("startDate",date)
        previewActivityIntent.putExtra("junior",junior)
        previewActivityIntent.putExtra("immStart",immStart)
        previewActivityIntent.putExtra("jobTitle",jobTitle)

        //navigate to the new activity
        startActivity(previewActivityIntent)

    }
}