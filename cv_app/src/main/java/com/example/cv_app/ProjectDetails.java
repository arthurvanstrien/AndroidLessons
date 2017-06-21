package com.example.cv_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ProjectDetails extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        Intent intent = getIntent();
        //int projectName = intent.getIntExtra("projectName", 0);

        //getSupportActionBar().setTitle(projectName);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_project_details);
    }
}
