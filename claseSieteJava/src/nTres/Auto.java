package nTres;

public class Auto extends Vehiculo implements InteraccionesVehiculoDePasajeros {
    private int cantPasajeros;
    public Auto(String marca, String modelo, int velocidadMaxima, int cantPasajeros){
        super(marca, modelo, velocidadMaxima);
        this.cantPasajeros = cantPasajeros;
    }

    public int getCantPasajeros() {
        return cantPasajeros;
    }

    public void setCantPasajeros(int cantPasajeros) {
        this.cantPasajeros = cantPasajeros;
    }

    @Override
    public String arrancar() {
        return "El auto esta arrancando";
    }

    @Override
    public String frenar() {
        return "El auto freno";
    }

    @Override
    public String acelerar() {
        return "El auto esta acelerando";
    }

    @Override
    public String apagar() {
        return "El auto se apago";
    }
    @Override
    public void cambiarCapacidadPasajeros(int i) {
        this.cantPasajeros = i;
    }
    @Override
    public String toString() {
        return super.toString() + "\nCapacidad Pasajeros: " + getCantPasajeros();
    }

}
