package com.example.hendal.codeathonurv2016_agendaurv;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Chus on 14/02/2016.
 */
public class Professor extends Fragment {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View inflate = inflater.inflate(R.layout.professor, container, false);

        String name = "Jordi Duch Gavaldá";
        String email = "jordi.duch@urv.cat";
        String despacho = "Despatx 256 (Disponible)";
        final String[] llistahores = new String[]{
                "9:30","10:30", "12:30"
        };
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getContext(), android.R.layout.select_dialog_item, llistahores);
        ListView llistahoresview = (ListView) inflate.findViewById(R.id.listView3);
        llistahoresview.setAdapter(adapter);

        ImageView img = (ImageView) inflate.findViewById(R.id.imgprofes);
        TextView nom = (TextView) inflate.findViewById(R.id.nomprofe);
        TextView correo = (TextView) inflate.findViewById(R.id.correoprofe);
        TextView despachoview = (TextView) inflate.findViewById(R.id.despacho);
        nom.setText(name);
        despachoview.setText(despacho);
        correo.setText(email);
        img.setImageResource(R.drawable.jordi);
        Button reservarcita = (Button) inflate.findViewById(R.id.reservar);
        reservarcita.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final CharSequence[] items = {"9:30","10:30", "12:30"};

                AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
                builder.setTitle("Selecciona hora:");
                builder.setSingleChoiceItems(items, -1, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int item) {
                        Toast toast = Toast.makeText(getContext(), "Has reservat cita a las: " + items[item], Toast.LENGTH_SHORT);
                        toast.show();
                        dialog.cancel();
                    }
                });
                AlertDialog alert = builder.create();
                alert.show();

            }
        });
        return inflate;
    }
}
