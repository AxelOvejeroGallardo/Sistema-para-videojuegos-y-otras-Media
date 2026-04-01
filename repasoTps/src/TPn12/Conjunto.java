package TPn12;

import java.util.HashSet;

public class Conjunto<T> {
    private HashSet<T> conjunto;

    public Conjunto(HashSet<T> conjunto) {
        this.conjunto = new HashSet<>();
    }

    public void agregar(T elemento){
        conjunto.add(elemento);
    }

    public void eliminar(T elemento){
        conjunto.remove(elemento);
    }

    public boolean verificarElemento(T elemento){
        return conjunto.contains(elemento);
    }
}
