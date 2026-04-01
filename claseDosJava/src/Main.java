import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Scanner sk = new Scanner(System.in);

        /*///Realizar un programa Java que declare una variable entera N y se le asigne un valor elegido por el usuario.
        // A continuación escribe las instrucciones para que el programa realice lo siguiente: incrementar N en 77,
        // reducir su valor a 3, duplicar su valor. Mostrar por pantalla los tres valores.
        int N;

        System.out.println("Ingrese un valor para N: ");
        N = sk.nextInt();

        System.out.println("N: " + N);

        N = N + 77;
        System.out.println("N + 77:" + N);
        N = N - 3;
        System.out.println("N - 3:" + N);
        N = N * 2;
        System.out.println("N * 2:" + N);

        ///Realizar un programa Java que declare una variable A de tipo entero, y le asigne un valor elegido por el usuario.
        //A continuación mostrar un mensaje indicando si A es par o impar.

        System.out.println("Ingrese un numero:");
        int numA = sk.nextInt();

        //nuevo
        String resultado = (numA % 2 == 0) ? "Par" : "Impar";
        System.out.println(resultado);

        //clasico
       *//* if(numA % 2 == 0){
            System.out.println("Par");
        }else{
            System.out.println("Impar");
        }


        ///Realizar un programa Java que declare una variable B de tipo entero y asignarle un valor elegido por el usuario.
        // A continuación mostrar un mensaje indicando si el valor de B es positivo o negativo.

        System.out.println("Ingrese un numero:");
        int numB = sk.nextInt();

        //nuevo
        String positividad = (numB > 0) ? "Positivo" : "Negativo";
        System.out.println(positividad);


        ///Realizar un programa Java que encuentre el valor ASCII de un carácter. Para ello, vamos a pedir un String al
        // usuario y leer solo el primer carácter, esto lo lograremos con: char caracter = scanner.next().charAt(0);

        System.out.println("Ingrese una palabra: ");
        char caracter = sk.next().charAt(2);
        System.out.println((int)caracter);


        ///Realizar un programa Java que declare una variable C de tipo entero y le asigne un valor elegido por el usuario.
        // A continuación mostrar un mensaje indicando si el valor de C es positivo o negativo, si es par o impar, si es
        // múltiplo de 5, si es múltiplo de 10 y si es mayor o menor que 100.

        System.out.println("Ingrese un numero:");
        int c  = sk.nextInt();
        String cP = (c > 0 ) ? "positivo" : "negativo";
        String cI = (c % 2 == 0) ? "par" : "impar";
        String mC = (c % 5 == 0) ? "multiplo de 5" : "no multiplo de 5";
        String mD = (c % 10 == 0) ? "multiplo de 10" : "no multiplo de 10";
        String nM = (c > 100) ? "mayor que 100" : "menor que 100";

        System.out.println(c);
        System.out.println(cP);
        System.out.println(cI);
        System.out.println(mC);
        System.out.println(mD);
        System.out.println(nM);


        ///Realizar un programa Java que lea un nombre y muestre por pantalla: “Buenos días, {NOMBRE}”.

        System.out.println("Ingresa tu nombre: ");
        String nombre = sk.nextLine();
        System.out.println("Buenos dias, " + nombre);


        ///Realizar un programa que pase una velocidad en Km/h a m/s. La velocidad se lee por teclado. Cálculo: velocidadMS = velocidadKm * 1000 / 3600;
        System.out.println("Ingrese Km/h:");
        int kmHrs = sk.nextInt();

        kmHrs = kmHrs * 1000/3600;

        System.out.println("M/S: " + kmHrs);

        ///Realizar un programa que lea por teclado un número de 3 cifras y muestra sus cifras por separado.
        System.out.println("Ingrese un numero de 3 cifras:");
        int numTresCifras = sk.nextInt();
        System.out.println(numTresCifras / 1000);
        System.out.println(numTresCifras / 100);
        System.out.println(numTresCifras / 10);
        System.out.println(numTresCifras / 1);

        ///Realizar un programa que lea por teclado un número entero N de 5 cifras y muestre las cifras que ocupan posiciones impares.
        System.out.println("Ingrese un numero de 5 cifras: ");
        int numCincoCifras = sk.nextInt();
        System.out.println(numCincoCifras/10000);
        System.out.println(numCincoCifras/1000);
        System.out.println(numCincoCifras/100);
        System.out.println(numCincoCifras/10);
        System.out.println(numCincoCifras/1);


        ///Realizar un programa que lea por teclado tres números enteros H, M, S que contengan hora, minutos y segundos respectivamente,
        //y compruebe si la hora que indican es una hora válida.
        System.out.println("Ingrese una Hora: ");
        int h = sk.nextInt();
        System.out.println("Ingrese los Minutos de esa hora: ");
        int m = sk.nextInt();
        System.out.println("Ingrese los Segundos de esos minutos: ");
        int s = sk.nextInt();

        if((h < 23) && (h > -1) && ((m> -1) && (m < 59)) && ((s > -1) && (s < 59))) {
            System.out.println("Hora Valida.");
            System.out.println(h + ":" + m + ":" + s);
        }else{
            System.out.println("Hora invalida");
        }


        ///Realizar un programa Java que pida por teclado el nombre, edad y salario de una persona, y muestra el salario dependiendo de:
        //Si es menor de 16 no tiene edad para trabajar
        //Entre 19 y 50 años el salario es un 5 por ciento más
        //Entre 51 y 60 años el salario es un 10 por ciento más
        //Si es mayor de 60 el salario es un 15 por ciento más

        System.out.println("Ingrese el nombre de la persona:");
        String nombre = sk.nextLine();
        System.out.println("Ingrese la edad de la persona:");
        int edad = sk.nextInt();
        System.out.println("Ingrese el salario de la persona:");
        double salario = sk.nextDouble();
        double salarioBackUp = salario;
        double porcientoSalario = salario * 0.05;


        if(edad < 16 ){
            System.out.println("No tiene edad para trabajar.");
        } else if (edad >=19 && edad <= 50) {
            salario = salarioBackUp + porcientoSalario;
            System.out.println(salario);
        } else if (edad >= 51 && edad <= 60){
            salario = salarioBackUp + (porcientoSalario *2);
            System.out.println(salario);
        } else if (edad >= 60) {
            salario = salarioBackUp + (porcientoSalario * 3);
            System.out.println(salario);
        }

        ///Realizar un programa Java que calcule el promedio de un arreglo de números enteros. Realizar variantes con arreglos ya inicializados e ingreso por teclado.

        int dim = 3;
        int array [] = new int[dim];
        int i;

        double promedio = 0;

        for (i =0; i < dim; i++) {
            array[i] = i;
            System.out.println(array[i]);
            promedio = promedio + i;
            System.out.println(promedio);
        }

        double promedioA = promedio / i;
        System.out.println(promedioA);
        */
    }
}