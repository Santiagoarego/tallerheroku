package com.example;

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

    Arreglos single = Arreglos.constructora();
    //0 = estudiante
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


  public static void main(String[] args) {
    SpringApplication.run(DemoApplication.class, args);
  }
}
