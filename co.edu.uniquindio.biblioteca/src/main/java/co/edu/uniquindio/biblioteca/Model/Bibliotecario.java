package co.edu.uniquindio.biblioteca.Model;

import co.edu.uniquindio.biblioteca.Model.Services.IGestionInventario;

import java.util.ArrayList;
import java.util.List;

/* Responsabilidad única
*  Abierto y cerrado
*  Sustitución
* Segregación de interfaz
* */
public class Bibliotecario extends Empleado implements IGestionInventario {
    List<Libro> listalibros = new ArrayList<>();
    List<Prestamo> listaPrestamos = new ArrayList<>();

    /* Constructor */
    public Bibliotecario() {
    }

    /* Getters and Setters */
    public List<Libro> getListalibros() {
        return listalibros;
    }

    public void setListalibros(List<Libro> listalibros) {
        this.listalibros = listalibros;
    }

    public List<Prestamo> getListaPrestamos() {
        return listaPrestamos;
    }

    public void setListaPrestamos(List<Prestamo> listaPrestamos) {
        this.listaPrestamos = listaPrestamos;
    }

    /* Metodo para gestionar los préstamos */
    public void gestionarPrestamos(){

    }

    /* Método para controlar los items de la biblioteca */
    @Override
    public String gestionarItems() {
        return null;
    }
}
