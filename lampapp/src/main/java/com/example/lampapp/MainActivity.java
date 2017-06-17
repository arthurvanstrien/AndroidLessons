package com.example.lampapp;

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
    private Button lampButton1;
    private Button lampButton2;
    private Button lampButton3;
    private Button lampButton4;
    private Button lampButton5;
    private Button lampButton6;
    private Button lampButton7;
    private Button lampButton8;
    private Button lampButton9;
    private Button lampButton10;

    private boolean lampButtonState1;
    private boolean lampButtonState2;
    private boolean lampButtonState3;
    private boolean lampButtonState4;
    private boolean lampButtonState5;
    private boolean lampButtonState6;
    private boolean lampButtonState7;
    private boolean lampButtonState8;
    private boolean lampButtonState9;
    private boolean lampButtonState10;

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

        try
        {
            final URL url = new URL(urls[0]);

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

            lampButtonState1 = false;
            lampButtonState2 = false;
            lampButtonState3 = false;
            lampButtonState4 = false;
            lampButtonState5 = false;
            lampButtonState6 = false;
            lampButtonState7 = false;
            lampButtonState8 = false;
            lampButtonState9 = false;
            lampButtonState10 = false;

            lampButton1.setOnClickListener(new View.OnClickListener()
            {
                @Override
                public void onClick(View v)
                {
                    if(lampButtonState1)
                    {
                        new PostRequest(url, 1, false).execute();
                        lampButtonState1 = false;
                    }
                    else
                    {
                        new PostRequest(url, 1, true).execute();
                        lampButtonState1 = true;
                    }
                }
            });

            lampButton2.setOnClickListener(new View.OnClickListener()
            {
                @Override
                public void onClick(View view)
                {
                    if(lampButtonState2)
                    {
                        new PostRequest(url, 2, false).execute();
                        lampButtonState2 = false;
                    }
                    else
                    {
                        new PostRequest(url, 2, true).execute();
                        lampButtonState2 = true;
                    }
                }
            });

            lampButton3.setOnClickListener(new View.OnClickListener()
            {
                @Override
                public void onClick(View view)
                {
                    if(lampButtonState3)
                    {
                        new PostRequest(url, 3, false).execute();
                        lampButtonState3 = false;
                    }
                    else
                    {
                        new PostRequest(url, 3, true).execute();
                        lampButtonState3 = true;
                    }
                }
            });

            lampButton4.setOnClickListener(new View.OnClickListener()
            {
                @Override
                public void onClick(View view)
                {
                    if(lampButtonState4)
                    {
                        new PostRequest(url, 4, false).execute();
                        lampButtonState4 = false;
                    }
                    else
                    {
                        new PostRequest(url, 4, true).execute();
                        lampButtonState4 = true;
                    }
                }
            });

            lampButton5.setOnClickListener(new View.OnClickListener()
            {
                @Override
                public void onClick(View view)
                {
                    if(lampButtonState5)
                    {
                        new PostRequest(url, 5, false).execute();
                        lampButtonState5 = false;
                    }
                    else
                    {
                        new PostRequest(url, 5, true).execute();
                        lampButtonState5 = true;
                    }
                }
            });

            lampButton6.setOnClickListener(new View.OnClickListener()
            {
                @Override
                public void onClick(View view)
                {
                    if(lampButtonState6)
                    {
                        new PostRequest(url, 6, false).execute();
                        lampButtonState6 = false;
                    }
                    else
                    {
                        new PostRequest(url, 6, true).execute();
                        lampButtonState6 = true;
                    }
                }
            });

            lampButton7.setOnClickListener(new View.OnClickListener()
            {
                @Override
                public void onClick(View view)
                {
                    if(lampButtonState7)
                    {
                        new PostRequest(url, 7, false).execute();
                        lampButtonState7 = false;
                    }
                    else
                    {
                        new PostRequest(url, 7, true).execute();
                        lampButtonState7 = true;
                    }
                }
            });

            lampButton8.setOnClickListener(new View.OnClickListener()
            {
                @Override
                public void onClick(View view)
                {
                    if(lampButtonState8)
                    {
                        new PostRequest(url, 8, false).execute();
                        lampButtonState8 = false;
                    }
                    else
                    {
                        new PostRequest(url, 8, true).execute();
                        lampButtonState8 = true;
                    }
                }
            });

            lampButton9.setOnClickListener(new View.OnClickListener()
            {
                @Override
                public void onClick(View view)
                {
                    if(lampButtonState9)
                    {
                        new PostRequest(url, 9, false).execute();
                        lampButtonState9 = false;
                    }
                    else
                    {
                        new PostRequest(url, 9, true).execute();
                        lampButtonState9 = true;
                    }
                }
            });

            lampButton10.setOnClickListener(new View.OnClickListener()
            {
                @Override
                public void onClick(View view)
                {
                    if(lampButtonState10)
                    {
                        new PostRequest(url, 10, false).execute();
                        lampButtonState10 = false;
                    }
                    else
                    {
                        new PostRequest(url, 10, true).execute();
                        lampButtonState10 = true;
                    }
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
