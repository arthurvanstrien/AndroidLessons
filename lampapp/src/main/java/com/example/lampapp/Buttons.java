package com.example.lampapp;

import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ToggleButton;
import java.net.URL;

/**
 * Created by Arthur on 25-5-2017.
 */

public class Buttons extends AppCompatActivity
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

    public Buttons(final URL url)
    {
        Log.d("Debugging", "Arrived at button method.");

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
                /*
                Log.d("Debugging", "Button one pressed!");

                if(lampButton1.isEnabled())
                    new PostRequest("false", url);
                else
                    new PostRequest("true", url);
                    */
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
}
