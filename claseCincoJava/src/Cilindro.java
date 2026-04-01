public class Cilindro extends Circulo{
    private double altura;
    public Cilindro() {
        super(); // Llama al constructor de Circulo
        this.altura = 1.0;
    }
    // Constructor con parámetros
    public Cilindro(double radio, String color, double altura) {
        super(radio, color); // Llama al constructor de Círculo
        this.altura = altura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    // 🔹 Sobreescribir el método area() -> área total de cilindro
    @Override
    public double area() {
        return (2 * Math.PI * getRadio() * altura) + (2 * super.area());
    }

    // 🔹 Calcular volumen usando el área de la BASE (super.area)
    public double getVolumen() {
        return super.area() * altura;
    }

    // 🔹 Sobreescribir imprimir info
    public void verCilindro() {
        super.verCirculo();
        System.out.println("Cilindro: subclase de " + super.verCirculo() + ", Altura: " + altura);
        System.out.println("Área Total: " + area() + ", Volumen: " + getVolumen());
    }
}
