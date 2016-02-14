package com.example.hendal.codeathonurv2016_agendaurv;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.support.v4.app.Fragment;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
        final String[] llistNames = new String[]{ "Analisi i Disseny d'Aplicacions","Sistemes Distribuits", "Llenguatges Formals"};
        final String[] llistOffice = new String[]{ "Aula 216","Laboratori 116", "Laboratori 209"};
        final String[] llistaTimes = new String[]{"09:30"+System.getProperty ("line.separator")+"11:00","09:30"+System.getProperty ("line.separator")+"11:00", "09:30"+System.getProperty ("line.separator")+"11:20"};

        View horariView = inflater.inflate(R.layout.professors, container, false);

        ListViewAdapterHorari adapter = new ListViewAdapterHorari(getContext(), llistNames, llistOffice, llistaTimes);
        ListView listHorariView = (ListView) inflate.findViewById(R.id.list_horaris);
        listHorariView.setAdapter(adapter);

        return inflate;
    }

}