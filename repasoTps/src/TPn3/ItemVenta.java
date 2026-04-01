package TPn3;

public class ItemVenta {
    private static int idContador = 0;
    private int id;
    private String descripcion;
    private int cantidad;
    private double precioUnitario;

    public ItemVenta(String descripcion, int cantidad, double precioUnitario) {
        idContador++;
        this.id =idContador;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
    }

    public int getId() {
        return id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public double calcularPrecioTotal(){
        return precioUnitario * cantidad;
    }

    public String caracteristicas() {
        return "ItemVenta{" +
                "id=" + id +
                ", descripcion='" + descripcion + '\'' +
                ", cantidad=" + cantidad +
                ", precioUnitario=" + precioUnitario +
                '}';
    }
}
