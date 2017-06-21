package com.example.cv_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class PersonalData extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        getSupportActionBar().setTitle(R.string.personalDataTitle);

        ArrayList<PersonalDataListItem> personalData = new ArrayList<>();
        personalData.add(new PersonalDataListItem(R.string.personalDataNameField, R.string.personalDataName));
        personalData.add(new PersonalDataListItem(R.string.personalDataAdressField, R.string.personalDataAdress));
        personalData.add(new PersonalDataListItem(R.string.personalDataPostcodeField, R.string.personalDataPostcode));
        personalData.add(new PersonalDataListItem(R.string.personalDataCityField, R.string.personalDataCity));
        personalData.add(new PersonalDataListItem(R.string.personalDataCountryField, R.string.personalDataCountry));
        personalData.add(new PersonalDataListItem(R.string.personalDataTelephoneField, R.string.personalDataTelephone));
        personalData.add(new PersonalDataListItem(R.string.personalDataEmailField, R.string.personalDataEmail));
        personalData.add(new PersonalDataListItem(R.string.personalDataBirthDateField, R.string.personalDataBirthDate));
        personalData.add(new PersonalDataListItem(R.string.empty, R.string.personalDataBirthLocation));
        personalData.add(new PersonalDataListItem(R.string.personalDataNationalityField, R.string.personalDataNationality));
        personalData.add(new PersonalDataListItem(R.string.personalDataDriversLicenseField, R.string.personalDataDriversLicense));
        personalData.add(new PersonalDataListItem(R.string.personalDataMaritialStatusField, R.string.personalDataMaritialStatus));
        personalData.add(new PersonalDataListItem(R.string.personalDataSexField, R.string.personalDataSex));

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal_data);

        ListView personalDataList = (ListView) findViewById(R.id.personalDataList);
        ArrayAdapter personalDataListAdapter = new PersonalDataListAdapter(this, personalData);
        personalDataList.setAdapter(personalDataListAdapter);
    }
}
