package com.example.cv_app;

/**
 * Created by Arthur on 21-6-2017.
 */

public class ExperienceListItem
{
    private int startYear;
    private int endYear;
    private int experienceName;
    private int experienceStory;
    private int experienceType;

    public ExperienceListItem(int startYear, int endYear, int experienceName, int experienceStory, int experienceType)
    {
        this.startYear = startYear;
        this.endYear = endYear;
        this.experienceName = experienceName;
        this.experienceStory = experienceStory;
        this.experienceType = experienceType;
    }

    public int getStartYear()
    {
        return startYear;
    }

    public int getEndYear()
    {
        return endYear;
    }

    public int getExperienceName()
    {
        return experienceName;
    }

    public int getExperienceStory()
    {
        return experienceStory;
    }

    public int getExperienceType()
    {
        return experienceType;
    }
}
