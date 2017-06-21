package com.example.cv_app;

/**
 * Created by Arthur on 18-6-2017.
 */

public class MenuListItem
{
    private int name;
    private Class aClass;

    public MenuListItem(int name, Class aClass)
    {
        this.name = name;
        this.aClass = aClass;
    }

    public int getName()
    {
        return name;
    }

    public Class getaClass()
    {
        return aClass;
    }
}
