package com.example.hendal.codeathonurv2016_agendaurv;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ListViewAdapter extends BaseAdapter {
    // Declare Variables
    Context context;
    ArrayList<String> titulos;
    int[] imagenes;
    LayoutInflater inflater;
    Professors prof;

    public ListViewAdapter(Context context, ArrayList<String> titulos, int[] imagenes, Professors parent) {
        this.context = context;
        this.titulos = titulos;
        this.imagenes = imagenes;
        prof = parent;
    }

    @Override
    public int getCount() {
        return titulos.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    public View getView(int position, View convertView, ViewGroup parent) {

        // Declare Variables
        TextView txtTitle;
        ImageView imgImg;

        //http://developer.android.com/intl/es/reference/android/view/LayoutInflater.html
        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View itemView = inflater.inflate(R.layout.list_row, parent, false);

        prof.registerForContextMenu(itemView);

        // Locate the TextViews in listview_item.xml
        txtTitle = (TextView) itemView.findViewById(R.id.list_row_title);
        imgImg = (ImageView) itemView.findViewById(R.id.list_row_image);

        // Capture position and set to the TextViews
        txtTitle.setText(titulos.get(position));
        imgImg.setImageResource(imagenes[position]);

        itemView.setTag(position);

        return itemView;
    }
}
