package com.example;

public class Prestamo
{
  private int Id;
  private String ISBN;
  private String fecha;
  private int dia;

  public  Prestamo(String Id, String ISBN, String fecha, int dia)
  {
    this.Id = Id;
    this.ISBN = ISBN;
    this.fecha = fecha;
    this.dia = dia;
  }

  public  Prestamo()
  {
    this.Id = "";
    this.ISBN = "";
    this.fecha = "";
    this.dia = 0;
  }

  public int getId()
  {
    return this.Id;
  }

  public String getISBN()
  {
    return this.ISBN;
  }

  public String getFecha()
  {
    return this.fecha;
  }

  public int getDia()
  {
    return this.dia;
  }

  public void setId(int ID)
  {
    this.Id = ID;
  }

  public void setISBN(String isbn)
  {
    this.ISBN = isbn;
  }

  public void setFecha(String fecha)
  {
    this.fecha = fecha;
  }

  public void setDia(int dia)
  {
    this.dia = dia;
  }
}
