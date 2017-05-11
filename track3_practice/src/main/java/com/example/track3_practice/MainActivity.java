
package com.example.track3_practice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements SpotifyTaskListener
{
    ArrayList<SpotifyItem> spotifyItems = new ArrayList<>();
    ListView listView;
    ArrayAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.albumsListView);
        adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, spotifyItems);
        listView.setAdapter(adapter);

        //Context //niet af // nog uitbreiden.
    }

    @Override
    public void onSpotifyItemAvailable(SpotifyItem item)
    {
        spotifyItems.add(item);

        //Forceer het opnieuw tekenen van de arrayList.
        adapter.notifyDataSetChanged();
    }

    private void fetchSpotifyItems() {
        SpotifyTask task = new SpotifyTask(this);

        String[] urls = new String[]
            {
                "https://api.spotify.com/v1/search?query=pink+floyd&type=album&offset=0&limit=40"
            };

        task.execute();
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l)
    {
        SpotifyItem item = (SpotifyItem) spotifyItems.get(i);
        Intent intent = new Intent(getApplicationContext(),AlbumArtActivity.class);
        intent.putExtra("SPOTIFY_ITEM", item);
        startActivity(intent);
    }
}
