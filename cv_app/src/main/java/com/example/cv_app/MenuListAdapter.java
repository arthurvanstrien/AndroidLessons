package com.example.cv_app;

import android.content.Context;
import android.graphics.Color;
import android.support.annotation.NonNull;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Arthur on 14-5-2017.
 */

public class MenuListAdapter extends ArrayAdapter
{
    public MenuListAdapter(Context context, ArrayList<MenuListItem> listItems)
    {
        super(context, 0, listItems);
    }

    @NonNull
    public View getView(int position, View convertView, ViewGroup parent)
    {
        MenuListItem menuListItem = (MenuListItem) getItem(position);

        if(convertView == null)
        {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.menu_listview_row, parent, false);
        }

        if((position % 2) > 0)
            convertView.setBackgroundColor(Color.argb(255, 77, 208, 229));
        else
            convertView.setBackgroundColor(Color.argb(255, 57, 188, 209));

        TextView titleField = (TextView) convertView.findViewById(R.id.title);
        titleField.setText(menuListItem.getName());

        return convertView;
    }
}
