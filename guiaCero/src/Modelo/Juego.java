package Modelo;

import Excepciones.DatoInvalido;
import Excepciones.VersionInvalidaException;

public class Juego extends Media {
    private String version;

    public Juego(String titulo, String creador, String genero, String version){
        super(titulo, creador, genero);
        this.version = version;
    }
    public String getVersion() {
        return version;
    }
    public void setVersion(String version) throws VersionInvalidaException,DatoInvalido {
        if (version == null || !version.matches("\\d+(\\.\\d+)?")) {
            throw new DatoInvalido("Formato inválido: solo números y un punto decimal");
        }

        double numero = Double.parseDouble(version);

        if (numero <= 0) {
            throw new VersionInvalidaException("La versión debe ser mayor a 0");
        }

        this.version = version;
    }

    @Override
    public String toString() {
        return "ID Juego:"+ getId() +"Juego{" +
                "titulo='" + getTitulo()+ '\'' +
                ", creador='" + getCreador() + '\'' +
                ", genero='" + getGenero() +
                "', version='" + version +
                '}';
    }
    public String getTipo() {
        return "Juego";
    }

}

