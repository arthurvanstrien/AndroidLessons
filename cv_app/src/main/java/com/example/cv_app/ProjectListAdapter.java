package com.example.cv_app;

import android.content.Context;
import android.graphics.drawable.Icon;
import android.media.Image;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Arthur on 22-6-2017.
 */

public class ProjectListAdapter extends ArrayAdapter
{
    public ProjectListAdapter(@NonNull Context context, ArrayList<ProjectListItem> projectListItemArrayList)
    {
        super(context, 0, projectListItemArrayList);
    }

    @NonNull
    public View getView(int position, View convertView, ViewGroup parent)
    {
        ProjectListItem projectListItem = (ProjectListItem) getItem(position);

        if(convertView == null)
        {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.projects_listview_row, parent, false);
        }

        ImageView image = (ImageView) convertView.findViewById(R.id.projectImage);
        image.setImageResource(projectListItem.getIcon());

        TextView projectName = (TextView) convertView.findViewById(R.id.projectListName);
        projectName.setText(projectListItem.getName());

        TextView projectShortDescription = (TextView) convertView.findViewById(R.id.projectListDescription);
        projectShortDescription.setText(projectListItem.getShortDescription());

        return convertView;
    }
}
