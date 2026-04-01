package TPn7.n1;

import TPn7.n1.TipoTransporte;
import TPn7.n1.iTransporte;

public class Tranvia implements iTransporte {

    private String ruta;
    private int capacidad;
    private TipoTransporte tipoTransporte;

    public Tranvia(String ruta, int capacidad, TipoTransporte tipoTransporte) {
        this.ruta = ruta;
        this.capacidad = capacidad;
        this.tipoTransporte = tipoTransporte;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
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
        return "arranca el tranvia";
    }

    @Override
    public String detener() {
        return "se detiene el tranvia";
    }

    @Override
    public int obtenerCapacidad() {
        return getCapacidad();
    }

    public String cambiarVia (int via){
        return "Se cambio a la via " + via;
    }
}

