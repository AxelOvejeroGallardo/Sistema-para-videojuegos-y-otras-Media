package TPn3;

public class CuentaBanco {
    private static int idContador = 0;
    private int id;
    private String nombre;
    private double balance;

    public CuentaBanco(String nombre, double balance) {
        idContador++;
        this.id = idContador;
        this.nombre = nombre;
        this.balance = balance;
    }


    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double prestamo(double prestamoX){
        return balance + prestamoX;
    }
    public double debito(double debitado){
        if(balance < debitado){
            System.out.println("Balance insuficiente para esta extraccion");
        }else {
            balance = balance - debitado;
        }
        return balance;
    }


    public String caracteristicas() {
        return "CuentaBanco{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", balance=" + balance +
                '}';
    }



}
