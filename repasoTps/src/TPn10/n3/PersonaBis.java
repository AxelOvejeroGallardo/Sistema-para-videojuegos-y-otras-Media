package TPn10.n3;

public class PersonaBis {
    private String nombre;
    private String dni; // ¡Cambiado a String!
    private int edad;

    public PersonaBis(String nombre, String dni, int edad) {
        this.nombre = nombre;
        this.dni = dni;
        this.edad = edad;
    }

    // --- Getters y Setters ---

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni; // DNI ahora devuelve un String
    }

    public int getEdad() {
        return edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "PersonaBis{Nombre='" + nombre + "', DNI='" + dni + "', Edad=" + edad + "}";
    }
}
