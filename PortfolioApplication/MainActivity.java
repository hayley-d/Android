package com.hayleydodkins.portfolioapplication;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        RecyclerView list = findViewById(R.id.main);

        Project[] projects = new Project[] {
            new Project("Getting Started Application","First Android project I coded!",R.drawable.getting_started),
            new Project("BMI Calculator","Just a simple BMI calculator.",R.drawable.tape),
            new Project("Inch to Meter Calculator","A calculator that converts inches to meters. (but not the other way round :( )",R.drawable.calculator),
            new Project("Motivational Quote Application","A static page that displays a single motivational quote (very interesting). ",R.drawable.quote),
            new Project("Restaurant Application","A restaurant application for a waffle cafe called Stack Overflow, they only sell waffles.",R.drawable.hungry_developer)
        };

        ProjectsAdapter adapter = new ProjectsAdapter(projects);

        list.setAdapter(adapter);
    }
}