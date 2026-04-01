public class Circulo {
    private double radio;
    private String color;


    public Circulo(){
        this.radio = 1.0;
        this.color = "rojo";
    }
    public Circulo(double radio, String color) {
        this.radio = radio;
        this.color = color;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double area(){
        return Math.PI*Math.pow(radio,2);
    }

    public String verCirculo(){
        return ("Círculo -> Radio: " + radio + ", Color: " + color + ", Área: " + area());
    }
}
