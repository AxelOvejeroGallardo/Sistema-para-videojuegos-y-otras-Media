package TPn5.n3;

public class Cilindro extends Circulo{
    private double altura;

    public Cilindro() {
        super();
        this.altura = 1.0;
    }

    public Cilindro(double radio, String color, double altura){
        super(radio,color);
        this.altura = altura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double area(){
        return Math.PI * (Math.pow(getRadio(),2));
    }

    @Override
    public double calcularArea() {
        return Math.PI * (Math.pow(getRadio(),2));
    }

   /* public double volumen(){
        return area() * altura;
    }*/

    public double volumen(){
        return calcularArea() * altura;
    }

    public String detalleCilindro() {
        return "Cilindro : subclase: " + detalleCiruclo() +
                "altura=" + altura +
                '}';
    }


}
