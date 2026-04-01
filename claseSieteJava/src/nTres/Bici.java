package nTres;

public class Bici extends Vehiculo implements InteraccionesVehiculoDePasajeros {
    private int alturaAsiento;

    public Bici(String marca, String modelo, int velocidadMaxima, int alturaAsiento) {
        super(marca, modelo, velocidadMaxima);
        this.alturaAsiento = alturaAsiento;
    }

    public int getAlturaAsiento() {
        return alturaAsiento;
    }

    public void setAlturaAsiento(int alturaAsiento) {
        this.alturaAsiento = alturaAsiento;
    }

    @Override
    public String arrancar() {
        return "Arranca la bici";
    }

    @Override
    public String frenar() {
        return "Frena la bici";
    }

    @Override
    public String acelerar() {
        return "Acelera la bici";
    }

    @Override
    public String apagar() {
        return "Se para la bici";
    }

    @Override
    public void cambiarCapacidadPasajeros(int i) {

    }
}
