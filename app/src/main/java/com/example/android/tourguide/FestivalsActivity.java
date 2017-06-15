package com.example.android.tourguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class FestivalsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);


        final ArrayList<Attraction> attractions = new ArrayList<>();
        attractions.add(new Attraction("Festival of colors", "Have some fun fighting with colors", R.drawable.festivals_festival_of_colors));
        attractions.add(new Attraction("Open hair festival", "Let the best world hairdresser make you even beautifier", R.drawable.festivals_open_hair_festival));
        attractions.add(new Attraction("Festival of colors", "Have some fun fighting with colors", R.drawable.festivals_festival_of_colors));
        attractions.add(new Attraction("Open hair festival", "Let the best world hairdresser make you even beautifier", R.drawable.festivals_open_hair_festival));

        AttractionAdapter adapter = new AttractionAdapter(this, attractions, R.color.Festivals);

        final ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

    }
}
