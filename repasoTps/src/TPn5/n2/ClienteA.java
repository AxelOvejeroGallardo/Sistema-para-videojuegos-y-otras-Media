package TPn5.n2;

import java.util.UUID;

public class ClienteA {
    private UUID idCliente;
    private String nombre;
    private String email;
    private double descuento;

    public ClienteA(String nombre, String email, double descuento) {
        this.idCliente = UUID.randomUUID();
        this.nombre = nombre;
        this.email = email;
        this.descuento = descuento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public String detalleCliente(){
        return "ClienteA{" +
                "idCliente=" + idCliente +
                ", nombre='" + nombre + '\'' +
                ", email='" + email + '\'' +
                ", descuento=" + descuento +
                '}';
    }
}
