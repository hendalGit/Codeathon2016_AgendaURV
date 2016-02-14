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
public class Campus extends Fragment {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View inflate = inflater.inflate(R.layout.campus, container, false);

        String name = "Crai Campus Sescelades";
        String tel = "977 55 96 14";
        String direccion = "crai.sescelades@urv.cat";
        ImageView img = (ImageView) inflate.findViewById(R.id.imgcampus);
        TextView nom = (TextView) inflate.findViewById(R.id.nomcampus);
        TextView telefon = (TextView) inflate.findViewById(R.id.telefono);
        TextView dir = (TextView) inflate.findViewById(R.id.direccionemail);
        nom.setText(name);
        dir.setText(direccion);
        telefon.setText(tel);
        img.setImageResource(R.drawable.sescelades);
        Button reservarcita = (Button) inflate.findViewById(R.id.reservaraula);
        reservarcita.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final CharSequence[] items = {"Aula 2 9:30-10:30","Aula 3 10:30-12:30", "Aula 6 12:30-14:00"};

                AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
                builder.setTitle("Selecciona hora:");
                builder.setSingleChoiceItems(items, -1, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int item) {
                        Toast toast = Toast.makeText(getContext(), "Has reservat: " + items[item], Toast.LENGTH_SHORT);
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
