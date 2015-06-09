package com.example.nupii.bd;

/**
 * Created by Nupii on 26/05/2015.
 */
public class Modeloalumno {

    private String id_alumno;
    private String nombre;
    private String apellido_paterno;
    private String apellido_materno;
    private String carrera;

    public String getId_alumno() {
        return id_alumno;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido_paterno() {
        return apellido_paterno;
    }

    public String getCarrera() {
        return carrera;
    }

    public String getApellido_materno() {
        return apellido_materno;
    }

    public Modeloalumno(String id_alumno, String nombre , String apellido_paterno, String apellido_materno, String carrera){
        this.id_alumno = id_alumno;
        this.nombre=nombre;
        this.apellido_paterno=apellido_paterno;
        this.apellido_materno=apellido_materno;
        this.carrera=carrera;
    }

}
