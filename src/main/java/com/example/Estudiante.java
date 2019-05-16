package com.example;

public class Estudiante extends Usuario
{
  private String facultad;

  public  Estudiante(String nombre, String correo, String contraseña, String id, String facultad)
  {
    super(nombre, correo, contraseña, id);
    this.facultad = facultad;
  }

  public  Estudiante()
  {
    super();
    this.facultad="";
  }


  public String getFacultad()
  {
    return this.facultad;
  }

  public void setFacultad(String name)
  {
    this.facultad=name;
  }
  public String getNombre() {
    return this.nombre;
}

public String getId() {
    return this.id;
}
public String getCorreo() {
  return this.correo;
}

  
}
