package TPn7.n3;

public class Camion extends Vehiculo implements iVehiculoCarga{
    public Camion(String marca, String modelo, int velocidadMaxima) {
        super(marca, modelo, velocidadMaxima);
    }

    @Override
    public String arrancar() {
        return "Arranca camion";
    }

    @Override
    public String frenar() {
        return "Frena camion";
    }

    @Override
    public String acelerar() {
        return "Acelera el camion";
    }

    @Override
    public String apagar() {
        return "Se apaga el motor del camion";
    }

    @Override
    public double peso(double peso) {
        return peso;
    }
}
