package TPn7.n2;

public class Murcielago extends Animal implements iVoladores,iColgados{

    private String animal;

    public Murcielago() {
        this.animal = "Murcielago";
    }

    public String getAnimal() {
        return animal;
    }

    public void setAnimal(String animal) {
        this.animal = animal;
    }

    @Override
    public String comer() {
        return getAnimal() +" comiendo";
    }

    @Override
    public String dormir() {
        return getAnimal() + " durmiendo";
    }

    @Override
    public String comunicacion() {
        return "nick nick";
    }

    @Override
    public String sonidoFeliz() {
        return " nick nick :) ";
    }

    @Override
    public String sonidoPeligro() {
        return "niiiick niiiiick";
    }

    @Override
    public String volar() {
        return getAnimal() + " esta volando";
    }

    @Override
    public String colgarse() {
        return getAnimal() + " esta colgado";
    }
}
