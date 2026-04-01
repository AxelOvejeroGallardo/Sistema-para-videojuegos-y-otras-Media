package TPn12;

import java.util.List;

public class Almacenamiento<T>{
    private List<T> lista;
    private int tope;

    public Almacenamiento() {
    }

    public Almacenamiento(List<T> lista, int tope) {
        this.lista = lista;
        this.tope = tope;
    }

    public void agregar(T elemento){

        if(lista.size() < tope){

            lista.add(elemento);
        }
    }

    public void eliminar(T elemento){
        lista.remove(elemento);
    }

    public int buscar(T elemento){

        for(T a : lista){
            if(a.equals(elemento)){
                return 1;
            }
        }
        return 0;
    }
}
