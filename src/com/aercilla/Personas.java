package com.aercilla;

public class Personas {
    private static String nombre;
    private String apellidos;


    public Personas(String nombre, String apellidos) {
        this.nombre = nombre;
        this.apellidos = apellidos;

    }

    public static String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
}
