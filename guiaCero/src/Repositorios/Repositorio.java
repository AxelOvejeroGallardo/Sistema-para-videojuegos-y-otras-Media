package Repositorios;

import Excepciones.ElementoNoEncontradoException;
import Excepciones.IdentificadorDuplicadoException;

import java.util.List;

public interface Repositorio<T> {
    void agregar(T elemento) throws IdentificadorDuplicadoException;
    T buscar (Integer id) throws ElementoNoEncontradoException;
    void eliminar(Integer id) throws ElementoNoEncontradoException;

    void mostrar();

    void modificarTitulo(Integer id, String tituloNuevo) throws ElementoNoEncontradoException;
    void modificarCreador(Integer id, String nuevoCreador) throws ElementoNoEncontradoException;
    void modificarGenero(Integer id, String nuevoGenero) throws ElementoNoEncontradoException;

    List<T> filtrarPorGenero(String genero);

}
