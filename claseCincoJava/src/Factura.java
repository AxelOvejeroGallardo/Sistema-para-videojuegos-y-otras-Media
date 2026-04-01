import java.time.LocalDateTime;
import java.util.UUID;

public class Factura {
    private UUID idFactura;
    private double montoTotal;
    private LocalDateTime fecha;
    private Cliente cliente;

    public Factura(UUID idFactura, double montoTotal, LocalDateTime fecha, Cliente cliente) {
        this.idFactura = idFactura;
        this.montoTotal = montoTotal;
        this.fecha = fecha;
        this.cliente = cliente;
    }

    public UUID getIdFactura() {
        return idFactura;
    }

    public void setIdFactura(UUID idFactura) {
        this.idFactura = idFactura;
    }

    public double getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(double montoTotal) {
        this.montoTotal = montoTotal;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void verFactura(){
        System.out.println("Factura[id=" + idFactura + " fecha= " + fecha + " monto= " + " montoDesc= " + " Cliente[id= " + cliente.getId() + " nombre= " + cliente.getNombre() + " email= " + cliente.getEmail() + " descuento= " + cliente.getDescuento());
    }
}
