package nTres;

public class Colectivo extends Vehiculo implements InteraccionesVehiculoDePasajeros,InteraccionesVehiculoDeCarga {
    private int cantPersonas;
    private double capacidadCarga;

    public Colectivo(String marca, String modelo, int velocidadMaxima, int cantPersonas, double capacidadCarga) {
        super(marca, modelo, velocidadMaxima);
        this.cantPersonas = cantPersonas;
        this.capacidadCarga = capacidadCarga;
    }

    public int getCantPersonas() {
        return cantPersonas;
    }

    public void setCantPersonas(int cantPersonas) {
        this.cantPersonas = cantPersonas;
    }

    public double getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(double capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    @Override
    public String arrancar() {
        return "El colectivo esta arrancando";
    }

    @Override
    public String frenar() {
        return "El colectivo freno";
    }

    @Override
    public String acelerar() {
        return "El colectivo esta acelerando";
    }

    @Override
    public String apagar() {
        return "El colectivo se apago";
    }

    @Override
    public void cambiarCapacidadPasajeros(int i) {
        this.cantPersonas = i;
    }

    @Override
    public void cargaVehiculo(double toneladas) {
        this.capacidadCarga = toneladas;
    }

    @Override
    public String toString() {
        return super.toString() + "\nCapacidad de personas: " + getCantPersonas() + "\nCapacidad peso: " + getCapacidadCarga();
    }
}
