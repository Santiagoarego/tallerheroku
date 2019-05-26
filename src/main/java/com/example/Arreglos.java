package com.example;

import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Arreglos {

    private static Arreglos instancia = null;
    private ArrayList<Usuario> usuarios = new ArrayList();
    private ArrayList<Libro> libros = new ArrayList();
    public String IdSession;
    public static Arreglos constructora() {

        if (instancia == null) {
            instancia = new Arreglos();
        }

        return instancia;
    }


    public void guardaUsuario(Usuario user) {
        usuarios.add(user);
    }

    public void setUsuarios(ArrayList<Usuario> usuarios1) {
        this.usuarios = usuarios1;
    }

    public ArrayList<Usuario> getUsuarios() {
        return this.usuarios;
    }

    public void addUsuario(Usuario usuario)
	{
		this.usuarios.add(usuario);
	}

    public ArrayList<Libro> getLibros()
    {
      return this.libros;
    }

    public void addLibro(Libro libro)
    {
      this.libros.add(libro);
    }
}
