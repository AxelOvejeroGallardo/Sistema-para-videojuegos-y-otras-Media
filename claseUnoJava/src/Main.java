import java.sql.SQLOutput;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ///1.Realizar un programa Java que realice lo siguiente: declarar una variable numN de tipo int, una variable numA
        ///de tipo double y una variable numC de tipo char y asigna a cada una un valor. A continuación muestra por pantalla:
        ///El valor de cada variable, la suma de numN + numA, la diferencia de numA numN, el valor numérico correspondiente al carácter que contiene la variable numC.
        Scanner teclado;

        int numN = 1;
        double numA = 2.5;
        char numC = '3';

        double suma = numN + numA;

        System.out.println("Suma numN + numA: " + suma);
        System.out.println("numC: " + numC);

        ///2.Realizar un programa Java que realice lo siguiente: declarar dos variables numX y numY de tipo int, dos variables
        ///numN y numM de tipo double y asigna a cada una un valor. A continuación mostrar por pantalla una serie de operaciones entre ellas.

        int numX = 10;
        int numY = 11;
        double numNN = 22.5;
        double numM = 33.5;

        int sumaA = numX + numY;

        int multiplicacion = numX * numY;

        double resta = numNN - numM;


        System.out.println("numX:" + numX);
        System.out.println("numY:" + numY);
        System.out.println("numNN:" + numNN);
        System.out.println("numM:" + numM);
        System.out.println("suma numX + numY: " + sumaA);
        System.out.println("multiplicacion numX * numY :" + multiplicacion);
        System.out.println("resta numNN - numM: " + resta);


        ///3.Realizar un programa Java que declare cuatro variables enteras A, B, C y D y se le asigne un valor a cada una. A continuación realiza
        ///las instrucciones necesarias para que: B tome el valor de C, C tome el valor de A, A tome el valor de D, D tome el valor de B.

        int a,b,c,d;
        a = 1;
        b = 2;
        c = 3;
        d = 4;

        System.out.println("a: " + a);
        System.out.println("b: " + b);
        System.out.println("c: " + c);
        System.out.println("d: " + d);

        int aux = b;

        b = c;
        c = a;
        a = d;
        d = aux;
        System.out.println("..........................................");
        System.out.println("a: " + a);
        System.out.println("b: " + b);
        System.out.println("c: " + c);
        System.out.println("d: " + d);

    }
}