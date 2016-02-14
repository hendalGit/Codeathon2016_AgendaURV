package com.example.hendal.codeathonurv2016_agendaurv;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;

public class ListViewAdapterProfessors extends BaseAdapter {
    Context context;
    ArrayList<String> titulos;
    ArrayList<Integer> imagenes;
    LayoutInflater inflater;
    Professors prof;

    public ListViewAdapterProfessors(Context context, ArrayList<String> titulos, ArrayList<Integer> imagenes, Professors parent) {
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
        TextView txtTitle;
        ImageView imgImg;
        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View itemView = inflater.inflate(R.layout.list_row, parent, false);

        txtTitle = (TextView) itemView.findViewById(R.id.list_row_title);
        imgImg = (ImageView) itemView.findViewById(R.id.list_row_image);

        txtTitle.setText(titulos.get(position));
        imgImg.setImageResource(imagenes.get(position));

        itemView.setTag(position);

        return itemView;
    }
}
