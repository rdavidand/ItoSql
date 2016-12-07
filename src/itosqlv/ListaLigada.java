package itosqlv;

import java.util.ArrayList;

public class ListaLigada {
  public NodoLista inicio;
    public ListaLigada(){
     inicio=null;
    }
    public void setInicio(NodoLista inicio){
     this.inicio=inicio;
    }
    public NodoLista getInicio(){
     return inicio;
    }
    
    public void insertax(ArrayList <Campo> c ){
          NodoLista aux= new NodoLista (c);
     aux.setSiguiente(inicio);
     inicio=aux;
     inicio.setSiguiente(null);
    } 
    
    public void inserta(ArrayList <Campo> c){
     if(inicio!=null){
        NodoLista sig=inicio;
        while(sig.getSiguiente()!=null){
          sig= sig.getSiguiente();
        }
        sig.setSiguiente(new NodoLista(c));
     }
     else{
        insertax(c);
     }
    }
    
    public void recorretitulo(){
       ArrayList<Campo> v;
       v=inicio.getX();
       for(int i=0;i<v.size();i++){
          Campo w;
          w=v.get(i);
        System.out.print(w.getNombre()+"  ");
       }
       System.out.println();
    }
    public String regtit(){
     ArrayList<Campo> g;
     g=inicio.getX();
     for(int l=0;l<g.size();l++){
      Campo t;
      t=g.get(l);
      return t.getNombre();
    }
     return "";
    }
    
    public void recorredatos(){
        NodoLista a=inicio.getSiguiente();
       while(a!=null){
          NodoLista y=a;
      ArrayList <Campo> i=y.getX();
      Campo u;
      Texto g;
      Numerico e;
      for(int m=0;m<i.size();m++){
          u=i.get(m);
       if(u instanceof Texto){
        g=(Texto)u;
        System.out.print(g.datt()+"  ");
       }
       if(u instanceof Numerico){
         e=(Numerico)u;
        System.out.print(e.getDato());
        }
      }
      System.out.println();
        a=y.getSiguiente();
      }
      
    }
    
}
