package com.example.hendal.codeathonurv2016_agendaurv;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
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
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View inflate = inflater.inflate(R.layout.horari, container, false);


        /*ListViewAdapter adapter = new ListViewAdapter(getContext(), llistaprofessors, imagenes);
        ListView listprofesview = (ListView) inflate.findViewById(R.id.llistaprofessorsView);
        listprofesview.setAdapter(adapter);
        listprofesview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                //Intent i = new Intent(BuscaUniversitat.this, Pais.class);
                //startActivity(i);

            }
        });*/



        return inflate;
    }

}