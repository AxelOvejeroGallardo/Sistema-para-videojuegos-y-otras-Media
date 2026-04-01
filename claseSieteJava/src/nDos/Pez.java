package nDos;
public class Pez extends Animales implements Nadadores, EstadoAnimal {
    private String tamanioPez;
    public Pez(String nombreAnimal, String tamanioPez) {
        super(nombreAnimal);
        this.tamanioPez = tamanioPez;
    }

    public String getTamanioPez() {
        return tamanioPez;
    }

    public void setTamanioPez(String tamanioPez) {
        this.tamanioPez = tamanioPez;
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
        return "Es el mejor de todos los nadadores";
    }

    @Override
    public String feliz() {
        return "gluuu gluuu (se encuentra feliz)";
    }

    @Override
    public String peligro() {
        return "GLUU GLUU (se siente en peligro)";
    }

    @Override
    public String neutral() {
        return "glu glu (se siente normal)";
    }

    @Override
    public String nadar() {
        return "esta nadando";
    }

    @Override
    public String toString() {
        return super.toString() + " tiene un tamanio de " + getTamanioPez();
    }
}
