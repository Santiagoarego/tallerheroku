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
    private ArrayList<Prestamo> prestamos = new ArrayList();
    private ArrayList<Reserva> reservas = new ArrayList();
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
    public void setLibros(ArrayList<Libro> usuarios1) {
        this.libros = usuarios1;
    }

    public ArrayList<Prestamo> getPrestamos()
    {
      return this.prestamos;
    }

    public void addPrestamo(Prestamo libro)
    {
      this.prestamos.add(libro);
    }
    public void setPrestamos(ArrayList<Prestamo> usuarios1) {
        this.prestamos = usuarios1;
    }

    public void guardaLibro(Libro libro) {
        libros.add(libro);
    }

    public ArrayList<Reserva> getReservas()
    {
      return this.reservas;
    }

    public void addReserva(Reserva libro)
    {
      this.reservas.add(libro);
    }
    public void setReservas(ArrayList<Reserva> reservas) {
        this.reservas = reservas;
    }

}
