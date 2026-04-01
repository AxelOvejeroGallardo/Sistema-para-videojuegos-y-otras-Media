package TPn11.Adicionales;

import java.lang.reflect.Array;

public class Excepciones {

    public void ADivideB (int a, int b){
        try {
            if(b == 0){
                System.out.println("No se puede dividir un numero por 0");
            }else {
                System.out.println(a + " dividido " + b + (a/b));
            }
        }catch(ArithmeticException exception){
            System.out.println(exception.getMessage());
        }
    }
    public int difCadenaNum(String cadena){
        try{
            Integer.parseInt(cadena);
            return 0;
        }catch(NumberFormatException a){
            return cadena.length();
        }
    }

    private static int[] array = new int[4];
    private static int i = 0;
    public static void llenarArray(int num){

        try {
            if (i < array.length) {
                array[i] = num;
                System.out.println("Número añadido en posición " + i + ": " + num);
                i++;
            } else {
                System.out.println("Array lleno");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: intentaste acceder fuera del array.");
            e.printStackTrace();
        }
    }

    

}
