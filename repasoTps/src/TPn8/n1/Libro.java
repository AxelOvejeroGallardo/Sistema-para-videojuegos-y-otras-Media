package TPn8.n1;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.Objects;

public class Libro implements Comparable {
    private String titulo;
    private String autor;
    private double precio;
    private LocalDate diaPublicacion;

    public Libro(String titulo, String autor, double precio, LocalDate diaPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.precio = precio;
        this.diaPublicacion = diaPublicacion;
    }

    public Libro(String titulo) {
        this.titulo = titulo;
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

    public LocalDate getDiaPublicacion() {
        return diaPublicacion;
    }

    public void setDiaPublicacion(LocalDate diaPublicacion) {
        this.diaPublicacion = diaPublicacion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Libro libro)) return false;
        return Objects.equals(getTitulo(), libro.getTitulo());
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
                ", diaPublicacion=" + diaPublicacion +
                '}';
    }

    @Override
    public int compareTo(Object obj){
        Libro libro = (Libro) obj;
        return ((Double) (libro.getPrecio())).compareTo((Double)this.precio);
    }
}
