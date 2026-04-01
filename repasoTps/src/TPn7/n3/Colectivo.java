package TPn7.n3;

public class Colectivo extends Vehiculo implements iVehiculoPasajeros,iVehiculoCarga{
    public Colectivo(String marca, String modelo, int velocidadMaxima) {
        super(marca, modelo, velocidadMaxima);
    }

    @Override
    public String arrancar() {
        return "Colectivo arrancando";
    }

    @Override
    public String frenar() {
        return "Colectivo frenando";
    }

    @Override
    public String acelerar() {
        return "Colectivo frenando";
    }

    @Override
    public String apagar() {
        return "Apagando el motor del Colectivo";
    }

    @Override
    public double peso(double peso) {
        return peso;
    }

    @Override
    public int cantidadPasajeros(int cantidadPasajeros) {
        return cantidadPasajeros;
    }
}
