package com.hayleydodkins.bmicalculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        //get the all text
        EditText textAge = findViewById(R.id.text_age);
        EditText textHieght = findViewById(R.id.text_height);
        EditText textWeight = findViewById(R.id.text_weight);
        RadioButton radioValueMale = findViewById(R.id.radio_male);
        RadioButton radioValueFemale = findViewById(R.id.radio_female);
        TextView resultValue = findViewById(R.id.result_bmi);
        TextView resultText = findViewById(R.id.result_text);
        Button calculateBtn = findViewById(R.id.calculate_btn);

        //Add event listner to the button
        calculateBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"Calculating BMI...",Toast.LENGTH_LONG).show();
            }
        });



        Toast.makeText(this,"Toasting the toast....",Toast.LENGTH_LONG).show();
    }
}