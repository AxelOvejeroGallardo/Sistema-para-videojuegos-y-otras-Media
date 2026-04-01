package TPn5.n4;

public class Staff extends Persona {
    private double salario;
    private Turno turno;

    public Staff(String dni, String nombre, String apellido, String email, String direccion, double salario, Turno turno) {
        super(dni, nombre, apellido, email, direccion);
        this.salario = salario;
        this.turno = turno;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Turno getTurno() {
        return turno;
    }

    public void setTurno(Turno turno) {
        this.turno = turno;
    }
}
