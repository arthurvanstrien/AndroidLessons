package com.example.lampapp;

import android.os.AsyncTask;
import android.util.Log;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Created by Arthur on 28-5-2017.
 */

public class PostRequest extends AsyncTask<String, Void, Void>
{
    String value;
    URL url;

    public PostRequest(URL url)
    {
        Log.d("Debugging", "Post Request Constructor");

    }

    protected void preExecute(URL url)
    {
        Log.d("Debugging", "On Post Execute");
        this.value = "true";
        this.url = url;
    }

    @Override
    protected Void doInBackground(String... params)
    {
        Log.d("Debugging", "Do in background");

        try
        {
            Log.d("Debugging", "Creating URL connection");

            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("POST");
            connection.setRequestProperty("USER-AGENT", "None");
            connection.setRequestProperty("Content-type", "application/json");
            connection.connect();

            String body = "{";
            body += "\"number\":\"1\"";
            body += "\"value\":\"" + value + "\"";
            body += "}";

            Log.d("Debugging", "Creating output stream");

            OutputStream outputStream = connection.getOutputStream();
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(outputStream, "UTF-8"));
            writer.write(body);

            writer.flush();
            writer.close();
            outputStream.close();

            Log.d("Debugging", "Closing output stream");
        }
        catch (IOException e)
        {
            Log.d("Debugging", "URL CONNECTION FAILED!");
            Log.d("Debugging", e.getMessage());

            e.printStackTrace();
        }

        return null;
    }
}
