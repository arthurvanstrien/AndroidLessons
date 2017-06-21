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
        projectListItemArrayList.add(new ProjectListItem(R.string.projectNameDoorbell, "Ze image"));

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
