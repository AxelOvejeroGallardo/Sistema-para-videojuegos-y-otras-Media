package TPn6;

public class EmpleadoContratista extends Empleado {
    private int horasTrabajadas;
    private double tarifaPorHora;

    public EmpleadoContratista(String nombre,int horasTrabajadas, double tarifaPorHora) {
        super(nombre);
        this.horasTrabajadas = horasTrabajadas;
        this.tarifaPorHora = tarifaPorHora;
    }

    @Override
    public double calcularPago() {
        return horasTrabajadas * tarifaPorHora;
    }
}
