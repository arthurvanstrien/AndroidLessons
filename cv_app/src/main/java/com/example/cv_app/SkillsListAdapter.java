package com.example.cv_app;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Arthur on 22-6-2017.
 */

public class SkillsListAdapter extends ArrayAdapter
{
    public SkillsListAdapter(@NonNull Context context, ArrayList<SkillsListItem> skillsListItems)
    {
        super(context, 0, skillsListItems);
    }

    @NonNull
    public View getView(int position, View convertView, ViewGroup parent)
    {
        SkillsListItem listItem = (SkillsListItem) getItem(position);

        if(convertView == null)
        {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.skills_listview_row, parent, false);
        }

        TextView type = (TextView) convertView.findViewById(R.id.skillsType);
        type.setText(listItem.getSkillsType());

        TextView story = (TextView) convertView.findViewById(R.id.skillsStory);
        story.setText(listItem.getSkillsStory());

        convertView.setOnClickListener(null);
        return convertView;
    }
}
