package Modelo;

import java.util.Objects;

public abstract class Media implements Comparable<Media> {
    private String titulo = "";
    private String creador = "";
    private String genero = "";
    private int id;
    private static int contador;

    public Media(String titulo, String creador, String genero) {
        contador++;
        this.titulo = titulo;
        this.creador = creador;
        this.genero = genero;
        this.id = contador;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCreador() {
        return creador;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getId() {
        return id;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Media)) return false;
        Media that = (Media) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Atributos{" +
                "titulo='" + titulo + '\'' +
                ", creador='" + creador + '\'' +
                ", genero='" + genero + '\'' +
                ", id=" + id +
                '}';
    }
    public abstract String getTipo();
    @Override
    public int compareTo(Media mediaX) {
        return Integer.compare(this.id, mediaX.id);
    }
}
