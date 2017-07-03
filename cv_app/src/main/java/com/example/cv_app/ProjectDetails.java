package com.example.cv_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ProjectDetails extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_project_details);

        Intent projectDetailIntent = getIntent();
        int projectName = projectDetailIntent.getExtras().getInt("projectName");
        int projectDescription = projectDetailIntent.getExtras().getInt("projectDescription");
        String projectImage = projectDetailIntent.getExtras().getString("projectImage");

        getSupportActionBar().setTitle(projectName);

        TextView projectDescriptionView = (TextView) findViewById(R.id.projectDetailsContent);
        projectDescriptionView.setText(projectDescription);
    }
}
