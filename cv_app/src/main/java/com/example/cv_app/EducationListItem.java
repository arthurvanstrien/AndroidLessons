package com.example.cv_app;

/**
 * Created by Arthur on 21-6-2017.
 */

public class EducationListItem
{
    private int startYear;
    private int endYear;
    private int educationName;
    private int educationStory;
    private int educationStatus;

    public EducationListItem(int startYear, int endYear, int educationName, int educationStory, int educationStatus)
    {
        this.startYear = startYear;
        this.endYear = endYear;
        this.educationName = educationName;
        this.educationStory = educationStory;
        this.educationStatus = educationStatus;
    }

    public int getStartYear()
    {
        return startYear;
    }

    public int getEndYear()
    {
        return endYear;
    }

    public int getEducationName()
    {
        return educationName;
    }

    public int getEducationStory()
    {
        return educationStory;
    }

    public int getEducationStatus()
    {
        return educationStatus;
    }
}
