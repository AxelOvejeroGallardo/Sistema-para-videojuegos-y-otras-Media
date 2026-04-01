public abstract class EmpleadoContratista extends Empleado{
        private double tarifaXHora = 350;
        private double horasTrabajadas;

    public EmpleadoContratista(String nombre, double horasTrabajadas) {
        super(nombre);
        this.horasTrabajadas = horasTrabajadas;
    }

    public double getTarifaXHora() {
        return tarifaXHora;
    }

    public void setTarifaXHora(double tarifaXHora) {
        this.tarifaXHora = tarifaXHora;
    }

    public double getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(double horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    @Override
    public double calcularPago() {

        double sueldoHorasXProyecto = horasTrabajadas *tarifaXHora;

        return sueldoHorasXProyecto;
    }
}
