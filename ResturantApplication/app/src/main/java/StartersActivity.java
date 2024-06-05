package com.hayleydodkins.resturantapplication;

import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import androidx.cardview.widget.CardView;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.hayleydodkins.resturantapplication.databinding.ActivityStartersBinding;

public class StartersActivity extends AppCompatActivity {

    CardView starter1;
    CardView starter2;
    CardView starter3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_starters);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.starters), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        getValues();

        //addEventListners();
    }

    private void getValues(){
        this.starter1 = findViewById(R.id.starter_card1);
        this.starter2 = findViewById(R.id.starter_card2);
        this.starter3 = findViewById(R.id.starter_card3);
    }

}