package co.edu.uniquindio.biblioteca.Model;

import java.util.ArrayList;
import java.util.List;

/* Responsabilidad única */

public class Miembro {
    private String nombre;
    private String id;
    List<Prestamo> listaPrestamos = new ArrayList<>();
    Biblioteca ownedByBiblioteca;


    /* Constructor */
    public Miembro() {
    }

    /* Getters and Setters */
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<Prestamo> getListaPrestamos() {
        return listaPrestamos;
    }

    public void setListaPrestamos(List<Prestamo> listaPrestamos) {
        this.listaPrestamos = listaPrestamos;
    }

    public Biblioteca getOwnedByBiblioteca() {
        return ownedByBiblioteca;
    }

    public void setOwnedByBiblioteca(Biblioteca ownedByBiblioteca) {
        this.ownedByBiblioteca = ownedByBiblioteca;
    }
}
