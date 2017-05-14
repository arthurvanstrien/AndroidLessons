package com.example.track2_assessment;

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

public class MicroarchitectureAdapter extends ArrayAdapter<Microarchitecture> {
    public MicroarchitectureAdapter(Context context, ArrayList<Microarchitecture> microarchitectures)
    {
        super(context, 0, microarchitectures);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        Microarchitecture microarchitectures = getItem(position);
        if(convertView == null)
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.activity_micro_architecture_list_view, parent, false);

        //TextView lvClock = (TextView) convertView.findViewById(R.id.);

        //NIET AF.

        return convertView;
    }
}
