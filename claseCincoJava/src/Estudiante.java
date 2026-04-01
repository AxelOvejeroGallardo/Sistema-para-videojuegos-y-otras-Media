public class Estudiante extends Persona{
    private int anioIngreso;
    private double cuotaMensual;
    public Estudiante(String dni, String nombre, String apellido, String email, String direccion, int anioIngreso, double cuotaMensual) {
        super(dni, nombre, apellido, email, direccion);
        this.anioIngreso = anioIngreso;
        this.cuotaMensual = cuotaMensual;
    }

    public int getAnioIngreso() {
        return anioIngreso;
    }

    public void setAnioIngreso(int anioIngreso) {
        this.anioIngreso = anioIngreso;
    }

    public double getCuotaMensual() {
        return cuotaMensual;
    }

    public void setCuotaMensual(double cuotaMensual) {
        this.cuotaMensual = cuotaMensual;
    }

}
