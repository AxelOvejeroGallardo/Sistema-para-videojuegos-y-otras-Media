package nDos;

public abstract class Animales {
    private String nombreAnimal;
    public Animales(String nombreAnimal) {
        this.nombreAnimal = nombreAnimal;
    }

    public String getNombreAnimal() {
        return nombreAnimal;
    }

    public void setNombreAnimal(String nombreAnimal) {
        this.nombreAnimal = nombreAnimal;
    }
    public abstract String comer();
    public abstract String dormir();
    public abstract String mostrarHabilidades();

    @Override
    public String toString() {
        return "Animales{" +
                "nombreAnimal='" + nombreAnimal + '\'' +
                '}';
    }
}
