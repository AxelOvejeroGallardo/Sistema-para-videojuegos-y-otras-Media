package TPn13;

import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

public class GestoraJSON {
    private String nombreArchivo;

    public GestoraJSON(String nombreArchivo){
        this.nombreArchivo = nombreArchivo;
    }

    public void serializar(Persona p){
        try{
            JSONObject jsonObject = p.toJSON();

            OperacionesLectoEscritura.agregarObjeto(nombreArchivo,jsonObject);

        }catch(JSONException e){
            e.printStackTrace();
        }
    }

    public Persona deserializar() {
        Persona p = null;

        try {
            ///LEEMOS ARCHIVO
            JSONTokener jsonTokener = OperacionesLectoEscritura.leer(nombreArchivo);
            ///OBTENEMOS EL JSON OBJET
            JSONObject jsonObject = new JSONObject(jsonTokener);
            ///OBTENEMOS EL JSON OBJET COMO OBJETO PERSONA
            p = new Persona(jsonObject);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return p;
    }
}
