package com.example.hendal.codeathonurv2016_agendaurv;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Professors extends Activity {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.professors);


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

        ListViewAdapter adapter = new ListViewAdapter(this, llistaprofessors, imagenes);
        ListView listprofesview = (ListView) findViewById(R.id.llistaprofessorsView);
        listprofesview.setAdapter(adapter);
        listprofesview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                //Intent i = new Intent(BuscaUniversitat.this, Pais.class);
                //startActivity(i);

            }
        });




    }

}