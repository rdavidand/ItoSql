package itosqlv;
public class Numerico extends Campo{
     int dato;
    public void setDato(int dato){
     this.dato=dato;
    }
    public int getDato(){
     return dato;
    }
    public String toString(){
     String x=Integer.toString(dato);
     return x;
    }
  
}
