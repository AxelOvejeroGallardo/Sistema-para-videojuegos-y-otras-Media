package TPn11;

import java.util.Objects;

public class Alumno {
    private String nombre;
    private String nacionalidad;

    public Alumno(String nombre, String nacionalidad) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "nombre='" + nombre + '\'' +
                ", nacionalidad='" + nacionalidad + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Alumno alumno)) return false;
        return Objects.equals(getNombre(), alumno.getNombre()) && Objects.equals(getNacionalidad(), alumno.getNacionalidad());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNombre(), getNacionalidad());
    }
}
