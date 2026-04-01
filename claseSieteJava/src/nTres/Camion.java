package nTres;

public class Camion extends Vehiculo implements InteraccionesVehiculoDeCarga {
    private double capacidadCarga;

    public Camion(String marca, String modelo, int velocidadMaxima, double capacidadCarga) {
        super(marca, modelo, velocidadMaxima);
        this.capacidadCarga = capacidadCarga;
    }

    public double getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(double capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    @Override
    public String arrancar() {
        return "El camion esta arrancando";
    }

    @Override
    public String frenar() {
        return "El camion freno";
    }

    @Override
    public String acelerar() {
        return "El camion esta acelerando";
    }

    @Override
    public String apagar() {
        return "El camion se apago";
    }

    @Override
    public void cargaVehiculo(double toneladas) {
        this.capacidadCarga = toneladas;
    }

    @Override
    public String toString() {
        return super.toString() + "\nCarga vehiculo: " + getCapacidadCarga();
    }
}
