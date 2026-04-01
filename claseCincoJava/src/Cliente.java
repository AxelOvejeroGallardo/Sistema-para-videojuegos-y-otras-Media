import javax.sound.midi.Soundbank;
import java.util.UUID;

public class Cliente {
    private UUID id;
    private String nombre;
    private String email;
    private double descuento;

    public Cliente(UUID id, String nombre, String email, double descuento) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
        this.descuento = descuento;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
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
        email = email;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public void verCliente()
    {
        System.out.println("Cliente[id= " + id + " nombre= " + nombre + " email= " + email + " descuento= " + descuento +"%");
    }
}
