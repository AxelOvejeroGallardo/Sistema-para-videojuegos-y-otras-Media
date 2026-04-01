package nDos;
public class Murcielago extends Animales implements Voladores, Colgantes, EstadoAnimal {
    private String colorMurcielago;

    public Murcielago(String nombreAnimal, String colorMurcielago) {
        super(nombreAnimal);
        this.colorMurcielago = colorMurcielago;
    }

    public String getColorMurcielago() {
        return colorMurcielago;
    }

    public void setColorMurcielago(String colorMurcielago) {
        this.colorMurcielago = colorMurcielago;
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
        return super.toString() + " puede volar y colgarse de las paredes de una cueva";
    }

    @Override
    public String colgarse() {
        return "esta colgado";
    }

    @Override
    public String feliz() {
        return "ch ch ch (ruiditos de alegria y felicidad)";
    }

    @Override
    public String peligro() {
        return "CHCHCH CHCH CH (ruiditos de peligro)";
    }

    @Override
    public String neutral() {
        return " ch ch(no se siente amenazado)";
    }

    @Override
    public String volar() {
        return "Esta volando";
    }

    @Override
    public String toString() {
        return super.toString() + " es de color " + getColorMurcielago();
    }
}
