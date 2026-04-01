package TPn11;

import TPn11.Alumno;

import java.util.*;

public class Colegio {
    private List <Alumno>lista;
    public Colegio() {
        this.lista = new ArrayList<>();
    }

    public void agregarAlumno(Alumno alumno){
        try {
            if(alumno == null){
                System.out.println("No se puede agregar un alumno sin datos");
            }else if(alumno.getNombre().isEmpty()){
                System.out.println("No se puede agregar un alumno sin nombre");
            }else if(alumno.getNacionalidad().isEmpty()){
                System.out.println("No se puede agregar un alumno sin nacionaludad");
            }
            lista.add(alumno);
            System.out.println("Se agrego un alumno.");
        }catch(Exception e){
            System.out.println("Error al agragr un alumno " + e.getMessage());
        }
    }

    public void verNacionalidad(String nacionalidad){
        int i = 0;
        try{
            if(lista.isEmpty()){
                System.out.println("Lista vacia");
            }
            for(Alumno a : lista) {
                if (a.getNacionalidad().equals(nacionalidad)) {
                    i++;
                }
            }

            if(i == 0){
                System.out.println("No se encontro ningun alumno con esa nacionalidad");
            }else {
                System.out.println("Nacionalidad: " + nacionalidad );
                System.out.println("Cantidad: " + i);
            }

        }catch(NullPointerException n){
            System.out.println("ERROR: " + n.getMessage());
        }
        catch(Exception e) {
            System.out.println("No se encontro la nacionalidad " + e.getMessage());
        }
    }

    public void cuantos() {
        try {
            if (lista == null) {
                throw new NullPointerException("La lista de alumnos no fue inicializada.");
            }

            if (lista.isEmpty()) {
                System.out.println("No hay alumnos cargados en el colegio.");
                return;
            }

            Set<String> nacionalidadesDiferentes = new HashSet<>();

            for (Alumno a : lista) {
                if (a.getNacionalidad() != null && !a.getNacionalidad().isEmpty()) {
                    nacionalidadesDiferentes.add(a.getNacionalidad());
                }
            }

            System.out.println("Existen " + nacionalidadesDiferentes.size() + " nacionalidades diferentes en el colegio.");

        } catch (NullPointerException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Ocurrió un error inesperado: " + e.getMessage());
        }
    }

    public void borrar (Alumno alumno){
        try {
            if (lista == null) {
                throw new NullPointerException("La lista de alumnos no fue inicializada.");
            }

            if (alumno == null) {
                throw new IllegalArgumentException("El alumno a eliminar no puede ser nulo.");
            }

            if (lista.remove(alumno)) {
                System.out.println("✅ Se eliminó correctamente el alumno: " + alumno.getNombre());
            } else {
                System.out.println("⚠️ No se encontró al alumno para eliminar.");
            }

        } catch (IllegalArgumentException | NullPointerException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Ocurrió un error inesperado: " + e.getMessage());
        }
    }

    public void verTodos() {
        try {
            if (lista == null) {
                throw new NullPointerException("La lista de alumnos no fue inicializada.");
            }

            if (lista.isEmpty()) {
                System.out.println("El listado de alumnos está vacío.");
                return;
            }

            Map<String, Integer> contXNacionalidad = new HashMap<>();

            for (Alumno a : lista) {
                String nac = a.getNacionalidad();

                if (nac == null || nac.isEmpty()) {
                    System.out.println("⚠️ Un alumno tiene nacionalidad no especificada, se omitirá en el conteo.");
                    continue;
                }

                contXNacionalidad.put(nac, contXNacionalidad.getOrDefault(nac, 0) + 1);
            }

            System.out.println("\n📊 **Estadísticas por Nacionalidad:**");
            for (Map.Entry<String, Integer> entry : contXNacionalidad.entrySet()) {
                System.out.println(" - " + entry.getKey() + ": " + entry.getValue() + " alumnos.");
            }

        } catch (NullPointerException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Ocurrió un error inesperado: " + e.getMessage());
        }
    }
}