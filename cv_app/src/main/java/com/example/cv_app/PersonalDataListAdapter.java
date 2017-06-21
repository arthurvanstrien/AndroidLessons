package com.example.cv_app;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Arthur on 20-6-2017.
 */

public class PersonalDataListAdapter extends ArrayAdapter
{
    public PersonalDataListAdapter(Context context, ArrayList<PersonalDataListItem> listItems)
    {
        super(context, 0, listItems);
    }

    @NonNull
    public View getView(int position, View convertView, ViewGroup parent)
    {
        PersonalDataListItem listItem = (PersonalDataListItem) getItem(position);

        if(convertView == null)
        {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.personaldata_listview_row, parent, false);
        }

        TextView field = (TextView) convertView.findViewById(R.id.personalDataField);
        field.setText(listItem.getField());

        TextView value = (TextView) convertView.findViewById(R.id.personalDataValue);
        value.setText(listItem.getValue());

        convertView.setOnClickListener(null);
        return convertView;
    }
}
