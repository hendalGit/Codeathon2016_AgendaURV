package com.example.hendal.codeathonurv2016_agendaurv;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;


public class ListViewAdapterHorari extends BaseAdapter {
    Context context;
    ArrayList<String> names;
    String[] office;
    String[] times;
    int[] colors = {R.color.subject1,R.color.subject2,R.color.subject3,R.color.subject4,R.color.subject5,R.color.subject6};
    LayoutInflater inflater;

    public ListViewAdapterHorari(Context context, ArrayList<String> names, String[] office, String[] times) {
        this.context = context;
        this.names = names;
        this.office = office;
        this.times = times;
    }

    @Override
    public int getCount() {
        return names.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0  ;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        TextView textName;
        TextView textOffice;
        TextView textTime;
        TextView color;
        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View itemView = inflater.inflate(R.layout.horari_item, parent, false);

        color = (TextView) itemView.findViewById(R.id.horari_row_color);
        textName = (TextView) itemView.findViewById(R.id.horari_row_name);
        textOffice = (TextView) itemView.findViewById(R.id.horari_row_office);
        textTime = (TextView) itemView.findViewById(R.id.horari_row_time);


        color.setBackgroundResource(colors[position]);
        textName.setText(names.get(position));
        textOffice.setText(office[position]);
        textTime.setText(times[position]);


        return itemView;
    }
}
