package TPn8.n2;

import java.util.Objects;

public class Cancion implements Comparable{
    private String nombreCancion;
    private double duracionCancion;
    private eGenero genero;
    private Artista invitado;
    private Album album;
    public Cancion(String nombreCancion, double duracionCancion, eGenero genero,Album album) {
        this.nombreCancion = nombreCancion;
        this.duracionCancion = duracionCancion;
        this.genero = genero;
        this.invitado = null;
        this.album = album;
    }
    public Cancion(String nombreCancion, double duracionCancion, eGenero genero,Artista invitado,Album album) {
        this.nombreCancion = nombreCancion;
        this.duracionCancion = duracionCancion;
        this.genero = genero;
        this.invitado = invitado;
        this.album = album;
    }

    public String getNombreCancion() {
        return nombreCancion;
    }

    public void setNombreCancion(String nombreCancion) {
        this.nombreCancion = nombreCancion;
    }

    public double getDuracionCancion() {
        return duracionCancion;
    }

    public void setDuracionCancion(double duracionCancion) {
        this.duracionCancion = duracionCancion;
    }

    public eGenero getGenero() {
        return genero;
    }

    public void setGenero(eGenero genero) {
        this.genero = genero;
    }

    public Artista getInvitado() {
        return invitado;
    }

    public void setInvitado(Artista invitado) {
        this.invitado = invitado;
    }

    public Album getAlbum() {
        return album;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }

    @Override
    public String toString() {
        return "Cancion{" +
                "nombreCancion='" + nombreCancion + '\'' +
                ", duracionCancion=" + duracionCancion +
                ", genero=" + genero +
                ", invitado=" + invitado +
                ", album=" + album +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cancion cancion)) return false;
        return Objects.equals(getNombreCancion(), cancion.getNombreCancion());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNombreCancion());
    }
}
