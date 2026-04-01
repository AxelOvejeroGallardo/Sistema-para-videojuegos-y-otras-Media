package TPn7.n2;

public class Pez extends Animal implements iNadadores{
    private String animal;

    public Pez() {
        this.animal = "Pez";
    }

    public String getAnimal() {
        return animal;
    }

    public void setAnimal(String animal) {
        this.animal = animal;
    }

    @Override
    public String comer() {
        return "comiendo algas";
    }

    @Override
    public String dormir() {
        return getAnimal() + " durmiendo";
    }

    @Override
    public String comunicacion() {
        return "glu glu";
    }

    @Override
    public String sonidoFeliz() {
        return "glu glu :)";
    }

    @Override
    public String sonidoPeligro() {
        return "GLUUU GLUUUU";
    }

    @Override
    public String nadar() {
        return getAnimal() + " nadando";
    }
}
