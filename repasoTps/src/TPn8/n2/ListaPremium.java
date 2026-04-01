package TPn8.n2;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListaPremium implements iReproduccion {
    private String nombre;
    private LinkedList<Cancion> miLista;

    public ListaPremium(String nombre) {
        this.nombre = nombre;
        this.miLista = new LinkedList<>();
    }

    @Override
    public String reproducir(int pos) {
        if (miLista.isEmpty()) {
            return "No se puede reproducir: La lista está vacía.";
        }

        System.out.println("\n--- Lista de Reproducción: " + this.nombre + " ---");

        // Muestra la lista numerada
        for (int i = 0; i < miLista.size(); i++) {
            System.out.println("[" + i + "] " + miLista.get(i).toString());
        }
        System.out.println("------------------------------------");

        Scanner scanner = new Scanner(System.in);
        int eleccion = -1;
        boolean entradaValida = false;

        while (!entradaValida) {
            System.out.print("Elige el número de la canción a reproducir (0 a " + (miLista.size() - 1) + "): ");
            if (scanner.hasNextInt()) {
                eleccion = scanner.nextInt();
                if (eleccion >= 0 && eleccion < miLista.size()) {
                    entradaValida = true;
                } else {
                    System.out.println("❌ Número fuera de rango. Intenta de nuevo.");
                }
            } else {
                System.out.println("❌ Entrada inválida. Por favor, ingresa un número.");
                scanner.next(); // Limpia la entrada inválida
            }
        }

        // Cierra el scanner para evitar fugas de recursos (idealmente se gestiona fuera de este método)
        // scanner.close();

        return "▶️ REPRODUCIENDO: " + miLista.get(eleccion).toString();
    }

    @Override
    public void aniadirCancion(Cancion cancion) {
        if (cancion != null) {
            miLista.add(cancion); // El método 'add' de LinkedList añade al final
            System.out.println("Canción '" + cancion.toString() + "' añadida a la lista premium: " + this.nombre);
        }
    }

    @Override
    public boolean eliminarCancion() {
        if (!miLista.isEmpty()) {
            Cancion cancionEliminada = miLista.removeFirst(); // Elimina y devuelve el primer elemento
            System.out.println("Canción '" + cancionEliminada.toString() + "' eliminada del inicio de la lista: " + this.nombre);
            return true;
        } else {
            System.out.println("La lista premium está vacía. No se puede eliminar.");
            return false;
        }
    }

    @Override
    public String verMiLista() {
        if (miLista.isEmpty()) {
            return "Lista: " + this.nombre + " - (Vacía)";
        }

        // 1. Usar StringBuilder para construir la cadena de forma eficiente
        StringBuilder sb = new StringBuilder();

        // 2. Iterar sobre la lista usando el bucle for-each
        for (Cancion cancion : miLista) {
            sb.append("\n\t-> ").append(cancion.toString());
        }

        // 3. Devolver la cadena final
        return "Lista de Reproducción: " + this.nombre + " (Total: " + miLista.size() + ")" + sb.toString();
    }
}
