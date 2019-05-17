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

  @Override
  public String getNombre(){
    return nombre;

  }
  @Override
  public String getCorreo(){
    return correo;
  }
  @Override
  public String getId(){
    return id;
  }
  public String getFacultad()
  {
    return this.facultad;
  }

  public void setFacultad(String name)
  {
    this.facultad=name;
  }
}
