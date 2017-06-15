package com.example.android.tourguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class ActivitiesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);


        final ArrayList<Attraction> attractions = new ArrayList<>();
        attractions.add(new Attraction("Rope park", "Place near MOSiR...", R.drawable.activities_rope_park));
        attractions.add(new Attraction("Rope park", "Place near MOSiR...", R.drawable.activities_rope_park));
        attractions.add(new Attraction("Rope park", "Place near MOSiR...", R.drawable.activities_rope_park));
        attractions.add(new Attraction("Rope park", "Place near MOSiR...", R.drawable.activities_rope_park));

        AttractionAdapter adapter = new AttractionAdapter(this, attractions, R.color.Activities);

        final ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

    }
}
