package TPn13;

import org.json.JSONObject;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

public class Empleado {
    private int id;
    private String nombre;
    private double salario;
    private String departamento;

    public Empleado(int id, String nombre, double salario, String departamento) {
        this.id = id;
        this.nombre = nombre;
        this.salario = salario;
        this.departamento = departamento;
    }

    // Constructor desde JSON con validaciones
    public Empleado(JSONObject json) {
        if (!json.has("id") || !json.has("nombre") || !json.has("salario") || !json.has("departamento")) {
            throw new IllegalArgumentException("Faltan campos obligatorios en el JSON");
        }

        this.id = json.getInt("id");
        this.nombre = json.getString("nombre");
        this.salario = json.getDouble("salario");
        this.departamento = json.getString("departamento");
    }

    public JSONObject toJSON() {
        JSONObject json = new JSONObject();
        json.put("id", id);
        json.put("nombre", nombre);
        json.put("salario", salario);
        json.put("departamento", departamento);
        return json;
    }

    public void guardarEnArchivo(String nombreArchivo) {
        try (FileWriter writer = new FileWriter(nombreArchivo)) {
            writer.write(toJSON().toString(4));
            System.out.println("Empleado guardado correctamente.");
        } catch (IOException e) {
            System.err.println("Error al guardar archivo: " + e.getMessage());
        }
    }

    public static Empleado leerDesdeArchivo(String nombreArchivo) {
        try (FileReader reader = new FileReader(nombreArchivo)) {
            char[] buffer = new char[1024];
            int length = reader.read(buffer);
            String data = new String(buffer, 0, length);
            JSONObject json = new JSONObject(data);
            return new Empleado(json);
        } catch (Exception e) {
            System.err.println("Error al leer archivo: " + e.getMessage());
            return null;
        }
    }

    @Override
    public String toString() {
        return nombre + " (" + departamento + ") - $" + salario;
    }
}

