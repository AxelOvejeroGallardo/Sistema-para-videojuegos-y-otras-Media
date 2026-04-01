public class ItemVenta {
    private int id;
    private String descripcion;
    private int cantidad;
    private double precioUnidtario;

    public ItemVenta(int id, String descripcion, int cantidad, double precioUnidtario) {
        this.id = id;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.precioUnidtario = precioUnidtario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public double getPrecioUnidtario() {
        return precioUnidtario;
    }

    public void setPrecioUnidtario(double precioUnidtario) {
        this.precioUnidtario = precioUnidtario;
    }

    public double calcularPrecioTotal (){
        double total = cantidad * precioUnidtario;

        return  total;
    }

    public String verItem(){
        String mensajeItem = "ItemVenta:" + "[id]=" + id + "[descripcion]=" + descripcion + "[cantidad]=" + cantidad + "[PrecioUnidad]=" + precioUnidtario + "[Precio Total]=" + calcularPrecioTotal();

        return  mensajeItem;
    }

}