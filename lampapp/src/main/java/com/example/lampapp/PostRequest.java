package com.example.lampapp;

import android.os.AsyncTask;
import android.util.Log;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Created by Arthur on 28-5-2017.
 */

public class PostRequest extends AsyncTask<String, Void, Void>
{
    private String value;
    private int number;
    private URL url;

    public PostRequest(URL url, int number, boolean value)
    {
        this.value = Boolean.toString(value);
        this.number = number;
        this.url = url;
    }

    @Override
    protected Void doInBackground(String... params)
    {
        try
        {
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("POST");
            connection.setRequestProperty("USER-AGENT", "None");
            connection.setRequestProperty("Content-type", "application/json");
            connection.connect();

            String body = "{";
            body += "\"number\":\"" + number + "\",";
            body += "\"value\":\"" + value + "\"";
            body += "}";

            OutputStream outputStream = connection.getOutputStream();
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(outputStream, "UTF-8"));
            writer.write(body);

            writer.flush();
            writer.close();
            outputStream.close();
            int responseCode = connection.getResponseCode();
            if(responseCode != 200)
                //do something when request is not fulfilled.

            connection.disconnect();
        }
        catch (IOException e)
        {
            Log.d("Debugging", "URL CONNECTION FAILED!");
            e.printStackTrace();
        }

        return null;
    }
}
