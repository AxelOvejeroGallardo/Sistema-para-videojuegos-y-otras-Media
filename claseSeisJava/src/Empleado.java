abstract class Empleado {
    private String nombre;

    public Empleado(String nombre) {
        this.nombre = nombre;
    }

    // Método abstracto → cada hijo lo implementa distinto
    public abstract double calcularPago();

    public String getNombre() {
        return nombre;
    }
}
