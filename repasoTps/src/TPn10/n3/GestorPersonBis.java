package TPn10.n3;

import TPn10.n2.Persona2;
import TPn5.n4.Persona;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.TreeMap;

public class GestorPersonBis {
    private HashSet<PersonaBis> hashSetPersonasBis = new HashSet<>();

    private Map<String,PersonaBis> hashMapPersonasBis;

    public GestorPersonBis(){
        this.hashMapPersonasBis = new TreeMap<>();
    }

    public void copiandoPersonas(HashMap<Integer, Persona2> personasOriginales){
        for(Persona2 p : personasOriginales.values()){

            String dniString = String.valueOf(p.getDNI());

            PersonaBis personAux = new PersonaBis(
                    p.getNombre(),
                    dniString,
                    p.getEdad()
            );
            hashMapPersonasBis.put(dniString,personAux);
            hashSetPersonasBis.add(personAux);
        }
    }

    public void mostrarPersonasBisOrdenadas(){
        for (Map.Entry<String,PersonaBis> entrada : hashMapPersonasBis.entrySet()){
            String dni = entrada.getKey();
            PersonaBis persona = entrada.getValue();

            System.out.println("DNI: " + dni + " -> " + persona.toString());
        }
    }

}
