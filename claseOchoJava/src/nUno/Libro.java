package nUno;

import java.time.LocalDateTime;
import java.util.Objects;

public class Libro {
    private String titulo;
    private String autor;
    private double precio;
    private String anioPublicacion;

    public Libro(String titulo, String autor, double precio, String anioPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.precio = precio;
        this.anioPublicacion = anioPublicacion;
    }

    public Libro(){
        this.precio = 0;
        this.autor = "";
        this.titulo = "";
        this.anioPublicacion = "";
    }

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

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(String anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Libro libro = (Libro) o;
        return Objects.equals(titulo,libro.titulo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTitulo());
    }

    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", precio=" + precio +
                ", anioPublicacion='" + anioPublicacion + '\'' +
                '}';
    }
}
