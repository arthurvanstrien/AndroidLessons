package com.example.track3_practice;

import java.io.Serializable;

/**
 * Created by Arthur on 10-5-2017.
 */

public class SpotifyItem implements Serializable
{
    private String albumName;
    private String albumImageUrl;

    public SpotifyItem(String albumName, String albumImageUrl)
    {
        this.albumName = albumName;
        this.albumImageUrl = albumImageUrl;
    }

    public String getAlbumName()
    {
        return albumName;
    }

    public void setAlbumName(String albumName)
    {
        this.albumName = albumName;
    }

    public String getAlbumImageUrl()
    {
        return albumImageUrl;
    }

    public void setAlbumImageUrl(String albumImageUrl)
    {
        this.albumImageUrl = albumImageUrl;
    }
}
