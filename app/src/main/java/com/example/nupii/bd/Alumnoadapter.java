package com.example.nupii.bd;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Nupii on 26/05/2015.
 */
public class Alumnoadapter extends RecyclerView.Adapter<Alumnoadapter.usuarioViewHolder> {
private List<Modeloalumno> items;



public static class usuarioViewHolder extends RecyclerView.ViewHolder{

    public TextView id_alumno;
    public TextView nombre;
    public TextView apellidop;
    public TextView apellidom;
    public TextView carrera;

    public usuarioViewHolder(View v){
        super(v);
        id_alumno= (TextView) v.findViewById(R.id.id_alumno);
        nombre= (TextView) v.findViewById(R.id.nombre);
        apellidop= (TextView) v.findViewById(R.id.apellido_p);
        apellidom= (TextView) v.findViewById(R.id.apellido_m);
        carrera= (TextView) v.findViewById(R.id.carrera);
    }
}

    public Alumnoadapter(List<Modeloalumno> items){
        this.items= items;
    }

    @Override
    public usuarioViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.alumnos_card, viewGroup, false);
        return new usuarioViewHolder(v);
    }

    @Override
    public void onBindViewHolder(usuarioViewHolder usuarioViewHolder, int i) {
        usuarioViewHolder.id_alumno.setText("id_alumno: "+ String.valueOf(items.get(i).getId_alumno()));//solo a este por que es numerico, los demas ya son Strings
        usuarioViewHolder.nombre.setText("nombre: "+ String.valueOf(items.get(i).getNombre()));
        usuarioViewHolder.apellidop.setText("apelllido paterno: " + String.valueOf(items.get(i).getApellido_paterno()));
        usuarioViewHolder.apellidom.setText("apellido materno: " + String.valueOf(items.get(i).getApellido_materno()));
        usuarioViewHolder.carrera.setText("carrera"+ String.valueOf(items.get(i).getCarrera()));


    }

    @Override
    public int getItemCount() {

        return items.size();
    }
}

