package com.example.android.tourguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by Jam on 15.06.2017.
 */

public class FoodActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);


        final ArrayList<Attraction> attractions = new ArrayList<>();
        attractions.add(new Attraction("Cukier", "Fancy restaurant in Sieradz's market", R.drawable.food_cukier));
        attractions.add(new Attraction("Incognito", "à la pizzeria, à la cafeteria, good choice for meeting", R.drawable.food_incognito));
        attractions.add(new Attraction("Cukier", "Fancy restaurant in Sieradz's market", R.drawable.food_cukier));
        attractions.add(new Attraction("Incognito", "à la pizzeria, à la cafeteria, good choice for meeting", R.drawable.food_incognito));

        AttractionAdapter adapter = new AttractionAdapter(this, attractions, R.color.Food);

        final ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

    }
}
