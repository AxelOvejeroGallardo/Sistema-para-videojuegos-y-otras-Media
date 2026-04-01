package TPn7.n1;

import java.util.UUID;

public class Bicicleta implements iTransporte {
   private UUID numSerie = null;
   private TipoTransporte tipoTransporte = null;

    public Bicicleta(TipoTransporte transporte) {
        this.numSerie = UUID.randomUUID();
        this.tipoTransporte = transporte;
    }

    public UUID getNumSerie() {
        return numSerie;
    }

    public void setNumSerie(UUID numSerie) {
        this.numSerie = numSerie;
    }

    public TipoTransporte getTipoTransporte() {
        return tipoTransporte;
    }

    public void setTipoTransporte(TipoTransporte tipoTransporte) {
        this.tipoTransporte = tipoTransporte;
    }

    public String ajustarAsiento (double cmAlto)
    {
        return "el asiento tiene " + cmAlto + " de alto";
    }

    @Override
    public String arrancar() {
        return "La bici arranco";
    }

    @Override
    public String detener() {
        return "La bici se detuvo";
    }

    @Override
    public int obtenerCapacidad() {
        return 1;
    }
}
