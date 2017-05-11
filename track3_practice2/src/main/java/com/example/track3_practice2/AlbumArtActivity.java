package com.example.track3_practice2;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class AlbumArtActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_album_art);

        SpotifyItem item = (SpotifyItem) getIntent().
                getSerializableExtra("SPOTIFY_ITEM");
        String image_url = item.getImageUrl();

        ImageView album_art = (ImageView) findViewById(R.id.album_iv_id);

        Context context = this.getApplicationContext();

        Picasso.with(context).load(image_url).into(album_art);

    }
}
