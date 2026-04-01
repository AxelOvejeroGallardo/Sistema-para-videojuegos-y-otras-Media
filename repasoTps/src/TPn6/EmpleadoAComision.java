package TPn6;

public class EmpleadoAComision extends Empleado {
    private int cantidadClientes;
    private TipoCliente tipoCliente;
    public EmpleadoAComision(String nombre, int cantidadClientes,TipoCliente tipoCliente) {
        super(nombre);
        this.cantidadClientes = cantidadClientes;
        this.tipoCliente = tipoCliente;
    }

    @Override
    public double calcularPago() {
        double sueldo = 0;

        if(tipoCliente == TipoCliente.NUEVO){
            sueldo = cantidadClientes * TipoCliente.NUEVO.getComision();
        }else if(tipoCliente == TipoCliente.REGULAR){
            sueldo = cantidadClientes * TipoCliente.REGULAR.getComision();
        }else if(tipoCliente == TipoCliente.VIP){
            sueldo = cantidadClientes * TipoCliente.VIP.getComision();
        }
        if(sueldo<800000){
            sueldo = 800000;
        }
        return sueldo;
    }
}
