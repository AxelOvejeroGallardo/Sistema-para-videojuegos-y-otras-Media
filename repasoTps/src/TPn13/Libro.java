package TPn13;

import org.json.JSONObject;

public class Libro {
    private String titulo;
    private String autor;
    private int anio;

    public Libro() {
    }

    public Libro(String titulo, String autor, int anio) {
        this.titulo = titulo;
        this.autor = autor;
        this.anio = anio;
    }

    // Constructor desde JSON
    public Libro(JSONObject json) {
        this.titulo = json.getString("titulo");
        this.autor = json.getString("autor");
        this.anio = json.getInt("anio");
    }

    // Convierte un objeto Libro a JSON
    public JSONObject toJSON() {
        JSONObject json = new JSONObject();
        json.put("titulo", titulo);
        json.put("autor", autor);
        json.put("anio", anio);
        return json;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    @Override
    public String toString() {
        return titulo + " - " + autor + " (" + anio + ")";
    }
}
