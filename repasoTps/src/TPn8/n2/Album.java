package TPn8.n2;

import java.util.ArrayList;

public class Album {
    private int anioPublicacion;
    private String titulo;
    private Artista principal;

    public Album(int anioPublicacion, String titulo, Artista principal) {
        this.anioPublicacion = anioPublicacion;
        this.titulo = titulo;
        this.principal = principal;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Artista getPrincipal() {
        return principal;
    }

    public void setPrincipal(Artista principal) {
        this.principal = principal;
    }

    @Override
    public String toString() {
        return "Album{" +
                "anioPublicacion=" + anioPublicacion +
                ", titulo='" + titulo + '\'' +
                ", principal=" + principal +
                '}';
    }
}

