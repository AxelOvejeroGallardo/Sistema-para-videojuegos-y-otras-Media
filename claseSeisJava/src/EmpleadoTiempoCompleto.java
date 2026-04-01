public abstract class EmpleadoTiempoCompleto extends Empleado{
    private int aniosAntiguedad;
    private double sueldoBasico = 1000;


    public EmpleadoTiempoCompleto(String nombre, int aniosAntiguedad) {
        super(nombre);
        this.aniosAntiguedad = aniosAntiguedad;
    }

    public int getAniosAntiguedad() {
        return aniosAntiguedad;
    }

    public void setAniosAntiguedad(int aniosAntiguedad) {
        this.aniosAntiguedad = aniosAntiguedad;
    }

    public double getSueldoBasico() {
        return sueldoBasico;
    }

    public void setSueldoBasico(double sueldoBasico) {
        this.sueldoBasico = sueldoBasico;
    }

    @Override
    public double calcularPago() {
        double sueldoCalulado = sueldoBasico;
        if(aniosAntiguedad <= 2){
            sueldoCalulado = sueldoBasico;
        }else if(aniosAntiguedad > 2 && aniosAntiguedad <= 5){
            sueldoCalulado += sueldoBasico * 0.05;
        } else if(aniosAntiguedad >= 6 && aniosAntiguedad <= 10) {
            sueldoCalulado += sueldoBasico * 0.1;
        }else if(aniosAntiguedad >= 11 && aniosAntiguedad <= 15){
            sueldoCalulado += sueldoBasico * 0.15;
        } else if(aniosAntiguedad > 15) {
            sueldoCalulado += sueldoBasico * 0.2;
        }
        return sueldoCalulado;
    }
}
