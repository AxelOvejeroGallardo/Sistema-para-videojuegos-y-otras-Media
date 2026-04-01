package TPn6;

public class EmpleadoTiempoCompleto extends Empleado{
    private int antiguedad;
    private double sueldoBasico;

    public EmpleadoTiempoCompleto(String nombre, int antiguedad, double sueldoBasico) {
        super(nombre);
        this.antiguedad = antiguedad;
        this.sueldoBasico = sueldoBasico;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    public double getSueldoBasico() {
        return sueldoBasico;
    }

    public void setSueldoBasico(double sueldoBasico) {
        this.sueldoBasico = sueldoBasico;
    }

    @Override
    public double calcularPago() {
        double sueldoActualizado = 0;
        if(antiguedad < 2){
            return sueldoBasico;
        }else if(antiguedad >= 2 && antiguedad <=5){
            double plusCincoPorciento = sueldoBasico * 0.05;
            sueldoActualizado = sueldoBasico + plusCincoPorciento;
        }else if(antiguedad >= 6 && antiguedad <= 10){
            double plusDiezPorciento = sueldoBasico * 0.1;
            sueldoActualizado = sueldoBasico + plusDiezPorciento;
        }else if(antiguedad >=11 && antiguedad <= 15){
            double plusQuincePorciento = sueldoBasico * 0.15;
            sueldoActualizado = sueldoBasico + plusQuincePorciento;
        }else if(antiguedad > 15){
            double plusVeintePorciento = sueldoBasico * 0.2;
            sueldoActualizado = sueldoBasico + plusVeintePorciento;
        }
        return sueldoActualizado;
    }


}
