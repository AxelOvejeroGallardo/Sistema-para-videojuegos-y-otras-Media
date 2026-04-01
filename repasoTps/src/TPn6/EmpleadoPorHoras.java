package TPn6;

public class EmpleadoPorHoras extends Empleado{
    private int horasTrabajadas;
    private double salarioPorHora;

    public EmpleadoPorHoras(String nombre, int horasTrabajadas, double salarioPorHora) {
        super(nombre);
        this.horasTrabajadas = horasTrabajadas;
        this.salarioPorHora = salarioPorHora;
    }

    @Override
    public double calcularPago() {
        double sueldo = 0;
        if(horasTrabajadas < 8){
            sueldo = salarioPorHora * horasTrabajadas;
        }else if(horasTrabajadas > 8){
            double plusDiezPorciento = (salarioPorHora*horasTrabajadas) * 0.1;
            sueldo =  (salarioPorHora*horasTrabajadas) + plusDiezPorciento;
        }
        return sueldo;
    }
}
