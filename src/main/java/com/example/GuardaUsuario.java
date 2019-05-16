package com.example;

import java.io.*;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(
        name = "usuario",
        urlPatterns = {"/guardaUsuario"}
    )
public class GuardaUsuario extends HttpServlet{



    public void doPost  (HttpServletRequest req, HttpServletResponse res)
    throws ServletException, IOException {
        res.setContentType("text/html");
        //Sirven para printear un HTML como respuesta
        PrintWriter pw = res.getWriter();

        Arreglos sing = Arreglos.constructora();
        //ACA SE DEBE ENVIAR EL ID, NO EL CORREO.
        if(!this.existeUsuario(Integer.parseInt(req.getParameter("")),sing.getUsuarios()))
        {
          //PONER CONDICIONAL QUE SE RELACIONE CON EL RADIOBUTTON PARA VER SI ESTA SELECCIONADO ESTUDIANTE
          if(1==1)
          {
            //Enviar parametros a estud
            Estudiante estud = new Estudiante();
            sing.guardaUsuario(estud);
          }
          //PONER CONDICIONAL QUE SE RELACIONE CON EL RADIOBUTTON PARA VER SI ESTA SELECCIONADO ESTUDIANTE
          else if(2==2)
          {
            //Enviar parametros a biblio
            Bibliotecario biblio = new Bibliotecario();
            sing.guardaUsuario(biblio);
          }
            pw.println("<HTML><SCRIPT>alert(\"Yeisson es gay\"); window.history.back();</SCRIPT></HTML>");
            pw.close();
        }else{
            pw.println("<HTML><SCRIPT>alert(\"El correo ya se está usando\"); window.history.back();</SCRIPT></HTML>");
            pw.close();
        }

    }

    public boolean existeUsuario(int ID, ArrayList<Usuario> users){
        boolean existe=false;
        for(int i=0; i<users.size();i++) {
            if(users.get(i).getId()==ID){
                existe=true;
                break;
            }

        }
        return existe;

    }
}
