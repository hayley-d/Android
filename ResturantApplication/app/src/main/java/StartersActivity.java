package com.hayleydodkins.resturantapplication;

import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

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

    /*CardView starter1;
    CardView starter2;
    CardView starter3;*/

    ListView list;

    Dish[] starterDishes = new Dish[] {new Dish("Byte-sized Maple Minis","Tiny waffles infused with rich maple syrup, perfect for a sweet start.",9.0),new Dish("Sugar Code Nibbles","Bite-sized waffles lightly coated in powdered sugar for a simple, sweet treat.",3),new Dish("Syntax Cinnamon Sticks","Crispy waffle sticks dusted with a sweet cinnamon sugar blend.",5.0),new Dish("Array of Berry Bites","A selection of mini waffles topped with fresh mixed berries and a hint of whipped cream.",8.0),new Dish("Nutty Node Nibbles","Small waffles sprinkled with nut butter and a drizzle of honey.",9),new Dish("Caramel Cluster Bytes","Bite-sized waffles topped with caramel sauce and a sprinkle of sea salt.",7.0),new Dish("Fruity Fragment Bites","Mini waffles adorned with a medley of fresh fruit slices.",6.0),new Dish("Cocoa Crunch Code","Small waffles dipped in chocolate and topped with crunchy chocolate bits.",8),new Dish("Cherry Chip Chunks","Small waffle bites loaded with cherry bits and chocolate chips.",9),new Dish("Lemon Loop Layers","Mini waffles layered with tangy lemon curd and a sprinkle of powdered sugar.",9),new Dish("Peach Pixel Pops","Bite-sized waffles topped with caramelized peaches and a hint of cinnamon.",7),new Dish("Strawberry Stack Segments","Petite waffles stacked with fresh strawberry slices and a dusting of powdered sugar.",9),new Dish("Banana Bit Stacks","Small waffle stack layered with caramelized banana and a scoop of ice cream.",7)};

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
        setUpListView();
    }

    private void getValues(){
        /*this.starter1 = findViewById(R.id.starter_card1);
        this.starter2 = findViewById(R.id.starter_card2);
        this.starter3 = findViewById(R.id.starter_card3);*/
        this.list = findViewById(R.id.list_view);
    }

    private void setUpListView(){
        ArrayAdapter<Dish> arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,starterDishes);
        list.setAdapter(arrayAdapter);
    }

}