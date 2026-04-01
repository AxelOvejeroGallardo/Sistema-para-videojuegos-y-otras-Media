package nDos;
public class Pato extends Animales implements EstadoAnimal, Voladores, Caminantes, Nadadores {
    private String colorPato;

    public Pato(String nombreAnimal, String colorPato) {
        super(nombreAnimal);
        this.colorPato = colorPato;
    }

    public String getColorPato() {
        return colorPato;
    }

    public void setColorPato(String colorPato) {
        this.colorPato = colorPato;
    }

    @Override
    public String comer() {
        return "Esta comiendo";
    }

    @Override
    public String dormir() {
        return "Esta durmiendo";
    }

    @Override
    public String mostrarHabilidades() {
        return super.toString() + "Puede Caminar\nVolar\nNadar";
    }

    @Override
    public String caminar() {
        return "esta caminando";
    }

    @Override
    public String feliz() {
        return "Cuak Cuak Cuak (se siente feliz)";
    }

    @Override
    public String peligro() {
        return "CUAAAC (se siente muy en peligro)";
    }

    @Override
    public String neutral() {
        return "cuak (no se siente en peligro)";
    }

    @Override
    public String nadar() {
        return "esta nadando";
    }

    @Override
    public String volar() {
        return "esta volando";
    }

    @Override
    public String toString() {
        return super.toString() + " Le divierte nadar, comer, ama dormir, camina a veces y adora volar";
    }
}
