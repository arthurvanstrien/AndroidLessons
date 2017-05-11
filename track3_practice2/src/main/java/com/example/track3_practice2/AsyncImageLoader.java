package com.example.track3_practice2;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.util.Log;
import android.widget.ImageView;

import java.io.InputStream;

/**
 * Created by dkroeske on 14/02/2017.
 */

public class AsyncImageLoader extends AsyncTask<String, Void, Bitmap> {
    ImageView imageView;

    public AsyncImageLoader(ImageView imageView) {
        this.imageView = imageView;
    }

    protected Bitmap doInBackground(String... urls) {
        String imageURL = urls[0];
        Bitmap bitmap = null;
        try {
            InputStream in = new java.net.URL(imageURL).openStream();
            bitmap = BitmapFactory.decodeStream(in);

        } catch (Exception e) {
            Log.e("Error Message", e.getMessage());
            e.printStackTrace();
        }
        return bitmap;
    }

    protected void onPostExecute(Bitmap result) {
        imageView.setImageBitmap(result);
    }
}

