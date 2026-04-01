package TPn13;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Curso {
    private String nombreCurso;
    private static int contador;
    private  int id;
    private ArrayList<Persona> arrayList;

    public Curso() {
        this.arrayList = new ArrayList<>();
        contador++;
        this.id = contador;
    }
    public Curso(String nombreCurso) {
        contador++;
        this.id = contador;
        this.nombreCurso = nombreCurso;
        this.arrayList = new ArrayList<>();
    }

    public Curso(JSONObject jsonObject){
        this.nombreCurso = jsonObject.getString("nombreCurso");
        this.id = jsonObject.getInt("id");
        this.arrayList = new ArrayList<>();

        JSONArray personaArray = jsonObject.getJSONArray("personas");
        for(int i = 0; i<personaArray.length(); i++){
            JSONObject jsonObject1 = personaArray.getJSONObject(i);
            this.arrayList.add(new Persona(jsonObject1));
        }
    }

    public JSONObject toJson(){
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("nombreCurso",nombreCurso);
        jsonObject.put("id",id);

        JSONArray jsonArray = new JSONArray();
        for(Persona p : arrayList){
            jsonArray.put(p.toJSON());
        }

        return jsonObject;
    }


    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public int getId() {
        return id;
    }

    public ArrayList<Persona> getArrayList() {
        return arrayList;
    }

    public void setArrayList(ArrayList<Persona> arrayList) {
        this.arrayList = arrayList;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "nombreCurso='" + nombreCurso + '\'' +
                ", id=" + id +
                ", arrayList=" + arrayList +
                '}';
    }

    public void agregarPersona(Persona persona){
        arrayList.add(persona);
    }

    public void eliminarPersona(Persona persona){
        arrayList.remove(persona);
    }
}
