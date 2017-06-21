package com.example.cv_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class Education extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        getSupportActionBar().setTitle(R.string.educationTitle);

        ArrayList<EducationListItem> educationList = new ArrayList<>();
        educationList.add(new EducationListItem(2007, 2008, R.string.educationNameDalton, R.string.educationStoryDalton, R.string.educationStatusNotAchieved));
        educationList.add(new EducationListItem(2008, 2011, R.string.educationNameLingewaal, R.string.educationStoryLingewaal, R.string.educationStatusAchieved));
        educationList.add(new EducationListItem(2011, 2016, R.string.educationNameDavinci, R.string.educationStoryDavinci, R.string.educationStatusAchieved));
        educationList.add(new EducationListItem(2016, R.string.educationStatusCurrent, R.string.educationNameAvans, R.string.educationStoryAvans, R.string.educationStatusCurrent));

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_education);

        ListView educationViewList = (ListView) findViewById(R.id.educationListView);
        ArrayAdapter educationListAdapter = new EducationListAdapter(this, educationList);
        educationViewList.setAdapter(educationListAdapter);
        educationViewList.setEnabled(false);
    }
}
