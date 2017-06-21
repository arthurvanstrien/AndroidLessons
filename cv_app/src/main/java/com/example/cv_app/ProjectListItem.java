package com.example.cv_app;

/**
 * Created by Arthur on 22-6-2017.
 */

public class ProjectListItem
{
    private int name;
    private String image;

    public ProjectListItem(int name, String image)
    {
        this.name = name;
        this.image = image;
    }

    public int getName()
    {
        return name;
    }

    public String getImage()
    {
        return image;
    }
}
