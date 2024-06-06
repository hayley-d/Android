package com.hayleydodkins.resturantapplication;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainsActivity extends AppCompatActivity {

   // CardView main1;
    /*CardView main2;
    CardView main3;*/

    ListView list;

    Dish[] mainsDishes = new Dish[] {new Dish("Terminal Truffle Mushroom Waffles","Waffles topped with sautéed mushrooms in a creamy truffle sauce.",19.0),new Dish("Bliss Berry Byte Waffles","Sweet waffles topped with a mixture of fresh berries, whipped cream, and a drizzle of honey.",13),new Dish("Bitstream Banana Biscoff Waffles","Waffles spread with Biscoff and layered with banana slices, finished with a sprinkle of chopped nuts.",15.0),new Dish("Logic Lemon Ricotta Waffles","Light and fluffy waffles infused with lemon zest and ricotta cheese, served with a berry compote.",18.0),new Dish("Crypto Chicken Waffles","Savory waffles topped with crispy chicken tenders, drizzled with spicy honey and served with a side of coleslaw.",19),new Dish("Hackathon Ham & Cheese Waffles","Waffles filled with melted cheese and sliced turkey ham, served with a side of dijon mustard.",17.0),new Dish("Pixel Pesto Chicken Waffles","Grilled chicken served on savory waffles with a generous drizzle of pesto sauce and sun-dried tomatoes.",16.0),new Dish("Source Code Smoked Salmon Waffles","Waffles topped with smoked salmon, cream cheese, capers, and red onions.",28),new Dish("Glitch Greek Waffles","Waffles topped with grilled chicken, feta cheese, tomatoes, cucumbers, olives, and a drizzle of tzatziki sauce.",29),new Dish("Stacked S'mores Waffles","Waffles layered with marshmallow fluff, chocolate sauce, and graham cracker crumbs.",29),new Dish("Decryption Duck Waffles","Waffles topped with crispy duck, hoisin sauce, and sliced green onions.",27),new Dish("Gigabyte Greek Yogurt Waffles","Sweet waffles served with a side of Greek yogurt, honey, and mixed berries.",19),new Dish("Buffer Blueberry Waffles","Sweet waffles loaded with fresh blueberries, blueberry compote, and a dollop of whipped cream.",17)};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_mains);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        getValues();

        setUpListView();
    }

    private void getValues(){
        //this.main1 = findViewById(R.id.main_card1);
        /*this.main2 = findViewById(R.id.main_card2);
        this.main3 = findViewById(R.id.main_card3);*/
        this.list = findViewById(R.id.list_view);
    }

    private void setUpListView(){
        ArrayAdapter<Dish> arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,mainsDishes);
        list.setAdapter(arrayAdapter);
    }
}