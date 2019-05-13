package servlet;

public class Estudiante extends Usuario
{
  private String facultad;

  public  Estudiante(String nombre, String correo, String contraseña, int id, String facultad)
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
}
