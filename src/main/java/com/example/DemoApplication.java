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
    return "Hola mundo!";
  }
  @RequestMapping("/pruebaDeDatos")
  @ResponseBody
  String pruebaDeDatos(String nombre){
    return "prueba de datos "+nombre;
  }

  @RequestMapping("/crearUsuario")
  @ResponseBody
  String crearUsuario(String nombre, String correo,String contraseña,String id,String facultad,String seleccion)
  {
    boolean existecorreo = this.existecorreo(correo);
    boolean existeid = this.existeid(contraseña);
    Arreglos single = Arreglos.constructora();
    ArrayList<Usuario> users = single.getUsuarios();
    //0 = estudiante
    if(existecorreo == false && existeid == false)
    {
      if(seleccion.equals("0"))
      {
        Estudiante estd = new Estudiante(nombre, correo, contraseña, id, facultad);
        Usuario user = estd;
        single.addUsuario(user);
      }
      else
      {
        Bibliotecario bibl = new Bibliotecario(nombre, correo, contraseña, id, facultad);
        Usuario user = bibl;
        single.addUsuario(user);
      }
    }
    else
    {
      return "Ya esta usado";
    }
    return "Se guardo";
  }

  @RequestMapping("/ingresaUsuario")
  @ResponseBody
  String ingresaUsuario(String correo, String contraseña){
    String answer=null;
    boolean existecorreo = this.existecorreo();
    Arreglos single = Arreglos.constructora();
    ArrayList<Usuario> users = single.getUsuarios();
    if(existecorreo==true)
    {
      for(Usuario usuario : users)
      {
        if(usuario.getCorreo().equals(correo) && usuario.getContraseña().equals(contraseña) && usuario instanceof Estudiante)
        {
            answer = "0"//Para estudiante
        }
        else if(usuario.getCorreo().equals(correo) && usuario.getContraseña().equals(contraseña) && usuario instanceof Estudiante)
        {
          answer="1"//Para Bibliotecario
        }
        else
        {
          answer="2"//Para error
        }
      }
    }
    return answer;
  }

  @RequestMapping("/verificacionexistencia")
  @ResponseBody
  boolean existeid(String id){
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

  @RequestMapping("/verificacionexistenciacorreo")
  @ResponseBody
  boolean existecorreo(String correo){
    boolean existecorreo=false;
    Arreglos single = Arreglos.constructora();
    ArrayList<Usuario> users = single.getUsuarios();
    for(Usuario usuario : users)
    {

      if(usuario instanceof Estudiante)
      {
        Estudiante estud = (Estudiante) usuario;
        if(estud.getCorreo().equals(correo))
        {
          existecorreo = true;
        }
      }
      else if(usuario instanceof Bibliotecario)
      {
        Bibliotecario bibliot = (Bibliotecario) usuario;
        if(bibliot.getCorreo().equals(correo))
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
