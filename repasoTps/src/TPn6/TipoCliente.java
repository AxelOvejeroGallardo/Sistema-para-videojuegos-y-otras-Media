package TPn6;

public enum TipoCliente {
    NUEVO(10000),
    REGULAR(20000),
    VIP(50000);

    private final double comision;

    TipoCliente(double comision){
        this.comision = comision;
    }
    public double getComision() {
        return comision;
    }
}
