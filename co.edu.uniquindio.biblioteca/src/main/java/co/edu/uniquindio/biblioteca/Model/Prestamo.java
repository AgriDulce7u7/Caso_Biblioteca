package co.edu.uniquindio.biblioteca.Model;

import java.util.Date;

/* Responsabilidad única */
public class Prestamo {
    private Date fechaPrestamo;
    private Date fechaDevolucion;
    public Libro libroAsociado;
    public Miembro miembroAsociado;
    Biblioteca ownedByBiblioteca;


    /* Constructor */
    public Prestamo() {
    }

    /* Getters and Setters */
    public Date getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(Date fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public Date getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(Date fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public Libro getLibroAsociado() {
        return libroAsociado;
    }

    public void setLibroAsociado(Libro libroAsociado) {
        this.libroAsociado = libroAsociado;
    }

    public Miembro getMiembroAsociado() {
        return miembroAsociado;
    }

    public void setMiembroAsociado(Miembro miembroAsociado) {
        this.miembroAsociado = miembroAsociado;
    }

    public Biblioteca getOwnedByBiblioteca() {
        return ownedByBiblioteca;
    }

    public void setOwnedByBiblioteca(Biblioteca ownedByBiblioteca) {
        this.ownedByBiblioteca = ownedByBiblioteca;
    }
}
