package com.example.track2_practice2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Arthur on 3-5-2017.
 */

public class MicroAchitectureAdapter extends ArrayAdapter<Microarchitectures>
{
    public MicroAchitectureAdapter(Context context, ArrayList<Microarchitectures> microarchitectures)
    {
        super(context, 0, microarchitectures);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        Microarchitectures microarchitectures = getItem(position);

        if(convertView == null)
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.lv_row, parent, false);

        TextView lvClock = (TextView) convertView.findViewById(R.id.lvClockSpeed);

        //NIET AF.

        return convertView;
    }

}
