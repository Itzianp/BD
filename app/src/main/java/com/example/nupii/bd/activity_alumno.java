package com.example.nupii.bd;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.nupii.bd.AdminSQLiteOpenHelper;
import com.example.nupii.bd.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Nupii on 26/05/2015.
 */
public class activity_alumno extends ActionBarActivity {
    private RecyclerView recycler;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager lManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity_alumno);

        List<Modeloalumno> items = new ArrayList<>();

        AdminSQLiteOpenHelper funcion = new AdminSQLiteOpenHelper(this, "alumnos", null, 1);
        SQLiteDatabase BD = funcion.getWritableDatabase();
        Cursor fila = BD.rawQuery("select id_alumno, nombre, apellido_p, apellido_m, carrera from alumnos", null);
        for(fila.moveToFirst(); !fila.isAfterLast(); fila.moveToNext()){

            items.add (new Modeloalumno(fila.getString(0), fila.getString(1), fila.getString(2), fila.getString(3), fila.getString(4)));
        }

        recycler = (RecyclerView) findViewById(R.id.alumnos);
        recycler.setHasFixedSize(true);


        lManager = new LinearLayoutManager(this);
        recycler.setLayoutManager(lManager);


        adapter = new Alumnoadapter(items);
        recycler.setAdapter(adapter);
        BD.close();
    }
}
