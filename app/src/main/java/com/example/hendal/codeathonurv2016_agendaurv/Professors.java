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
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.select_dialog_item, llistaprofessors);
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