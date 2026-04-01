package TPn7.n2;

public class Pato extends Animal implements iCaminantes,iNadadores,iVoladores{

    private String animal;

    public Pato() {
        this.animal = "Pato";
    }

    public String getAnimal() {
        return animal;
    }

    public void setAnimal(String animal) {
        this.animal = animal;
    }

    @Override
    public String comer() {
        return "Comiendo pescadito";
    }

    @Override
    public String dormir() {
        return "ZzZz durmiendo";
    }

    @Override
    public String sonidoFeliz() {
        return "Cuack cuack :)";
    }

    @Override
    public String sonidoPeligro() {
        return "Cuack cuaaaaack";
    }

    @Override
    public String comunicacion() {
        return "Cuack";
    }

    @Override
    public String caminar() {
        return getAnimal() + " está caminando";
    }

    @Override
    public String nadar() {
        return getAnimal() + " esta nadando";
    }

    @Override
    public String volar() {
        return getAnimal() + " esta volando";
    }
}
