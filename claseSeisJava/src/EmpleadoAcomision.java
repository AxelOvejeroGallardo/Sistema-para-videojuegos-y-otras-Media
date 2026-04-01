public abstract class EmpleadoAcomision extends Empleado{
    private int clientesCaptados;
    private String tipoCliente;

    private static final double clienteCommon = 100.000;
    private static final double clienteEspecial = 250.000;
    private static final double clienteMvp = 300.000;
    private static final double minimo = 800.000;
    public EmpleadoAcomision(String nombre, int clientesCaptados,String tipoCliente) {
        super(nombre);
        this.clientesCaptados = clientesCaptados;
        this.tipoCliente = tipoCliente;
    }

    public int getClientesCaptados() {
        return clientesCaptados;
    }

    public void setClientesCaptados(int clientesCaptados) {
        this.clientesCaptados = clientesCaptados;
    }

    public String getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(String tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    @Override
    public double calcularPago() {
        double comisionPorCliente = 0;
        switch (tipoCliente.toLowerCase()) {
            case "premium":
                comisionPorCliente = clienteCommon;
                break;
            case "especial":
                comisionPorCliente = clienteEspecial;
            case "mvp":
                comisionPorCliente = clienteMvp;
            default:
                comisionPorCliente = minimo;
                break;
        }
        double pagoXClientes = comisionPorCliente * clientesCaptados;
        return pagoXClientes;
    }
}
