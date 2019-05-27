package com.example;

import java.util.ArrayList;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.*;

@Controller
@SpringBootApplication
public class DemoApplication {

  @RequestMapping("/")
  @ResponseBody
  String home() {
    return "Hello!this is a demo application linked to this tutorial: http://jkutner.github.io/2016/08/18/android-backend-api-heroku-retrofit.html";
  }

  @RequestMapping("/hello")
  @ResponseBody
  String hello() {
    String usuarios="";
    Arreglos sing = Arreglos.constructora();
    for(Usuario us : sing.getUsuarios()){
      if(us instanceof Estudiante){
      usuarios+="Email: "+us.getCorreo()+" Password:"+us.getContrasena()+" Estudiante||\n";
      }
    else if(us instanceof Bibliotecario){
      usuarios+="Email: "+us.getCorreo()+" Password:"+us.getContrasena()+" Bibliotecario ||\n ";
    }
  }
    return usuarios+sing.getUsuarios().size();
  }
  @RequestMapping("/libros")
  @ResponseBody
  String libros() {
    String usuarios="";
    Arreglos sing = Arreglos.constructora();
    for(Libro us : sing.getLibros()){
      
      usuarios+="Isbn: "+us.getISBN()+" NOMBRE:"+us.getNombre()+" Cantidades= " + us.getCantidad();
      
    
      
    
  }
    return usuarios+sing.getLibros().size();
  }
  @RequestMapping("/pruebaDeDatos")
  @ResponseBody
  String pruebaDeDatos(String nombre){
    return "prueba de datos "+nombre;
  }

  @RequestMapping("/crearUsuario")
  @ResponseBody
  String crearUsuario(String nombre, String correo,String password,String id,String facultad,String seleccion)
  {
    boolean existecorreo = this.existecorreo(correo);
    boolean existeid = this.existeid(id);
    Arreglos single = Arreglos.constructora();
    ArrayList<Usuario> users = single.getUsuarios();
    //0 = estudiante
    if(existecorreo == false && existeid == false)
    {
      if(seleccion.equals("0"))
      {
        Estudiante estd = new Estudiante(nombre, correo, password, id, facultad);
        Usuario user = estd;
        single.addUsuario(user);
      }
      else
      {
        Bibliotecario bibl = new Bibliotecario(nombre, correo, password, id, facultad);
        Usuario user = bibl;
        single.addUsuario(user);
      }
    }
    else
    {
      return "ID o correo en uso";
    }
    return "Registro exitoso";
  }

  @RequestMapping("/crearLibro")
  @ResponseBody
  String crearLibro(String nombre, String autor,String keywords,String ISBN,int cantidad,String descripcion)
  {
    Arreglos single = Arreglos.constructora();
    ArrayList<Libro> libros = single.getLibros();

    Libro libro = new Libro(nombre, autor, keywords, ISBN, cantidad, descripcion);
    single.addLibro(libro);

    return "Registro exitoso";
  }

  @RequestMapping("/ingresaUsuario")
  @ResponseBody
  String ingresaUsuario(String correo, String password){
    String contrasena = password;
    String respuesta ="";
    boolean existecorreo = this.existecorreo(correo);

    Arreglos single = Arreglos.constructora();
    ArrayList<Usuario> users = single.getUsuarios();
    if(existecorreo)
    {
      respuesta = "existe";
      for(Usuario usuario : users)

      {
        respuesta= "ciclo";
        if(usuario instanceof Estudiante)
          {
            respuesta="Entro a correo estudiante";
            if(usuario.getCorreo().equalsIgnoreCase(correo) ){
              if(usuario.getContrasena().equals(password)){
                respuesta="1";
                break;
              }else{
                respuesta="3";
                break;
              }
            }else{
              respuesta = "4";

            }
             // respuesta="Estudiante";
          } else if(usuario instanceof Bibliotecario){
            respuesta="Entro a correo estudiante";

              if(usuario.getCorreo().equalsIgnoreCase(correo)){
                if(usuario.getContrasena().equals(password)){
                respuesta="2";
                break;
                }else{
                  respuesta="3";
                  break;
                }
              }else{
                respuesta = "4";

              }
        }else{
          respuesta="excepcion";

        }
      }
    }else{
      respuesta="5";
    }
    return respuesta;

  }
  @RequestMapping("/devuelveLibros")
  @ResponseBody
  String devuelveLibros(){
    String respuesta="";
    Arreglos single = Arreglos.constructora();
    ArrayList<Libro> libros = single.getLibros();
    for(Libro libro : libros){
      respuesta += "Nombre: "+libro.getNombre()+"\nISBN: "+libro.getISBN()+"\nAutor: "+libro.getAutor()+"\nCantidad de ejemplares "+libro.getCantidad()+"\n\n";
    }
    return respuesta;
  }

  @RequestMapping("/existeLibro")
  @ResponseBody
  String existeLibro(String ISBN){
    String rta="";
    Arreglos single = Arreglos.constructora();
    ArrayList<Libro> libros = single.getLibros();
    for(Libro libro:libros){
      if(libro.getISBN().equals(ISBN)){
        rta="1";
        break;
      }else 
      rta="0";
    }
    return rta;

  }
  @RequestMapping("/devuelveLibro")
  @ResponseBody
  String devuelveLibro(String ISBN){
    String rta="";
    Arreglos single = Arreglos.constructora();
    ArrayList<Libro> libros = single.getLibros();
    for(Libro libro:libros){
      if(libro.getISBN().equals(ISBN)){
        rta=libro.getISBN()+","+libro.getNombre()+","+libro.getAutor()+","+libro.getCantidad()+","+libro.getKeywords()+","+libro.getDescripcion();
        break;
      }else 
      rta="0";
    }
    return rta;

  }
  @RequestMapping("/actualizarLibro")
  @ResponseBody
  String actualizarLibro(String nombre, String autor,String keywords,String ISBN,int cantidad,String descripcion,String ISBNanterior){
    Arreglos single = Arreglos.constructora();
    ArrayList<Libro> libros = single.getLibros();
    String rta ="";
    for(Libro libro:libros){
      if(libro.getISBN().equals(ISBNanterior)){
        libro.setISBN(ISBN);
        libro.setNombre(nombre);
        libro.setAutor(autor);
        libro.setKeywords(keywords);
        libro.setCantidad(cantidad);
        libro.setDescripcion(descripcion);
        rta="1";
        break;
      }else 
      rta="0";
    }
    return rta;

  }
  @RequestMapping("/eliminarLibro")
  @ResponseBody
  String eliminarLibro(String ISBN){
    Arreglos single = Arreglos.constructora();
    ArrayList<Libro> libros = single.getLibros();
    String rta ="";
    for(int i =0; i<libros.size();i++){
      if(libros.get(i).getISBN().equals(ISBN)){
        libros.remove(i);
        rta="eliminado";
        break;
      }else
      rta="No existe";
    }
    return rta;
  }
  @RequestMapping("/verificacionexistencia")
  @ResponseBody
  boolean existeid(String id)
  {
    boolean existeid=false;
    Arreglos single = Arreglos.constructora();
    ArrayList<Usuario> users = single.getUsuarios();
    for(Usuario usuario : users)
    {

      if(usuario instanceof Estudiante)
      {
        Estudiante estud = (Estudiante) usuario;
        if(estud.getId().equals(id))
        {
          existeid = true;
        }
      }
      else if(usuario instanceof Bibliotecario)
      {
        Bibliotecario bibliot = (Bibliotecario) usuario;
        if(bibliot.getId().equals(id))
        {
          existeid = true;
        }
      }
    }

    return existeid;
  }

  boolean existecorreo(String correo){
    boolean existecorreo=false;
    Arreglos single = Arreglos.constructora();
    ArrayList<Usuario> users = single.getUsuarios();
    for(Usuario usuario : users)
    {

      if(usuario instanceof Estudiante)
      {
        Estudiante estud = (Estudiante) usuario;
        if(estud.getCorreo().equalsIgnoreCase(correo))
        {
          existecorreo = true;
        }
      }
      else if(usuario instanceof Bibliotecario)
      {
        Bibliotecario bibliot = (Bibliotecario) usuario;
        if(bibliot.getCorreo().equalsIgnoreCase(correo))
        {
          existecorreo= true;
        }
      }
    }
    return existecorreo;
  }


  public static void main(String[] args) {
    SpringApplication.run(DemoApplication.class, args);
  }
}
