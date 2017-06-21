package com.example.cv_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class Experience extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        getSupportActionBar().setTitle(R.string.experienceTitle);

        ArrayList<ExperienceListItem> experienceListItemArrayList = new ArrayList<>();
        experienceListItemArrayList.add(new ExperienceListItem(2007, 2010, R.string.experienceNameApotheekSterrenburg, R.string.experienceStoryApotheekSterrenburg, R.string.experienceTypeWork));
        experienceListItemArrayList.add(new ExperienceListItem(2009, 2010, R.string.experienceNameBraun, R.string.experienceStoryBraun, R.string.experienceTypeWork));
        experienceListItemArrayList.add(new ExperienceListItem(2010, 2012, R.string.experienceNamePersgroep, R.string.experienceStoryPersgroep, R.string.experienceTypeWork));
        experienceListItemArrayList.add(new ExperienceListItem(2012, 2012, R.string.experienceNameHollandShieldingSystems, R.string.experienceStoryHollandShieldingSystems, R.string.experienceTypeInternship));
        experienceListItemArrayList.add(new ExperienceListItem(2012, 2016, R.string.experienceNameLisa, R.string.experienceStoryLisa, R.string.experienceTypeInternship));
        experienceListItemArrayList.add(new ExperienceListItem(2012, 2013, R.string.experienceNameApotheekSterrenburg, R.string.experienceStoryApotheekSterrenburg, R.string.experienceTypeWork));
        experienceListItemArrayList.add(new ExperienceListItem(2015, 2016, R.string.experienceNameStudentAanHuis, R.string.experienceStoryStudentAanHuis, R.string.experienceTypeWork));
        experienceListItemArrayList.add(new ExperienceListItem(2015, 2016, R.string.experienceNameRexMedia, R.string.experienceStoryRexMedia, R.string.experienceTypeWork));

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_experience);

        ListView experienceViewList = (ListView) findViewById(R.id.experienceListView);
        ArrayAdapter experienceListAdapter = new ExperienceListAdapter(this, experienceListItemArrayList);
        experienceViewList.setAdapter(experienceListAdapter);
    }
}
