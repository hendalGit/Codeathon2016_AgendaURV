package com.example.hendal.codeathonurv2016_agendaurv;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Professors extends Fragment {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View inflate = inflater.inflate(R.layout.professors, container, false);
        final String[] llistaprofessors = new String[]{
                "Jordi Duch","Pedro Garcia", "Xavier Mallafré", "Álex Arenas", "Santiago Romaní"
        };

        int[] imagenes = {
                R.drawable.icono0,
                R.drawable.icono1,
                R.drawable.icono0,
                R.drawable.icono1,
                R.drawable.icono1
        };

        ListViewAdapter adapter = new ListViewAdapter(getContext(), llistaprofessors, imagenes);
        ListView listprofesview = (ListView) inflate.findViewById(R.id.llistaprofessorsView);
        listprofesview.setAdapter(adapter);
        listprofesview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                FragmentTransaction ft = getFragmentManager().beginTransaction();
                ft.replace(R.id.fragment, new Professor());
                ft.commit();

            }
        });



        return inflate;
    }

}