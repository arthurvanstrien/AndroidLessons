package com.example.track3_practice2;

import java.io.Serializable;

/**
 * Created by dkroeske on 09/05/2017.
 */

public class SpotifyItem implements Serializable {

    public String getAlbumName() {
        return albumName;
    }

    public void setAlbumName(String albumName) {
        this.albumName = albumName;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public SpotifyItem(String albumName, String image_url) {

        this.albumName = albumName;
        this.imageUrl = image_url;
    }

    private String albumName;

    @Override
    public String toString() {
        return "SpotifyItem{" +
                "albumName='" + albumName + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                '}';
    }

    private String imageUrl;

}
