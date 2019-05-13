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

  @RequestMapping("/crearUsuario")
  @ResponseBody
  void crearUsuario(String nombre, String correo,String contraseña,String id,String facultad) {
    return "Hola mundo!";
  }


  public static void main(String[] args) {
    SpringApplication.run(DemoApplication.class, args);
  }
}
