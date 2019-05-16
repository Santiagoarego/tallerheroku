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
  void crearUsuario(String nombre, String correo,String contraseña,String id,String facultad,String seleccion)
  {
    boolean existecorreo = false;
    boolean existeid = false;
    Arreglos single = Arreglos.constructora();
    ArrayList<Usuario> users = single.getUsuarios();
    for(Usuario usuario : users)
    {
      if(usuario instanceof Estudiante)
      {
        Estudiante estud = usuario;
        if(estud.getId.equals(id))
        {
          existeid = true;
        }
        if(estud.getCorreo.equals(correo))
        {
          existecorreo = true;
        }
      }
      else if(usuario instanceof Bibliotecario)
      {
        Bibliotecario bibliot = usuario;
        if(bibliot.getId.equals(id))
        {
          existeid = true;
        }
        if(bibliot.getCorreo.equals(correo))
        {
          existecorreo = true;
        }
      }
    }
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
      //acá se debe lanzar un error donde se especifique que no se puede guardar el usuario, debido a que ese correo y/o esa contraseña ya está registrada
    }
  }


  public static void main(String[] args) {
    SpringApplication.run(DemoApplication.class, args);
  }
}
