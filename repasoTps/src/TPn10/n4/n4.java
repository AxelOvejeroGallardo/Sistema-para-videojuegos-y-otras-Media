package TPn10.n4;

import java.util.HashMap;
import java.util.Map;

public class n4 {
    public static void contarFrecuencias(String cadena) {
        // Usamos Map<Character, Integer> para almacenar:
        // Clave: El carácter
        // Valor: El número de veces que aparece
        Map<Character, Integer> mapaFrecuencias = new HashMap<>();

        // Convertimos la cadena a un array de caracteres para facilitar la iteración
        char[] caracteres = cadena.toCharArray();

        // Iteramos sobre cada carácter en el array
        for (char caracter : caracteres) {
            // Convertimos el carácter a minúscula (opcional, para contar 'A' y 'a' como iguales)
            char c = Character.toLowerCase(caracter);

            // Ignoramos los espacios en blanco para un recuento más limpio
            if (c == ' ') {
                continue;
            }

            // Lógica para contar:
            // 1. Si el carácter ya está en el mapa (containsKey), incrementamos su valor.
            if (mapaFrecuencias.containsKey(c)) {
                int contadorActual = mapaFrecuencias.get(c);
                mapaFrecuencias.put(c, contadorActual + 1);
            }
            // 2. Si es la primera vez que vemos el carácter, lo añadimos con un valor de 1.
            else {
                mapaFrecuencias.put(c, 1);
            }
        }
    }
}
