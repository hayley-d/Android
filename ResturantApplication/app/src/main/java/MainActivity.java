package com.hayleydodkins.resturantapplication;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    CardView starterCard;

    CardView main1;

    TextView emailAddress;


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

        getValues();

        addEventListners();
    }

    private void getValues(){
        this.starterCard = findViewById(R.id.starter_card1);
        this.emailAddress = findViewById(R.id.resturant_email);
        this.main1 = findViewById(R.id.main_card1);
    }

    private void addEventListners(){
        //Create Intent (Explicit Intent)
        Intent startersActivityIntent = new Intent(MainActivity.this,StartersActivity.class);
        Intent mainsActivityIntent = new Intent(MainActivity.this,MainsActivity.class);
        Intent emailIntent = new Intent(Intent.ACTION_SENDTO);
        emailIntent.setData(Uri.parse("mailto:"+emailAddress.getText().toString()));

        starterCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(startersActivityIntent);
            }
        });

        main1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(mainsActivityIntent);
            }
        });

        emailAddress.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                startActivity(emailIntent);
            }
        });
    }
}