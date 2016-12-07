package itosqlv;
public class Tabla {
  String nombre;
  ListaLigada dat;
  public Tabla(String nombre,ListaLigada dat){
   this.nombre=nombre;
   this.dat=dat;
  }
  
  public void recorrerTabla(){
    dat.recorretitulo();
    dat.recorredatos();
  }
  
  public String toString(){
   return nombre;
  }
  public void setNombre(String nombre){
  this.nombre=nombre;
  }
  public String getNombre(){
   return nombre;
  }
  
  public void burbujatxt(int pos){
   NodoLista temporal=dat.inicio;
  /// while(){}
  }
}
