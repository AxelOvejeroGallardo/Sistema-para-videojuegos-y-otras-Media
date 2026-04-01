public class Empleado {
   ///Atributos
   private double salario;
    private String apellido;
    private String nombre;
    private String dni;

    ///constructor
    public Empleado(double salario, String apellido, String nombre, String dni) {
        this.salario = salario;
        this.apellido = apellido;
        this.nombre = nombre;
        this.dni = dni;
    }

    ///GET Y SET


    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    ///METODO
    public double calcularSalario() {
        double salarioAnual = salario * 12;
        return salarioAnual;
    }

    public double aumentoSalario(double aumento) {
        double decimal = aumento / 100;

        salario = salario + (salario * decimal);

        return salario;
    }

    public String verEmpleado() {
        String mensaje = "Nombre:[" + nombre + "]," + "Apellido:[" + apellido + "]," + "Dni:[" + dni + "]," + "Salario:[" + salario + "]";
        return  mensaje;
    }
}