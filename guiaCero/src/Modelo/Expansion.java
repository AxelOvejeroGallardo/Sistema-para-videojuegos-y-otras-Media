package Modelo;

import Excepciones.FechaException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Expansion extends Media {

    private LocalDate fechaLanzamiento;
    public Expansion(String titulo, String creador, String genero,LocalDate fechaLanzamiento){
        super(titulo,creador,genero);
        this.fechaLanzamiento = fechaLanzamiento;
    }

    public LocalDate getFecha() {
        return fechaLanzamiento;
    }

    @Override
    public String toString() {
        return " ID Expansion " + getId() + " Titulo= " + getTitulo() + " Creador= " + getCreador() + " Genero= " + getGenero() +
                ", fecha= " + fechaLanzamiento;
    }

    @Override
    public String getTipo() {
        return "Expansion";
    }
}
