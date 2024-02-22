package co.edu.uniquindio.biblioteca.Model;

import co.edu.uniquindio.biblioteca.Model.Enum.Estado;

/* Responsabilidad única */
public class Libro {
    private String titulo;
    private String autor;
    private int isbn;
    private Estado estado;
    Biblioteca ownedByBiblioteca;


    /* Constructor */
    public Libro() {
    }

    /* Getters and Setters */
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public Biblioteca getOwnedByBiblioteca() {
        return ownedByBiblioteca;
    }

    public void setOwnedByBiblioteca(Biblioteca ownedByBiblioteca) {
        this.ownedByBiblioteca = ownedByBiblioteca;
    }
}
