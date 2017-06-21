package com.example.cv_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity
{
    ArrayList<MenuListItem> menuArrayList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        menuArrayList.add(new MenuListItem(R.string.homePersonalDataTitle, PersonalData.class));
        menuArrayList.add(new MenuListItem(R.string.homeEducationTitle, Education.class));
        menuArrayList.add(new MenuListItem(R.string.homeExperienceTitle, Experience.class));
        menuArrayList.add(new MenuListItem(R.string.homeSkillSetTitle, Temp.class));
        menuArrayList.add(new MenuListItem(R.string.homeProjectsTitle, Temp.class));
        menuArrayList.add(new MenuListItem(R.string.homeHobbyAndInterestsTitle, Temp.class));

        ListView menuList = (ListView) findViewById(R.id.menuList);
        ArrayAdapter menuAdapter = new MenuListAdapter(this, menuArrayList);
        menuList.setAdapter(menuAdapter);
        menuList.setOnItemClickListener((parent, view, position, id) ->
        {
            Intent intend = new Intent(getApplicationContext(), menuArrayList.get(position).getaClass());
            startActivity(intend);
        });
    }
}
