package itosqlv;
public abstract class Campo {
     String nombre;
   public void setNombre(String nombre){
    this.nombre=nombre;
   }
   public String getNombre(){
    return nombre;
   }
  public abstract String toString();
}
