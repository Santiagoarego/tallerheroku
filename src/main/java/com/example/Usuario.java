package com.example;

public class Usuario {
    private String nombre;
    private int id;
    private String correo;
    private String contraseña;

    public Usuario(String nombre, String correo, String contraseña, int id) {
        this.correo = correo;
        this.contraseña = contraseña;
        this.nombre = nombre;
        this.id = id;
    }

    public Usuario() {
        this.correo = "";
        this.contraseña = "";
        this.nombre = "";
        this.id = -2;
    }

    public String getCorreo() {
        return this.correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContraseña() {

        return this.contraseña;
    }

    public void setContraseña(String password) {
        this.contraseña = password;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
