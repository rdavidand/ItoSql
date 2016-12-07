package itosqlv;

import java.util.ArrayList;

public class NodoLista {
   ArrayList<Campo>x= new ArrayList<Campo>();
   NodoLista siguiente;

    public NodoLista(ArrayList<Campo> x) {
        this.x=x;
    }
    public void setX(ArrayList<Campo>x){
      this.x=x;
    }
    public ArrayList<Campo> getX(){
     return x;
    }

    public NodoLista getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoLista siguiente) {
        this.siguiente = siguiente;
    }   
}
