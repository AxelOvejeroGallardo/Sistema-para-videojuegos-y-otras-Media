package TPn13;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class OperacionesLectoEscritura {

    public OperacionesLectoEscritura(){
    }


    ///AGREGAMOS UN OBEJTO JSON A EL ARCHIVO
    public static void agregarObjeto(String nombreArchivo, JSONObject jsonObject){
        try(FileWriter fileWriter = new FileWriter(nombreArchivo)){
            fileWriter.write(jsonObject.toString(4));
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    ///AGREGAMOS UN ARRAY JSON A EL ARCHIVO
    public static void agregarArray (String nombreArchivo, JSONArray jsonObject){
        try(FileWriter fileWriter = new FileWriter(nombreArchivo)){
            fileWriter.write(jsonObject.toString(4));
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public static JSONTokener leer (String nombreArchivo){
        JSONTokener tokener = null;
        try{
            tokener = new JSONTokener(new FileReader(nombreArchivo));
        }catch (IOException e){
            e.printStackTrace();
        }catch (JSONException x){
            x.printStackTrace();
        }
        return tokener;
    }
}
