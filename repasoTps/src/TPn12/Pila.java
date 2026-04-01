package TPn12;

import java.util.Stack;

public class Pila<T>{
    private Stack<T> Pila;
    private int tope;

    public Pila() {
    }
    public Pila(Stack<T> pila, int tope) {
        Pila = pila;
        this.tope = tope;
    }

    private void agregar(T elemento){
        Pila.add(elemento);
    }

    private void quitar(T elemento){
        Pila.push(elemento);
    }

    public int verificarContent(){
        if(Pila.isEmpty()){
            return 0;
        }
        return Pila.size();
    }
}
