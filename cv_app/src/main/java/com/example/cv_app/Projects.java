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
        projectListItemArrayList.add(new ProjectListItem(R.string.projectNameWeatherStation, R.string.projectDescriptionWeatherStation, R.string.projectSDescriptionWeatherStation, R.drawable.ws_windspeed, R.drawable.ws_buitentemperatuur));
        projectListItemArrayList.add(new ProjectListItem(R.string.projectNameAGV, R.string.projectDescriptionAGV, R.string.projectSDescriptionAGV, R.drawable.boebot_3, R.drawable.boebot_1));
        projectListItemArrayList.add(new ProjectListItem(R.string.projectNameFestivalPlanner, R.string.projectDescriptionFestivalPlanner, R.string.projectSDescriptionFestivalPlanner, R.drawable.festivalplanner2, R.drawable.festivalplanner3));
        projectListItemArrayList.add(new ProjectListItem(R.string.projectNameInteractiveApp, R.string.projectDescriptionInteractiveApp, R.string.projectSDescriptionInteractiveApp, R.drawable.coastercam, R.drawable.coastercam2));
        projectListItemArrayList.add(new ProjectListItem(R.string.projectNameCurriculumVitea, R.string.projectDescriptionCurriculumVitea, R.string.projectSDescriptionCurriculumVitea, R.drawable.cvapp1, R.drawable.iconcv));
        projectListItemArrayList.add(new ProjectListItem(R.string.projectNameDoorbell, R.string.projectDescriptionDoorbell, R.string.projectSDescriptionDoorbell, R.drawable.p1420848, R.drawable.p1420846));

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_projects);

        ListView projectsList = (ListView) findViewById(R.id.projectsList);
        ArrayAdapter projectsListAdapter = new ProjectListAdapter(this, projectListItemArrayList);
        projectsList.setAdapter(projectsListAdapter);
        projectsList.setOnItemClickListener((parent, view, position, id) ->
        {
            Intent projectIntend = new Intent(getApplicationContext(), ProjectDetails.class);
            projectIntend.putExtra("projectName", projectListItemArrayList.get(position).getName());
            projectIntend.putExtra("projectDescription", projectListItemArrayList.get(position).getDescription());
            projectIntend.putExtra("projectImage", projectListItemArrayList.get(position).getImage());
            startActivity(projectIntend);
        });
    }
}
