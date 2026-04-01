package TPn10.n2;

import java.util.Objects;

public class Persona2 {
    private String nombre;
    private int DNI;
    private int edad;

    public Persona2(String nombre, int DNI, int edad) {
        this.nombre = nombre;
        this.DNI = DNI;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Persona2{" +
                "nombre='" + nombre + '\'' +
                ", DNI=" + DNI +
                ", edad=" + edad +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Persona2 persona2)) return false;
        return getDNI() == persona2.getDNI();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getDNI());
    }
}
