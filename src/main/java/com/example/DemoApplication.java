package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.*;
SOURCES = Estudiante.java

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

  @RequestMapping("/crearUsuario")
  @ResponseBody
  void crearUsuario(String nombre, String correo,String contraseña,String id,String facultad,String seleccion)
  {
    //0 = estudiante
    if(seleccion.equals("0"))
    {
      Estudiante estd = new Estudiante(nombre, correo, contraseña, id, facultad);
    }
  }


  public static void main(String[] args) {
    SpringApplication.run(DemoApplication.class, args);
  }
}
