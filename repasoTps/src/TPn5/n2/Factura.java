package TPn5.n2;
import java.util.UUID;
import java.time.LocalDateTime;

public class Factura{
    private UUID idFactura;
    private double montoTotal;
    private LocalDateTime fecha;
    private ClienteA cliente;

    public Factura(double montoTotal,ClienteA cliente) {
        this.idFactura = UUID.randomUUID();
        this.montoTotal = montoTotal;
        this.fecha = LocalDateTime.now();
        this.cliente = cliente;
    }

    public double getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(double montoTotal) {
        this.montoTotal = montoTotal;
    }

    public ClienteA getCliente() {
        return cliente;
    }

    public void setCliente(ClienteA cliente) {
        this.cliente = cliente;
    }

    public void montoFinalConDescuento(){
        double porcentaje = montoTotal * (cliente.getDescuento() / 100);
        montoTotal = montoTotal - porcentaje;
    }

    public String detalleFctura() {
        return "Factura{" +
                "idFactura=" + idFactura +
                ", montoTotal=" + montoTotal +
                ", fecha=" + fecha +
                ", cliente=" + cliente +
                '}';
    }
}
