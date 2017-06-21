package com.example.cv_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class HobbyAndInterest extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        getSupportActionBar().setTitle(R.string.hobbiesAndInterestsTitle);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hobby_and_interest);
    }
}
