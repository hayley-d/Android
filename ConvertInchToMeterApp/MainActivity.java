package com.hayleydodkins.convertinchtometer;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    EditText input;
    Button calculateBtn;

    TextView resultText;

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

        findViews();
        addClickListner();
    }

    private void findViews(){
        this.input = findViewById(R.id.inch_input);
        this.calculateBtn = findViewById(R.id.calculate_btn);
        this.resultText = findViewById(R.id.meter_text);
    }

    private void addClickListner(){
        //Add event listner to the button
        calculateBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double meters = convertToMeters();
                displayResult(meters);
                Toast.makeText(MainActivity.this,"Calculating meters...",Toast.LENGTH_LONG).show();
            }
        });
    }

    private double convertToMeters(){
        double inches = Double.parseDouble(input.getText().toString());
        return inches*0.0254;
    }

    private void displayResult(double meters){
        resultText.setText(String.valueOf(meters));
    }
}