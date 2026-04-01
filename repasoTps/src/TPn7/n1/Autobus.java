package TPn7.n1;

public class Autobus implements iTransporte {
    private int numLinea;
    private int capacidad;
    private TipoTransporte tipoTransporte = null;
    public Autobus(int numLinea, int capacidad, TipoTransporte tipoTransporte) {
        this.numLinea = numLinea;
        this.capacidad = capacidad;
        this.tipoTransporte = tipoTransporte;
    }

    public String anunciarParada ( String parada){
        return "Proxima parada: " + parada;
    }

    public int getNumLinea() {
        return numLinea;
    }

    public void setNumLinea(int numLinea) {
        this.numLinea = numLinea;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public TipoTransporte getTipoTransporte() {
        return tipoTransporte;
    }

    public void setTipoTransporte(TipoTransporte tipoTransporte) {
        this.tipoTransporte = tipoTransporte;
    }

    @Override
    public String arrancar() {
        return "El autobus arranca";
    }

    @Override
    public String detener() {
        return "El autobus se detiene";
    }

    @Override
    public int obtenerCapacidad() {
        return getCapacidad();
    }
}
