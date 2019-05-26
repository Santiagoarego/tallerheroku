package com.example;

public class Libro
{
  private String nombre;
  private String autor;
  private String keywords;
  private String ISBN;
  private int cantidad;
  private String descripcion;

  public  Libro(String nombre, String autor, String keywords, String ISBN, int cantidad, String descripcion)
  {
    this.nombre = nombre;
    this.autor = autor;
    this.keywords = keywords;
    this.ISBN = ISBN;
    this.cantidad = cantidad;
    this.descripcion = descripcion;
  }

  public  Libro()
  {
    this.nombre = "";
    this.autor="";
    this.keywords = "";
    this.ISBN = "";
    this.cantidad = 0;
    this.descripcion = "";
  }

  public String getNombre()
  {
    return this.nombre;
  }

  public String getAutor()
  {
    return this.autor;
  }

  public String getKeywords()
  {
    return this.keywords;
  }

  public String getISBN()
  {
    return this.ISBN;
  }

  public int getCantidad()
  {
    return this.cantidad;
  }

  public String getDescripcion()
  {
    return this.descripcion;
  }

  public void setNombre(String name)
  {
    this.nombre=name;
  }

  public void setAutor(String autor)
  {
    this.autor=autor;
  }

  public void setISBN(String ISBN)
  {
    this.ISBN=ISBN;
  }

  public void setKeywords(String keywords)
  {
    this.keywords=keywords;
  }

  public void setCantidad(int cantidad)
  {
    this.cantidad=cantidad;
  }
  public void disminuirCantidad(){
    this.cantidad--;
  }
  public void aumentarCantidad(){
    this.cantidad++;
  }

  public void setDescripcion(String descripcion)
  {
    this.descripcion=descripcion;
  }
}
