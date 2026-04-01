package nUno;

public class Autobus implements Transporte {

    private int numeroLinea;
    private int capacidad;
    private TipoTransporte tipo;

    public Autobus(int numeroLinea, int capacidad, TipoTransporte tipo) {
        this.numeroLinea = numeroLinea;
        this.capacidad = capacidad;
        this.tipo = tipo;
    }

    public int getNumeroLinea() {
        return numeroLinea;
    }

    public void setNumeroLinea(int numeroLinea) {
        this.numeroLinea = numeroLinea;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public TipoTransporte gettipo() {
        return tipo;
    }

    public void setTipoTransporte(TipoTransporte tipo) {
        this.tipo = tipo;
    }
    @Override
    public String arrancar() {
        return "Autobus " + getNumeroLinea() + " arranco";
    }

    @Override
    public String detener() {
        return "Autobus " + getNumeroLinea() + " se detuvo";
    }

    @Override
    public int obtenerCapacidad() {
        return capacidad;
    }
    public void proximaParada(String parada){
        System.out.println("proxima parada: " + parada);
    }
}