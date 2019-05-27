package com.example;

public class Reserva
{
  private String Id;
  private String ISBN;
  private String fechahoy;
  private String fecharetira;
  private int dia;

  public  Reserva(String Id, String ISBN, String fecha1, String fecha2, int dia)
  {
    this.Id = Id;
    this.ISBN = ISBN;
    this.fechahoy = fecha1;
    this.fecharetira = fecha2;
    this.dia = dia;
  }

  public  Reserva()
  {
    this.Id = "";
    this.ISBN = "";
    this.fechahoy = "";
    this.fecharetira ="";
    this.dia = 0;
  }

  public String getId()
  {
    return this.Id;
  }

  public String getISBN()
  {
    return this.ISBN;
  }

  public String getFechahoy()
  {
    return this.fechahoy;
  }

  public String getFecharetira()
  {
    return this.fecharetira;
  }

  public int getDia()
  {
    return this.dia;
  }

  public void setId(String ID)
  {
    this.Id = ID;
  }

  public void setISBN(String isbn)
  {
    this.ISBN = isbn;
  }

  public void setFechahoy(String fecha)
  {
    this.fechahoy = fecha;
  }

  public void setFecharetira(String fecha)
  {
    this.fecharetira = fecha;
  }

  public void setDia(int dia)
  {
    this.dia = dia;
  }
}
