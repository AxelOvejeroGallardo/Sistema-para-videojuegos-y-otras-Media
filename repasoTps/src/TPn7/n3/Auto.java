package TPn7.n3;

public class Auto extends Vehiculo implements iVehiculoPasajeros{
    public Auto(String marca, String modelo, int velocidadMaxima) {
        super(marca, modelo, velocidadMaxima);
    }

    @Override
    public String arrancar() {
        return "Arranca el auto";
    }

    @Override
    public String frenar() {
        return "Frena el auto";
    }

    @Override
    public String acelerar() {
        return "Acelera el auto";
    }

    @Override
    public String apagar() {
        return "Se apaga el motor del auto";
    }

    @Override
    public int cantidadPasajeros(int cantidadPasajeros) {
        return cantidadPasajeros;
    }
}
