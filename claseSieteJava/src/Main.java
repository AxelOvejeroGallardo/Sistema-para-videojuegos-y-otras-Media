import nDos.Animales;
import nDos.Murcielago;
import nDos.Pato;
import nDos.Pez;
import nTres.*;
import nUno.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        /*
        Autobus autobusA = new Autobus(523,35, TipoTransporte.AUTOBUS);
        Tranvia tranviaA = new Tranvia("N11",90,TipoTransporte.TRANVIA);
        Bicicleta bicicletaA = new Bicicleta("XXX-XXX1",TipoTransporte.BICICLETA);

        System.out.println(autobusA.arrancar());
        System.out.println(autobusA.detener());
        System.out.println(autobusA.obtenerCapacidad());
        System.out.println("\n");
        System.out.println(tranviaA.arrancar());
        System.out.println(tranviaA.detener());
        System.out.println(tranviaA.obtenerCapacidad());
        System.out.println("\n");
        System.out.println(bicicletaA.arrancar());
        System.out.println(bicicletaA.detener());
        System.out.println(bicicletaA.obtenerCapacidad());
        */


        /*HACER UN LINK, ARRAYLIST QEUE O ALGO DE LO NUEVO CON ESTO DE LOS ANIMALES
        Pato patoA = new Pato("Lucas","Negro");
        System.out.println(patoA.toString());
        System.out.println(patoA.comer());
        System.out.println(patoA.dormir());
        System.out.println(patoA.nadar());
        System.out.println(patoA.caminar());
        System.out.println(patoA.volar());
        System.out.println(patoA.feliz());
        System.out.println(patoA.peligro());
        System.out.println(patoA.neutral());
        System.out.println("\n");
        Murcielago murcielagoA = new Murcielago("Blad","Negro");
        System.out.println(murcielagoA.toString());
        System.out.println(murcielagoA.comer());
        System.out.println(murcielagoA.dormir());
        System.out.println(murcielagoA.volar());
        System.out.println(murcielagoA.colgarse());
        System.out.println(murcielagoA.feliz());
        System.out.println(murcielagoA.peligro());
        System.out.println(murcielagoA.neutral());
        System.out.println("\n");
        Pez pezA = new Pez("Flounder","Chico");
        System.out.println(pezA.toString());
        System.out.println(pezA.comer());
        System.out.println(pezA.dormir());
        System.out.println(pezA.nadar());
        System.out.println(pezA.feliz());
        System.out.println(pezA.peligro());
        System.out.println(pezA.neutral());
        */

        ///
        ArrayList<Vehiculo> arrayVehiculos = new ArrayList<>();
        Auto autoA = new Auto("Ford","Mustang",500,2);
        Camion camionA = new Camion("Mercedes", "xx1",370,200);
        Bici biciA = new Bici("TrakTreck", "BMX", 30,13);
        Colectivo colectivoA = new Colectivo("Metalpar","Viejo",200,35,100);

        arrayVehiculos.add(autoA);
        arrayVehiculos.add(camionA);
        arrayVehiculos.add(biciA);
        arrayVehiculos.add(colectivoA);

        for(Vehiculo i : arrayVehiculos){
            System.out.println(i.toString());
            System.out.println(i.getMarca());
            System.out.println(i.getModelo());
            System.out.println(i.getVelocidadMaxima());
            System.out.println("\n");
        }



    }
}