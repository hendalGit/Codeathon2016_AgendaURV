package com.example.hendal.codeathonurv2016_agendaurv;
import android.app.Activity;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
import android.support.design.widget.Snackbar;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class Crai extends Fragment {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View inflate =  inflater.inflate(R.layout.crai, container, false);
        final String[] llistacampus = new String[]{
                "Campus Sescelades","Campus Catalunya", "Campus Terres de l'Ebre", "Campus Medicina i Ciències de la Salut"
        };
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getContext(), android.R.layout.select_dialog_item, llistacampus);
        ListView listprofesview = (ListView) inflate.findViewById(R.id.llistacampusView);
        listprofesview.setAdapter(adapter);
        listprofesview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                //Intent i = new Intent(BuscaUniversitat.this, Pais.class);
                //startActivity(i);

            }
        });
        return inflate;
    }

}