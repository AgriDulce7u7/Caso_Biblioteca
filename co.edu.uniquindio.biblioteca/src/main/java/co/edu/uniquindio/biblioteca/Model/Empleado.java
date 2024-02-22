package co.edu.uniquindio.biblioteca.Model;

/* Responsabilidad única */
public abstract class Empleado {
    private String nombre;
    private String id;
    Biblioteca ownedByBiblioteca;

    /* Constructor */
    public Empleado() {
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

    public Biblioteca getOwnedByBiblioteca() {
        return ownedByBiblioteca;
    }

    public void setOwnedByBiblioteca(Biblioteca ownedByBiblioteca) {
        this.ownedByBiblioteca = ownedByBiblioteca;
    }
}
