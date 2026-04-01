package TPn8.n2;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.stream.Collectors;

public class ListBasica implements iReproduccion{

    private String nombre;
    private Queue<Cancion> miLista;

    public ListBasica(String nombre) {
        this.nombre = nombre;
        this.miLista = new LinkedList<>();
    }


    @Override
    public String reproducir(int pos) {
        if (pos < 0 || pos >= miLista.size()) {
            return "Error: Posición " + pos + " fuera del rango (0 a " + (miLista.size() - 1) + ") de la lista.";
        }
        // Convertimos a ArrayList para acceder por índice (temporalmente, ya que Queue no lo soporta eficientemente)
        return "Reproduciendo: " + ((LinkedList<Cancion>) miLista).get(pos).toString();
    }

    @Override
    public void aniadirCancion(Cancion cancion) {
        if(cancion != null){
            miLista.offer(cancion);
            System.out.println("cancion " + cancion.toString() + " aniadida correctamente a la lista " + this.nombre);
        }
    }

    @Override
    public boolean eliminarCancion() {
        System.out.println("Para acceder a estas opciones, compre el paquete PREMIUM");
        return false;
    }

    @Override
    public String verMiLista() {
        if (miLista.isEmpty()) {
            return "Lista: " + this.nombre + " - (Vacía)";
        }

        // Cola auxiliar para guardar las canciones temporalmente
        Queue<Cancion> auxiliar = new LinkedList<>();
        StringBuilder sb = new StringBuilder();
        int sizeOriginal = miLista.size();

        // 1. Recorrer y Mover (Vacía miLista y llena auxiliar)
        while (!miLista.isEmpty()) {
            Cancion cancion = miLista.poll(); // Saca el elemento de miLista
            sb.append("\n\t-> ").append(cancion.toString()); // Lo añade al resultado (visualización)
            auxiliar.offer(cancion); // Lo añade al final de la cola auxiliar
        }

        // 2. Restaurar (Vacía auxiliar y llena miLista de nuevo)
        while (!auxiliar.isEmpty()) {
            miLista.offer(auxiliar.poll()); // Devuelve el elemento a miLista
        }
        return "🎶 Lista de Reproducción: " + this.nombre + " (Total: " + sizeOriginal + ")" + sb.toString();
    }
}
