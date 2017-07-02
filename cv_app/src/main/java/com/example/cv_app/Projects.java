package com.example.cv_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class Projects extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        getSupportActionBar().setTitle(R.string.projectsTitle);

        ArrayList<ProjectListItem> projectListItemArrayList = new ArrayList<>();
        projectListItemArrayList.add(new ProjectListItem(R.string.projectNameWeatherStation, R.string.projectDescriptionWeatherStation, R.string.projectSDescriptionWeatherStation, "", ""));
        projectListItemArrayList.add(new ProjectListItem(R.string.projectNameAGV, R.string.projectDescriptionAGV, R.string.projectSDescriptionAGV, "", ""));
        projectListItemArrayList.add(new ProjectListItem(R.string.projectNameFestivalPlanner, R.string.projectDescriptionFestivalPlanner, R.string.projectSDescriptionFestivalPlanner, "", ""));
        projectListItemArrayList.add(new ProjectListItem(R.string.projectNameInteractiveApp, R.string.projectDescriptionInteractiveApp, R.string.projectSDescriptionInteractiveApp, "", ""));
        projectListItemArrayList.add(new ProjectListItem(R.string.projectNameCurriculumVitea, R.string.projectDescriptionCurriculumVitea, R.string.projectSDescriptionCurriculumVitea, "", ""));
        projectListItemArrayList.add(new ProjectListItem(R.string.projectNameDoorbell, R.string.projectDescriptionDoorbell, R.string.projectSDescriptionDoorbell, "", ""));

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_projects);

        ListView projectsList = (ListView) findViewById(R.id.projectsList);
        ArrayAdapter projectsListAdapter = new ProjectListAdapter(this, projectListItemArrayList);
        projectsList.setAdapter(projectsListAdapter);
        projectsList.setOnItemClickListener((parent, view, position, id) ->
        {
            Intent intend = new Intent(getApplicationContext(), ProjectDetails.class);
            //intend.putExtra("projectName", projectListItemArrayList.get(position).getName());
            startActivity(intend);
        });
    }
}
