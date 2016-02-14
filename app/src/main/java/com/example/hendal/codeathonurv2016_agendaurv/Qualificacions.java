package com.example.hendal.codeathonurv2016_agendaurv;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

public class Qualificacions extends Fragment {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View inflate = inflater.inflate(R.layout.qualificacions, container, false);
        final String[] llistQualificacions = new String[]{ "Analisi i Disseny d'Aplicacions","Sistemes Distribuits", "Llenguatges Formals"};
        final String[] llistNotes = new String[] {"5.68","9.68","8.5"};

        ListViewAdapterQualificacions adapter = new ListViewAdapterQualificacions(getContext(), llistQualificacions, llistNotes);
        ListView listQualificacionsView = (ListView) inflate.findViewById(R.id.list_qualificacions);
        listQualificacionsView.setAdapter(adapter);

        return inflate;
    }


}
