package com.example.track2_assessment;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MicroArchitectureListView extends AppCompatActivity {

    private ArrayList<Microarchitecture> microarchitectures;
    private ListView microarchitectureListView;
    private ArrayAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_micro_architecture_list_view);

        Intent intent = getIntent();
        microarchitectures = (ArrayList<Microarchitecture>) intent.getSerializableExtra("MicroarchitectureList");

        microarchitectureListView = (ListView) findViewById(R.id.MicroArchitectureListView);
        adapter = new ArrayAdapter(this.getApplicationContext(), android.R.layout.simple_list_item_1, microarchitectures);
        microarchitectureListView.setAdapter(adapter);
    }
}
