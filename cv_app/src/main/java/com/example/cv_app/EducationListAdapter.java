package com.example.cv_app;

import android.content.Context;
import android.graphics.Color;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Arthur on 21-6-2017.
 */

public class EducationListAdapter extends ArrayAdapter
{

    public EducationListAdapter(@NonNull Context context, ArrayList<EducationListItem> educationListItemArrayList)
    {
        super(context, 0, educationListItemArrayList);
    }

    @NonNull
    public View getView(int position, View convertView, ViewGroup parent)
    {
        EducationListItem listItem = (EducationListItem) getItem(position);

        if(convertView == null)
        {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.education_listview_row, parent, false);
        }

        if((position % 2) > 0)
            convertView.setBackgroundColor(Color.argb(255, 77, 208, 229));
        else
            convertView.setBackgroundColor(Color.argb(255, 57, 188, 209));

        TextView startYear = (TextView) convertView.findViewById(R.id.educationStartYear);
        startYear.setText(Integer.toString(listItem.getStartYear()));

        TextView endYear = (TextView) convertView.findViewById(R.id.educationEndYear);
        if(listItem.getEndYear() > 999999999)
            endYear.setText(listItem.getEndYear());
        else
            endYear.setText(Integer.toString(listItem.getEndYear()));

        TextView educationName = (TextView) convertView.findViewById(R.id.educationName);
        educationName.setText(listItem.getEducationName());

        TextView educationStatus = (TextView) convertView.findViewById(R.id.educationStateValue);
        educationStatus.setText(listItem.getEducationStatus());

        TextView educationStory = (TextView) convertView.findViewById(R.id.educationStory);
        educationStory.setText(listItem.getEducationStory());

        convertView.setOnClickListener(null);
        return convertView;
    }
}
