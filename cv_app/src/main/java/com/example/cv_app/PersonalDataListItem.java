package com.example.cv_app;

/**
 * Created by Arthur on 20-6-2017.
 */

public class PersonalDataListItem
{
    private int field;
    private int value;

    public PersonalDataListItem(int field, int value)
    {
        this.field = field;
        this.value = value;
    }

    public int getField()
    {
        return field;
    }

    public int getValue()
    {
        return value;
    }
}
