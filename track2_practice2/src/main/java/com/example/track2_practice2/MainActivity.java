package com.example.track2_practice2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Microarchitectures> microarchitectures = new ArrayList<>();
    ListView microarchitecturesListView;
    ArrayAdapter maAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        microarchitectures.add(new Microarchitectures("4004", 0.108, "DIP", 0));
        microarchitectures.add(new Microarchitectures("I7-7700", 4500.0, "LGA-1151", 4));

        microarchitecturesListView = (ListView) findViewById(R.id.microachitectureListView);
        maAdapter = new ArrayAdapter(this.getApplicationContext(),
                android.R.layout.simple_list_item_1,
                microarchitectures);

        microarchitecturesListView.setAdapter(maAdapter);
    }

    public MainActivity()
    {

    }


}
