package com.example.app1;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class MainActivity extends AppCompatActivity {
    private final
    String[] cities = {"Seatlle", "Bothell", "Kirkland", "Bellevue", "Lynnwood", "Renton","Redmond","Spokane",
            "Vancouver", "Tacoma","Olympia","Bellingham","Arlington","Everett","Woodinville","Monroe","New Castle","Ballard","Lacey"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, R.layout.listview_layout, R.id.city, cities);
        ListView lv = findViewById(R.id.citylist);
        lv.setAdapter(adapter);

    }

}