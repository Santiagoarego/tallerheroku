package com.example;

public class Prestado
{
  private String Id;
  private String ISBN;
  private int cantidad;

  public  Prestado(String Id, String ISBN)
  {
    this.Id = Id;
    this.ISBN = ISBN;
    this.cantidad=1;
  }

  public  Prestado()
  {
    this.Id = "";
    this.ISBN = "";
  }

  public String getId()
  {
    return this.Id;
  }

  public String getISBN()
  {
    return this.ISBN;
  }

  public void setId(String ID)
  {
    this.Id = ID;
  }

  public void setISBN(String isbn)
  {
    this.ISBN = isbn;
  }

  public int getCantidad()
  {
    return this.cantidad;
  }

  public void subirCantidad()
  {
    this.cantidad++;
  }
}
