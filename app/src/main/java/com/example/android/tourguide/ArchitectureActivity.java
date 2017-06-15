package com.example.android.tourguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class ArchitectureActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        final ArrayList<Attraction> attractions = new ArrayList<>();
        attractions.add(new Attraction("Fara", "Oldest church in the town.", R.drawable.architecture_fara_sieradz));
        attractions.add(new Attraction("Sieradz's market", "Old merchandise square.", R.drawable.architecture_sieradz_rynek));
        attractions.add(new Attraction("Fara", "Oldest church in the town.", R.drawable.architecture_fara_sieradz));
        attractions.add(new Attraction("Sieradz's market", "Old merchandise square.", R.drawable.architecture_sieradz_rynek));
        attractions.add(new Attraction("Fara", "Oldest church in the town.", R.drawable.architecture_fara_sieradz));
        attractions.add(new Attraction("Sieradz's market", "Old merchandise square.", R.drawable.architecture_sieradz_rynek));
        attractions.add(new Attraction("Fara", "Oldest church in the town.", R.drawable.architecture_fara_sieradz));
        attractions.add(new Attraction("Sieradz's market", "Old merchandise square.", R.drawable.architecture_sieradz_rynek));
        attractions.add(new Attraction("Fara", "Oldest church in the town.", R.drawable.architecture_fara_sieradz));
        attractions.add(new Attraction("Sieradz's market", "Old merchandise square.", R.drawable.architecture_sieradz_rynek));
        attractions.add(new Attraction("Fara", "Oldest church in the town.", R.drawable.architecture_fara_sieradz));
        attractions.add(new Attraction("Sieradz's market", "Old merchandise square.", R.drawable.architecture_sieradz_rynek));

        AttractionAdapter adapter = new AttractionAdapter(this, attractions, R.color.Architecture);

        final ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

    }
}
