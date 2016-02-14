package com.example.hendal.codeathonurv2016_agendaurv;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class Professors extends Fragment {

    ListViewAdapter adapter;
    ArrayList<String> llistaprofessors;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View inflate = inflater.inflate(R.layout.professors, container, false);
        llistaprofessors = new ArrayList<>();

        llistaprofessors.add("Jordi Duch");
        llistaprofessors.add("Pedro Garcia");
        llistaprofessors.add("Xavier Mallafré");
        llistaprofessors.add("Álex Arenas");
        llistaprofessors.add("Santiago Romaní");


        int[] imagenes = {
                R.drawable.icono0,
                R.drawable.icono1,
                R.drawable.icono0,
                R.drawable.icono1,
                R.drawable.icono1
        };

        adapter = new ListViewAdapter(getContext(), llistaprofessors, imagenes, this);
        ListView listprofesview = (ListView) inflate.findViewById(R.id.llistaprofessorsView);
        listprofesview.setAdapter(adapter);
        listprofesview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {



            }
        });



        return inflate;
    }




    private View selectedItem;
    public void onCreateContextMenu(ContextMenu menu, View v,
                                    ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        menu.setHeaderTitle("Accions");
        menu.add(0, v.getId(), 0, "Eliminar");
        selectedItem = v;

    }

    public boolean onContextItemSelected(MenuItem item) {
        if (item.getTitle() == "Eliminar") {
            int pos = (int)selectedItem.getTag();
            Toast.makeText(getActivity(), "Esborrat el professor " + llistaprofessors.get(pos), Toast.LENGTH_SHORT).show();
            llistaprofessors.remove(pos);
            adapter.notifyDataSetChanged();
        }
        else {
            return false;
        }
        return true;
    }

}