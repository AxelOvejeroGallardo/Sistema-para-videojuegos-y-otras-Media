package TPn13;

import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

import java.io.File;
import java.io.IOException;

public class GestoraCursoJson {
    private String nombreArchivo;

    public GestoraCursoJson(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }

    public void serializacion(Curso curso){
        try{
            JSONObject jsonObject = curso.toJson();
            OperacionesLectoEscritura.agregarObjeto(nombreArchivo,jsonObject);
        }catch (JSONException e){
            e.printStackTrace();
        }
    }

    public Curso deserializar(){
        Curso curso = null;
        try{
            JSONTokener jsonTokener = OperacionesLectoEscritura.leer(nombreArchivo);
            JSONObject jsonObject = new JSONObject(jsonTokener);
            curso = new Curso(jsonObject);
        }catch(JSONException e){
            e.printStackTrace();
        }
        return curso;
    }
}
