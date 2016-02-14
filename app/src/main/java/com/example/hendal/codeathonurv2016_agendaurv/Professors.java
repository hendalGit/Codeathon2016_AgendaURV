package com.example.hendal.codeathonurv2016_agendaurv;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.ContextMenu;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class Professors extends Fragment {

    ListViewAdapterProfessors adapter;
    ArrayList<String> llistaprofessors;
    ArrayList<String> llistacorreus;
    ArrayList<String> llistadespatxos;


    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View inflate = inflater.inflate(R.layout.professors, container, false);
        llistaprofessors = new ArrayList<>();

        llistaprofessors.add("Jordi Duch");
        llistaprofessors.add("Álex Arenas");
        llistaprofessors.add("Santiago Romaní");
        llistaprofessors.add("Tomas Gonzalez");

        llistacorreus = new ArrayList<>();

        llistacorreus.add("jordi.duch@urv.cat");
        llistacorreus.add("alex.arenas@urv.cat");
        llistacorreus.add("santiago.romani@urv.cat");
        llistacorreus.add("tomas.gonzalez@urv.cat");

        llistadespatxos = new ArrayList<>();

        llistadespatxos.add("Despatx 256 (Disponible)");
        llistadespatxos.add("Despatx 254 (Disponible)");
        llistadespatxos.add("Despatx 255 (No Disponible)");
        llistadespatxos.add("Despatx 253 (Disponible)");


        int[] imagenes = {
                R.drawable.jordiverd,
                R.drawable.alexverd,
                R.drawable.romanirojo,
                R.drawable.tomasverd
        };
        final int[] imggrandes = {
                R.drawable.jordi,
                R.drawable.alex,
                R.drawable.romani,
                R.drawable.tomas
        };


        adapter = new ListViewAdapterProfessors(getContext(), llistaprofessors, imagenes, this);
        ListView listprofesview = (ListView) inflate.findViewById(R.id.llistaprofessorsView);
        listprofesview.setAdapter(adapter);
        listprofesview.setLongClickable(true);
        listprofesview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String name = llistaprofessors.get(position);
                String correu = llistacorreus.get(position);
                String despatx = llistadespatxos.get(position);
                int img = imggrandes[position];

                Bundle parametro = new Bundle();
                parametro.putString("nom", name);
                parametro.putString("correu", correu);
                parametro.putString("despatx", despatx);
                parametro.putInt("img", img);

                FragmentTransaction ft = getFragmentManager().beginTransaction();
                Fragment f = new Professor();
                f.setArguments(parametro);
                ft.replace(R.id.fragment, f);
                ft.commit();
            }
        });
        registerForContextMenu(listprofesview);
        return inflate;
    }


    private View selectedItem;
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
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