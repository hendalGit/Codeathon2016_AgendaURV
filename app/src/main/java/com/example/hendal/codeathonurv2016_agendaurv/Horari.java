package com.example.hendal.codeathonurv2016_agendaurv;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.support.v4.app.Fragment;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Horari extends Fragment {

    private ListViewAdapterHorari adapter;
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    ArrayList<String> llistNames;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View inflate = inflater.inflate(R.layout.horari, container, false);
        llistNames = new ArrayList<String>();
        llistNames.add("Analisi i Disseny d'Aplicacions");
        llistNames.add("Sistemes Distribuits");
        llistNames.add("Llenguatges Formals");
        final String[] llistOffice = new String[]{ "Aula 216","Laboratori 116", "Laboratori 209"};
        final String[] llistaTimes = new String[]{"09:30"+System.getProperty ("line.separator")+"11:00","09:30"+System.getProperty ("line.separator")+"11:00", "09:30"+System.getProperty ("line.separator")+"11:20"};

        adapter = new ListViewAdapterHorari(getContext(), llistNames, llistOffice, llistaTimes);
        ListView listHorariView = (ListView) inflate.findViewById(R.id.list_horaris);
        listHorariView.setAdapter(adapter);

        registerForContextMenu(listHorariView);

        return inflate;
    }

    private View selectedItem;
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        menu.setHeaderTitle("Accions");
        menu.add(0, v.getId(), 0, "Eliminar");
        menu.add(0, v.getId(), 0, "Editar");
        selectedItem = v;
        selectedItem.setTag(((AdapterView.AdapterContextMenuInfo)menuInfo).position);

    }

    public boolean onContextItemSelected(MenuItem item) {
        if (item.getTitle() == "Eliminar") {
            int pos = (int)selectedItem.getTag();
            llistNames.remove(pos);
            adapter.notifyDataSetChanged();
        } else if (item.getTitle() == "Editar") {
            Toast.makeText(getActivity(), "Característica no disponible", Toast.LENGTH_SHORT).show();
        }
        else {
            return false;
        }
        return true;
    }



}