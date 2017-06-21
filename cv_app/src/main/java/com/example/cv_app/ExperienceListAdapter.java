package com.example.cv_app;

import android.content.Context;
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

public class ExperienceListAdapter extends ArrayAdapter
{
    public ExperienceListAdapter(@NonNull Context context, ArrayList<ExperienceListItem> experienceListItemArrayList)
    {
        super(context, 0, experienceListItemArrayList);
    }

    @NonNull
    public View getView(int position, View convertView, ViewGroup parent)
    {
        ExperienceListItem listItem = (ExperienceListItem) getItem(position);

        if (convertView == null)
        {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.experience_listview_row, parent, false);
        }

        TextView startYear = (TextView) convertView.findViewById(R.id.experienceStartYear);
        startYear.setText(Integer.toString(listItem.getStartYear()));

        TextView endYear = (TextView) convertView.findViewById(R.id.experienceEndYear);
        if (listItem.getEndYear() > 999999999)
            endYear.setText(listItem.getEndYear());
        else
            endYear.setText(Integer.toString(listItem.getEndYear()));

        TextView name = (TextView) convertView.findViewById(R.id.experienceName);
        name.setText(listItem.getExperienceName());

        TextView type = (TextView) convertView.findViewById(R.id.experienceTypeValue);
        type.setText(listItem.getExperienceType());

        TextView story = (TextView) convertView.findViewById(R.id.experienceStory);
        story.setText(listItem.getExperienceStory());

        convertView.setOnClickListener(null);
        return convertView;
    }
}
