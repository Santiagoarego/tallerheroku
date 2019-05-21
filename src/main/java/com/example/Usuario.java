package com.example;

public class Usuario {
    public String nombre;
    public String id;
    public String correo;
    public String contrasena;

    public Usuario(String nombre, String correo, String contrasena, String id) {
        this.correo = correo;
        this.contrasena = contrasena;
        this.nombre = nombre;
        this.id = id;
    }

    public Usuario() {
        this.correo = "";
        this.contrasena = "";
        this.nombre = "";
        this.id = null;
    }

    public String getCorreo() {
        return this.correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContrasena() {

        return this.contrasena;
    }

    public void setContrasena(String password) {
        this.contrasena = password;
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
