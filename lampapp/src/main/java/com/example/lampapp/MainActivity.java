package com.example.lampapp;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ToggleButton;

import java.net.MalformedURLException;
import java.net.URL;

public class MainActivity extends AppCompatActivity
{
    Button lampButton1;
    Button lampButton2;
    Button lampButton3;
    Button lampButton4;
    Button lampButton5;
    Button lampButton6;
    Button lampButton7;
    Button lampButton8;
    Button lampButton9;
    Button lampButton10;

    private String[] urls = new String[]
            {
                    "http://192.168.1.20:8080",
                    "http://192.168.0.186"
            };

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d("Debugging", "Program Started");

        //newPostESP8266Task(relais1, relais2).execute(urls);

        try
        {
            final URL url = new URL(urls[0]);

            Log.d("Debugging", "URL Created");
            Log.d("Debugging", urls[0]);

            //Initialise the buttons that toggle the lamps.
            //new Buttons(url);

            lampButton1 = (ToggleButton) findViewById(R.id.lampToggle1);
            lampButton2 = (ToggleButton) findViewById(R.id.lampToggle2);
            lampButton3 = (ToggleButton) findViewById(R.id.lampToggle3);
            lampButton4 = (ToggleButton) findViewById(R.id.lampToggle4);
            lampButton5 = (ToggleButton) findViewById(R.id.lampToggle5);
            lampButton6 = (ToggleButton) findViewById(R.id.lampToggle6);
            lampButton7 = (ToggleButton) findViewById(R.id.lampToggle7);
            lampButton8 = (ToggleButton) findViewById(R.id.lampToggle8);
            lampButton9 = (ToggleButton) findViewById(R.id.lampToggle9);
            lampButton10 = (ToggleButton) findViewById(R.id.lampToggle10);

            Log.d("Debugging", "Created lampbuttons");

            lampButton1.setOnClickListener(new View.OnClickListener()
            {
                @Override
                public void onClick(View v)
                {
                    Log.d("Debugging", "Button one pressed!");

                    if(lampButton1.isEnabled())
                    {
                        Log.d("Debugging", "Enabled");
                        new PostRequest(url);

                    }
                    else
                        {
                        Log.d("Debugging", "Disabled");
                        new PostRequest(url);
                    }
                }
            });

            lampButton2.setOnClickListener(new View.OnClickListener()
            {
                @Override
                public void onClick(View view)
                {

                }
            });

            lampButton3.setOnClickListener(new View.OnClickListener()
            {
                @Override
                public void onClick(View view)
                {

                }
            });

            lampButton4.setOnClickListener(new View.OnClickListener()
            {
                @Override
                public void onClick(View view)
                {

                }
            });

            lampButton5.setOnClickListener(new View.OnClickListener()
            {
                @Override
                public void onClick(View view)
                {

                }
            });

            lampButton6.setOnClickListener(new View.OnClickListener()
            {
                @Override
                public void onClick(View view)
                {

                }
            });

            lampButton7.setOnClickListener(new View.OnClickListener()
            {
                @Override
                public void onClick(View view)
                {

                }
            });

            lampButton8.setOnClickListener(new View.OnClickListener()
            {
                @Override
                public void onClick(View view)
                {

                }
            });

            lampButton9.setOnClickListener(new View.OnClickListener()
            {
                @Override
                public void onClick(View view)
                {

                }
            });

            lampButton10.setOnClickListener(new View.OnClickListener()
            {
                @Override
                public void onClick(View view)
                {

                }
            });
        }
        catch (MalformedURLException e)
        {
            Log.d("Debugging", "URL ERROR!");

            e.printStackTrace();
        }
    }
}
