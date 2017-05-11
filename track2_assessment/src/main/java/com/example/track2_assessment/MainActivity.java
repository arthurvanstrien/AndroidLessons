package com.example.track2_assessment;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Microarchitecture> architectures = new ArrayList<>();
    private Button archListButtton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        architectures.add(new Microarchitecture("I7-5820K", 3300, "LGA-2011-v3", 6, "Intel"));
        architectures.add(new Microarchitecture("I7-6800K", 3400, "LGA-2011-v3", 8, "Intel"));
        architectures.add(new Microarchitecture("I7-6850K", 3000, "LGA-2011-v3", 10, "Intel"));
        architectures.add(new Microarchitecture("I7-5960X", 3000, "LGA-2011-v3", 6, "Intel"));
        architectures.add(new Microarchitecture("I7-6900K", 3200, "LGA-2011-v3", 8, "Intel"));
        architectures.add(new Microarchitecture("I7-5930K", 3300, "LGA-2011-v3", 6, "Intel"));
        architectures.add(new Microarchitecture("Xeon-E52630", 2200, "LGA-2011-v3", 10, "Intel"));
        architectures.add(new Microarchitecture("Xeon-E52620", 2100, "LGA-2011-v3", 8, "Intel"));
        architectures.add(new Microarchitecture("Xeon-E51630", 3700, "LGA-2011-v3", 4, "Intel"));
        architectures.add(new Microarchitecture("Ryzen7-1700", 3000, "AM4", 6, "AMD"));
        architectures.add(new Microarchitecture("Ryzen7-1800X", 3600, "AM4", 8, "AMD"));
        architectures.add(new Microarchitecture("Ryzen7-1700X", 3400, "AM4", 6, "AMD"));
        architectures.add(new Microarchitecture("Ryzen5-1600", 3200, "AM4", 6, "AMD"));
        architectures.add(new Microarchitecture("Ryzen5-1600X", 3600, "AM4", 6, "AMD"));
        architectures.add(new Microarchitecture("Ryzen5-1400", 3200, "AM4", 4, "AMD"));

        archListButtton = (Button) findViewById(R.id.showArchitecturesButton);
        archListButtton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MicroArchitectureListView.class);
                intent.putExtra("MicroarchitectureList", architectures);
                startActivity(intent);
            }
        });

    }
}
