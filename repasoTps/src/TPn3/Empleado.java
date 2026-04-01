package TPn3;

public class Empleado {
    private String dni;
    private String nombre;
    private String apellido;
    private double salario;

    public Empleado(String dni, String nombre, String apellido, double salario) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.salario = salario;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double calculoSalarioAnual(){
        return salario * 12;
    }

    public double aumentarSalario(double porcentaje){
        double porciento = porcentaje/100;
        salario = salario + (salario * porciento);
        return salario;
    }

    public String caracteristicas() {
        return "Empleado{" +
                "dni='" + dni + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", salario=" + salario +
                '}';
    }
}
