package com.example.cv_app;

/**
 * Created by Arthur on 22-6-2017.
 */

public class SkillsListItem
{
    public int skillsType;
    public int skillsStory;

    public SkillsListItem(int skillsType, int skillsStory)
    {
        this.skillsType = skillsType;
        this.skillsStory = skillsStory;
    }

    public int getSkillsType()
    {
        return skillsType;
    }

    public int getSkillsStory()
    {
        return skillsStory;
    }
}
