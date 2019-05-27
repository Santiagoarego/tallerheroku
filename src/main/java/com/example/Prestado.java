package com.example;

public class Prestado
{
  private String Id;
  private String ISBN;

  public  Prestado(String Id, String ISBN)
  {
    this.Id = Id;
    this.ISBN = ISBN;
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
}
