package com.example.android.tourguide;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView architecture = (TextView) findViewById(R.id.architecture);
        TextView news = (TextView) findViewById(R.id.news);
        TextView festivals = (TextView) findViewById(R.id.festivals);
        TextView food = (TextView) findViewById(R.id.food);

        architecture.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                Intent architectureIntent = new Intent(MainActivity.this, ArchitectureActivity.class);

                startActivity(architectureIntent);
            }
        });
        festivals.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                Intent festivalsIntent = new Intent(MainActivity.this, FestivalsActivity.class);

                startActivity(festivalsIntent);
            }
        });
        news.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                Intent newsIntent = new Intent(MainActivity.this, ActivitiesActivity.class);

                startActivity(newsIntent);
            }
        });
        food.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                Intent foodIntent = new Intent(MainActivity.this, FoodActivity.class);

                startActivity(foodIntent);
            }
        });

    }
}
