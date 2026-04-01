package TPn10.n1;

import java.util.Random;

public class Persona {
    final char sexoConstante = 'H';
    private String nombre = "";
    private int edad = 0;
    private String DNI;
    private char sexo = sexoConstante;
    private double peso = 0;
    private double altura = 0;

    public Persona() {
    }

    public Persona(String nombre, int edad, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
    }

    public Persona(String nombre, int edad, String DNI, char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.DNI = DNI;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDNI() {
        return DNI;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int calcularIMC(){

        if((peso/Math.pow(altura,2) < 20)){
            return -1;
        }else if((peso/Math.pow(altura,2)) >=20 || (peso/Math.pow(altura,2) <= 25)){
            return 0;
        }else {
            return 1;
        }
    }

    public boolean validandoEdad(){
        if(edad >= 18){
            return true;
        }else {
            return false;
        }
    }

    public void comprobandoSexo(char sexo){
        if(sexo == 'h' || sexo == 'H' || sexo == 'm' || sexo == 'M'){
            this.sexo = sexo;
        }else {
            this.sexo = 'H';
        }
    }

    @Override
    public String toString() {
        return "Persona{" +
                "sexoConstante=" + sexoConstante +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", DNI='" + DNI + '\'' +
                ", sexo=" + sexo +
                ", peso=" + peso +
                ", altura=" + altura +
                '}';
    }

    public int numRandom(){
        Random num = new Random();
        final int MIN = 10000000; // El número más pequeño de 8 cifras
        final int MAX = 99999999; // El número más grande de 8 cifras
        int i;
        return i = num.nextInt(MAX - MIN + 1) + MIN;
    }

    public String generarDni(){
        String Dni = String.valueOf(numRandom());
        return Dni + sexo;
    }


}
