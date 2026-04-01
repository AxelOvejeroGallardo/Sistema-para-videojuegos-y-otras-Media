package TPn13;

import org.json.JSONArray;
import org.json.JSONObject;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private String nombreBiblioteca;
    private List<Libro> libros;

    public Biblioteca() {
    }

    public Biblioteca(String nombreBiblioteca) {
        this.nombreBiblioteca = nombreBiblioteca;
        this.libros = new ArrayList<>();
    }

    // Agregar y eliminar libros
    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }

    public void eliminarLibro(Libro libro) {
        libros.remove(libro);
    }

    // Convertir toda la biblioteca a JSON
    public JSONObject toJSON() {
        JSONObject json = new JSONObject();
        json.put("nombreBiblioteca", nombreBiblioteca);

        JSONArray arrayLibros = new JSONArray();
        for (Libro libro : libros) {
            arrayLibros.put(libro.toJSON());
        }
        json.put("libros", arrayLibros);
        return json;
    }

    // Guardar la biblioteca en un archivo JSON
    public void guardarEnArchivo(String nombreArchivo) {
        try (FileWriter file = new FileWriter(nombreArchivo)) {
            file.write(toJSON().toString(4)); // 4 → formato legible
            System.out.println("Biblioteca guardada en " + nombreArchivo);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Leer desde un archivo JSON
    public static Biblioteca leerDesdeArchivo(String nombreArchivo) {
        try (FileReader reader = new FileReader(nombreArchivo)) {
            char[] buffer = new char[1024];
            int length = reader.read(buffer);
            String data = new String(buffer, 0, length);

            JSONObject json = new JSONObject(data);
            Biblioteca biblio = new Biblioteca(json.getString("nombreBiblioteca"));

            JSONArray arrayLibros = json.getJSONArray("libros");
            for (int i = 0; i < arrayLibros.length(); i++) {
                JSONObject libroJSON = arrayLibros.getJSONObject(i);
                biblio.agregarLibro(new Libro(libroJSON));
            }

            return biblio;

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public void mostrarLibros() {
        System.out.println("📚 Biblioteca: " + nombreBiblioteca);
        for (Libro libro : libros) {
            System.out.println("- " + libro);
        }
    }
}

