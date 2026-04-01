import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ////avion xx
        ////avion dd
        ////
        ////
        ////
        Scanner sc = new Scanner(System.in);

        System.out.println("Seleccione una provincia de destino:");
        int i = 1;
        for (Provincias p : Provincias.values()) {
            System.out.println(i + ". " + p);
            i++;
        }

        System.out.print("Ingrese el número correspondiente: ");
        int opcion = sc.nextInt();

        // Obtener la provincia elegida
        Provincias seleccionada = Provincias.values()[opcion - 1];

        System.out.println("Has seleccionado: " + seleccionada);

        Avion a1 = new Avion(5,7,14,15,true);

        Vuelo v1 = new Vuelo(Provincias.values()[5-1],Provincias.values()[6-1],ClaseVuelo.values()[2-1],a1,Aerolineas.values()[3-1]);



        System.out.println(v1.toString());
    }
}