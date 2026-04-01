package TPn8.n1;

import TPn8.n1.Libro;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class TiendaLibros {
    private ArrayList<Libro> inventario = new ArrayList<>();



    public void agregarLibro(Libro newLibro){
        inventario.add(newLibro);
    }

    public boolean eliminarLibro(String nombreLibro){
        Libro lA  = new Libro(nombreLibro);

        return inventario.remove(lA);
    }

    public String mostrarInventario()
    {
        return inventario.toString();
    }

    public boolean buscarLibro(String nombreLibro){

        Libro lB = new Libro(nombreLibro);

        //return inventario.contains(lB);

        for (Libro l: inventario) {
            if (lB.equals(l)) {
                return true;
            }
        }
        return false;
    }

    public String actualizarPrecioLibro(String nombreLibro,double precioNuevo){
        int largo = inventario.size();
        int pos = 0;
        for(int i = 0; i > largo; i++){
            if(nombreLibro == inventario.get(i).getTitulo()){
                inventario.get(i).setPrecio(precioNuevo);
                pos = i;
            }
        }
        return "El precio nuevo del libro " + inventario.get(pos) + " ahora es: " + precioNuevo;
    }

    public double precioTotalInventario(){
        double precioTotalLibros = 0;
        for(int i = 0; i < inventario.size();i++){
            precioTotalLibros = precioTotalLibros + inventario.get(i).getPrecio();
        }
        return precioTotalLibros;
    }
    public int contandoLibros(){
        return inventario.size();
    }

    public void mostrarUnLibro(int pos){
        inventario.get(pos).toString();
    }

    public Libro libroMasCaro(){



        /*int pos = 0;
        double precio = 0;
            for (int i = 0; i < inventario.size();i++){
                if(inventario.get(i).getPrecio() > precio){
                    precio = inventario.get(i).getPrecio();
                    pos = i;
                }
            }
            mostrarUnLibro(pos);
        return pos;*/

        return Collections.max(inventario);
    }

    public Libro libroMasBarato(){
        /*int pos = 0;
        double precio = inventario.get(pos).getPrecio();
        for(int i = 0; i < inventario.size();i++){

            if(inventario.get(i).getPrecio() < precio){
                precio = inventario.get(i).getPrecio();
                pos = i;
            }
        }
        mostrarUnLibro(pos);
        return pos;*/
        return Collections.min(inventario);
    }
}
