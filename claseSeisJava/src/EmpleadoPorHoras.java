public abstract class EmpleadoPorHoras extends Empleado{
    private double horasTrabajadas;
    private double precioXHora = 200;

    public EmpleadoPorHoras(String nombre, double horasTrabajadas) {
        super(nombre);
        this.horasTrabajadas = horasTrabajadas;
    }

    public double getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(double horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public double getPrecioXHora() {
        return precioXHora;
    }

    public void setPrecioXHora(double precioXHora) {
        this.precioXHora = precioXHora;
    }

    @Override
    public double calcularPago() {

        double salarioXHoras = horasTrabajadas * precioXHora;

        return salarioXHoras;
    }
}
