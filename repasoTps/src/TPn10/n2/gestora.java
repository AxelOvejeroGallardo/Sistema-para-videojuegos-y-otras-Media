package TPn10.n2;

import TPn5.n4.Persona;

import java.util.HashMap;
import java.util.Map;

public class gestora {
    private HashMap<Integer,Persona2> mapPersonas;

    public gestora(HashMap<Integer, Persona2> mapPersonas) {
        this.mapPersonas = mapPersonas;
    }

    public boolean alta(Persona2 persona){
        if(mapPersonas.containsKey(persona.getDNI())){
            System.out.println("Error, esa persona ya existe...");
            return false;
        }
        mapPersonas.put(persona.getDNI(), persona);
        return true;
    }
    public boolean baja(int dni){
        Persona2 personaAux = mapPersonas.remove(dni);

        if(personaAux != null){
            return true;
        }else {
            System.out.println("No se pudo eliminar a la persona");
            return false;
        }
    }
    public boolean modificacion(int dni, String nombreNuevo, int nuevaEdad){
        Persona2 personAux = mapPersonas.get(dni);

        if(personAux != null){
            personAux.setEdad(nuevaEdad);
            personAux.setNombre(nombreNuevo);
            return true;
        }else{
            System.out.println("La persona no existe...");
            return false;
        }
    }

    public void listarPersonas(){
        if(mapPersonas.isEmpty()){
            System.out.println("Lista de personas vacia");
        }else{
            System.out.println("Listado de personas:" + mapPersonas.size());

            for(Persona2 p : mapPersonas.values()){
                System.out.println("|-------------------------------------|");
                System.out.println(p.toString());
            }
            System.out.println("|-------------------------------------|");
        }
    }




}
