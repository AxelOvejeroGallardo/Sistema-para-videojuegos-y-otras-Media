package nUno;

import java.util.LinkedList;

public class Tienda {
    LinkedList<Libro> libro = new LinkedList<>();

    public Tienda() {
        this.libro = new LinkedList<>();
    }

    public String agregarLibroNuevo(Libro libroNuevo){
        String mensaje = "";
        if(libroNuevo != null){
            libro.add(libroNuevo);
            mensaje = "Se agrego el libro";
        }else{
            mensaje = "No se pudo agregar el libro";
        }
        return mensaje;
    }

    public String eliminarLibro (Libro libroEliminar){
        String mensaje = "";
        if(libroEliminar != null){
            libro.remove(libroEliminar);
            mensaje = "Libro eliminado exitosamente";
        }else{
            mensaje = "No se pudo eliminar el libro";
        }
        return mensaje;
    }

    public String mostrandoLibros (){
        String mensaje = "";
        for(Libro librito : libro)
        {
            mensaje += librito.toString() + "\n";
        }
        return mensaje;
    }

    public int posicionLibro(String titulo)
    {
        Libro libroAux = new Libro();
        libroAux.setTitulo(titulo);
        int pos = libro.indexOf(libroAux);
        return pos;
    }

    public Libro buscarXTitulo(String  titulo){
        int pos = posicionLibro(titulo);
        return libro.get(pos);
    }

    public void actualizarPrecioLibro(String titulo, double precioNuevo){
        int pos = posicionLibro(titulo);
        Libro libroAux = new Libro();

        libroAux = libro.get(pos);

        libroAux.setPrecio(precioNuevo);

        libro.set(pos,libroAux);
    }

    public double precioTotalLibros(){
        double sum = 0;
        for(Libro libroX : libro){
            sum += libroX.getPrecio();
        }
        return  sum;
    }

    public int numTotalLibros(){
        return libro.size();
    }

    public Libro libroMasCaro(){
        Libro libroAux = new Libro();
        libroAux = libro.get(0);
        for(Libro libroX : libro){
            if(libroX.getPrecio() > libroAux.getPrecio())
            {
                libroAux = libroX;
            }
        }
        return libroAux;
    }

    public Libro libroMasBarato(){
        Libro libroAux = new Libro();
        libroAux = libro.get(0);
        for(Libro libroX : libro){
            if(libroX.getPrecio() < libroAux.getPrecio()){
                libroAux = libroX;
            }
        }
        return libroAux;
    }
}
