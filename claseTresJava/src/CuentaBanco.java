public class CuentaBanco {
    private int id;
    public String nombre;
    private double balance;

    public CuentaBanco(int id, String nombre, double balance) {
        this.id = id;
        this.nombre = nombre;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public double depositarDinero(double dinero) {

        balance += dinero;

        return  balance;
    }

    public double extraccionDinero(double extraccion){

        if (extraccion < balance){
            balance = balance - extraccion;
        }else{
            System.out.println("balance insuficiente...");
        }

        return balance;

    }

    public void viendoCuentaBanco(){
        System.out.println("Titular Cuenta: " + nombre);
        System.out.println("ID titular: " + id);
        System.out.println("Saldo Cuenta titular: " + balance);
    }




}
