package com.example.cv_app;

/**
 * Created by Arthur on 22-6-2017.
 */

public class ProjectListItem
{
    private int name;
    private int description;
    private int shortDescription;
    private String image;
    private String icon;

    public ProjectListItem(int name, int description, int shortDescription, String image, String icon)
    {
        this.name = name;
        this.description = description;
        this.shortDescription = shortDescription;
        this.image = image;
        this.icon = icon;
    }

    public int getName()
    {
        return name;
    }

    public int getDescription()
    {
        return description;
    }

    public int getShortDescription()
    {
        return shortDescription;
    }

    public String getImage()
    {
        return image;
    }

    public String getIcon()
    {
        return icon;
    }
}
