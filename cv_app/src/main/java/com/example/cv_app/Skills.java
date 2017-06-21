package com.example.cv_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class Skills extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        getSupportActionBar().setTitle(R.string.skillsTitle);

        ArrayList<SkillsListItem> skillsListItemArrayList = new ArrayList<>();
        skillsListItemArrayList.add(new SkillsListItem(R.string.skillsTypeLanguages, R.string.skillStoryLanguages));
        skillsListItemArrayList.add(new SkillsListItem(R.string.skillsTypeProgrammingLanguages, R.string.skillStoryProgrammingLanguages));
        skillsListItemArrayList.add(new SkillsListItem(R.string.skillsTypeOther, R.string.skillStoryOtherSkills));

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_skills);

        ListView skillsList = (ListView) findViewById(R.id.skillsList);
        ArrayAdapter skillListAdapter = new SkillsListAdapter(this, skillsListItemArrayList);
        skillsList.setAdapter(skillListAdapter);
    }
}
