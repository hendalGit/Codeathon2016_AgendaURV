package com.example.hendal.codeathonurv2016_agendaurv;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class ListViewAdapterQualificacions extends BaseAdapter {
    Context context;
    String[] names;
    String[] notes;
    int[] colors = {R.color.subject1,R.color.subject2,R.color.subject3,R.color.subject4,R.color.subject5,R.color.subject6};
    LayoutInflater inflater;

    public ListViewAdapterQualificacions(Context context, String[] names, String[] notes) {
        this.context = context;
        this.names = names;
        this.notes = notes;
    }

    @Override
    public int getCount() {
        return names.length;
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
        TextView textNames;
        TextView textNotes;
        TextView color;
        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View itemView = inflater.inflate(R.layout.qualificacions_item, parent, false);

        color = (TextView) itemView.findViewById(R.id.qualificacions_row_color);
        textNames = (TextView) itemView.findViewById(R.id.qualificacions_row_name);
        textNotes = (TextView) itemView.findViewById(R.id.qualificacions_row_notes);

        color.setBackgroundResource(colors[position]);
        textNames.setText(names[position]);
        textNotes.setText(notes[position]);

        return itemView;
    }
}
