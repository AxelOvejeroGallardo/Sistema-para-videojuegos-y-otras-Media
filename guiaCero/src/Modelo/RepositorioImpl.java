package Modelo;

import Excepciones.ElementoNoEncontradoException;
import Excepciones.IdentificadorDuplicadoException;
import Repositorios.Repositorio;

import java.util.*;

public class RepositorioImpl<T extends Media> implements Repositorio<T> {

    private TreeMap<Integer,T> mediaMap;

    public RepositorioImpl() {
        this.mediaMap = new TreeMap<>();
    }
    @Override
    public void agregar(T elemento) throws IdentificadorDuplicadoException{

        if(mediaMap.containsKey(elemento.getId())) {
            throw new IdentificadorDuplicadoException("El id ya existe en el sistema");
        }
        mediaMap.put(elemento.getId(), elemento);
    }


    @Override
    public T buscar(Integer id) throws ElementoNoEncontradoException {
            if(mediaMap.containsKey(id) == true){
                return mediaMap.get(id);
            } else {
                throw new ElementoNoEncontradoException("El ID no fue encontrado");
            }
    }

    @Override
    public void eliminar(Integer id) throws ElementoNoEncontradoException {
        if(mediaMap.containsKey(id) == true){
            mediaMap.remove(id);
        }else{
            throw new ElementoNoEncontradoException("El ID que busca no fue encontrado");
        }
    }

    public void mostrandoUno(Integer id) {
        System.out.println(mediaMap.get(id));
    }
    @Override
    public void mostrar() {
        for (Map.Entry<Integer, T> entry : mediaMap.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }

    @Override
    public void modificarTitulo(Integer id, String tituloNuevo) throws ElementoNoEncontradoException {
        if(mediaMap.containsKey(id)){
            mediaMap.get(id).setTitulo(tituloNuevo);
        } else {
            throw new ElementoNoEncontradoException("ID no encontrado");
        }
    }

    @Override
    public void modificarCreador(Integer id, String nuevoCreador) throws ElementoNoEncontradoException {
        if(mediaMap.containsKey(id)){
            mediaMap.get(id).setCreador(nuevoCreador);
        } else {
            throw new ElementoNoEncontradoException("ID no encontrado");
        }
    }

    @Override
    public void modificarGenero(Integer id, String nuevoGenero) throws ElementoNoEncontradoException {
        if(mediaMap.containsKey(id)){
            mediaMap.get(id).setGenero(nuevoGenero);
        } else {
            throw new ElementoNoEncontradoException("ID no encontrado");
        }
    }

    @Override
    public List<T> filtrarPorGenero(String genero) {
        return mediaMap.values().stream()
                .filter(e -> e.getGenero().equalsIgnoreCase(genero))
                .toList();
    }
}
