package com.example.hendal.codeathonurv2016_agendaurv;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.support.v4.app.Fragment;

/**
 * Created by Chus on 13/02/2016.
 */
public class Horari extends Fragment {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View inflate = inflater.inflate(R.layout.horari, container, false);
        final String[] llistacampus = new String[]{ "ASSIGNATURA 1 ","ASSIGNATURA 2", "ASSIGNATURA 3"};
        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(getContext(), android.R.layout.select_dialog_item, llistacampus);
        ListView listprofesview = (ListView) inflate.findViewById(R.id.listView2);
        listprofesview.setAdapter(adapter1);
        final String[] llistahores = new String[]{"09:30"+System.getProperty ("line.separator")+"11:00","09:30"+System.getProperty ("line.separator")+"11:00", "09:30"+System.getProperty ("line.separator")+"11:20"};
        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(getContext(), android.R.layout.select_dialog_item, llistahores);
        ListView listprofesview2 = (ListView) inflate.findViewById(R.id.listView);
        listprofesview2.setAdapter(adapter2);
        listprofesview2.setOnItemClickListener(new AdapterView.OnItemClickListener()

        {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id){

                //Intent i = new Intent(BuscaUniversitat.this, Pais.class);
                //startActivity(i);

            }

        });



        return inflate;
    }

}