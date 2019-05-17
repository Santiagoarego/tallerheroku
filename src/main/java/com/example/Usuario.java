package com.example;

public class Usuario {
    public String nombre;
    public String id;
    public String correo;
    public String contraseña;

    public Usuario(String nombre, String correo, String contraseña, String id) {
        this.correo = correo;
        this.contraseña = contraseña;
        this.nombre = nombre;
        this.id = id;
    }

    public Usuario() {
        this.correo = "";
        this.contraseña = "";
        this.nombre = "";
        this.id = null;
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

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

}
