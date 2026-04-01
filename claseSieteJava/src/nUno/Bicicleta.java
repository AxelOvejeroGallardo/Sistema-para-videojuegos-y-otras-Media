package nUno;

import nUno.TipoTransporte;
import nUno.Transporte;

public class Bicicleta implements Transporte {
    private String numeroSerie;
    private TipoTransporte tipo;

    public Bicicleta(String numeroSerie, TipoTransporte tipo) {
        this.numeroSerie = numeroSerie;
        this.tipo = tipo;
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(String numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    public TipoTransporte getTipo() {
        return tipo;
    }

    public void setTipo(TipoTransporte tipo) {
        this.tipo = tipo;
    }

    @Override
    public String arrancar() {
        return ("Arranca la bicicleta: " + getNumeroSerie());
    }

    @Override
    public String detener() {
        return "Se detiene la bicicleta:" + getNumeroSerie();
    }

    @Override
    public int obtenerCapacidad() {
        return 1;
    }
    public void ajustarAlturaAsiento(int altura){
        System.out.println("La bicicleta " + numeroSerie + " tiene un asiento con " + altura + " de altura");   
    }
}