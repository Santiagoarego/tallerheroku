package com.example;

public class Bibliotecario extends Usuario
{
  private String dependencia;

  public  Bibliotecario(String nombre, String correo, String contraseña, String id, String dependencia)
  {
    super(nombre, correo, contraseña, id);
    this.dependencia = dependencia;
  }

  public  Bibliotecario()
  {
    super();
    this.dependencia = "";
  }

  public String getDependencia()
  {
    return this.dependencia;
  }

  public void setDependencia(String name)
  {
    this.dependencia=name;
  }
}
