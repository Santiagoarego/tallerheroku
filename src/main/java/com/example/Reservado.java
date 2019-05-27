package com.example;

public class Reservado
{
  private String Id;
  private String ISBN;

  public  Reservado(String Id, String ISBN)
  {
    this.Id = Id;
    this.ISBN = ISBN;
  }

  public  Reservado()
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
}
