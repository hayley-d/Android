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

    private EditText textAge;
    private EditText textHieght;
    private EditText textWeight;
    private RadioButton radioValueMale;
    private RadioButton radioValueFemale;
    private TextView resultValue;
    private TextView resultText;
    private Button calculateBtn;

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
        findViews();

        //Add event listner
        addClickListner();

        Toast.makeText(this,"Toasting the toast....",Toast.LENGTH_LONG).show();
    }

    private void findViews(){
         this.textAge = findViewById(R.id.text_age);
        this.textHieght = findViewById(R.id.text_height);
        this.textWeight = findViewById(R.id.text_weight);
        this.radioValueMale = findViewById(R.id.radio_male);
        this.radioValueFemale = findViewById(R.id.radio_female);
        this.resultValue = findViewById(R.id.result_bmi);
        this.resultText = findViewById(R.id.result_text);
        this.calculateBtn = findViewById(R.id.calculate_btn);
    }

    private void addClickListner(){
        //Add event listner to the button
        calculateBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double bmi = claculateBmi();
                setBmiOutcome(bmi);
                Toast.makeText(MainActivity.this,"Calculating BMI...",Toast.LENGTH_LONG).show();
            }
        });
    }

    private double claculateBmi(){
        double weight = Double.parseDouble(textWeight.getText().toString());
        double height = Double.parseDouble(textHieght.getText().toString());
        double bmi = Math.round((weight / (height * height))*100.0)/100.0;
        resultValue.setText(String.valueOf(bmi));

        return bmi;
    }

    private void setBmiOutcome(double bmi)
    {
        if(bmi <= 18.5)
        {
            resultText.setText("You are underweight!");
        }
        else if(bmi > 18.5 && bmi <= 24.9)
        {
            resultText.setText("You are in the optimum range :)");
        }
        else if(bmi > 24.9 && bmi <= 29.9)
        {
            resultText.setText("You are overweight!");
        }
        else if(bmi > 29.9 && bmi <= 34.9)
        {
            resultText.setText("You are class 1 obese!");
        }
        else if(bmi > 34.9 && bmi <= 39.9)
        {
            resultText.setText("You are class 2 obese!");
        }
        else{
            resultText.setText("You are morbidly obese!");
        }
    }
}