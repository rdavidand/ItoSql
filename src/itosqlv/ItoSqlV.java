package itosqlv;
import java.util.*;
import javax.swing.JOptionPane;
public class ItoSqlV {
    public static void main(String[] args) {
      ArrayList<Tabla> tablas= new ArrayList<Tabla>();
      int opcion;
      //int opcion=0;
      do{
          String[] opcions={"Crear tabla","Mostrar Tablas","Eliminar Tabla","Salir"};
           opcion=JOptionPane.showOptionDialog(null,"Selecciona una opcion","Titulo", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE,null,opcions,opcions[0]);
          //opcion=Integer.parseInt(JOptionPane.showInputDialog("MENÚ\n 1-Crear Tabla \n 2-Mostrar Tablas \n 3-Eliminar Tabla \n 4-Salir"));
          switch(opcion){
              case 0:
                  ArrayList <Campo> tit= new ArrayList<Campo>();
                  ListaLigada table = new ListaLigada();
                    String nombre=JOptionPane.showInputDialog("Ingresa el nombre de la tabla");
                    int opcion2;
                    do{
                        String [] op2={"Insertar campos","Insertar datos","Listo"};
                        opcion2=JOptionPane.showOptionDialog(null,"Selecciona una opcion","Titulo", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE,null,op2,op2[0]);
                        
                        switch(opcion2){
                            case 0:
                                  int opcion3=0;
                                  do{
                                      String[]op3={"Ingresar campo","Listo"};
                                      opcion3=JOptionPane.showOptionDialog(null,"Selecciona una opcion","Titulo", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE,null,op3,op3[0]);
                                     // opcion3=Integer.parseInt(JOptionPane.showInputDialog("1-Ingresar campo \n 2-Listo"));
                                      switch(opcion3){
                                          case 0:
                                              String nom=JOptionPane.showInputDialog("Ingresa el nombre del campo");
                                              String tipo;
                                               String opciones[]={"Texto","Numérico"};
                                                tipo=(String)JOptionPane.showInputDialog(null,"Seleccione: ","Tipo",JOptionPane.INFORMATION_MESSAGE,null,opciones,opciones[1]);
                                                switch(tipo){
                                                    case "Texto":
                                                           Texto t= new Texto();
                                                           t.setNombre(nom);
                                                           tit.add(t);
                                                        break;
                                                    case "Numérico":
                                                         Numerico n = new Numerico();
                                                         n.setNombre(nom);
                                                         tit.add(n);
                                                        break;
                                                }
                                              break;// fin de caso 1 opcion3
                                          case 1:
                                           table.inserta(tit);
                                              break;
                                      }
                                  }while(opcion3 !=1);
                                break;// fin de caso1 opcion2
                            case 1:
                                if(tit.size()!=0){
                                ArrayList <Campo> tup= new ArrayList<Campo>();
                                
                                Campo d;
                               for(int i=0;i<tit.size();i++){
                                  d=tit.get(i);
                                  if(d instanceof Texto){
                                    Texto c= new Texto();
                                    c.setDatot(JOptionPane.showInputDialog("Ingresa "+d.getNombre()));
                                    tup.add(c);
                                  }
                                  if(d instanceof Numerico){
                                    Numerico s= new Numerico();
                                    s.setDato(Integer.parseInt(JOptionPane.showInputDialog("Ingresa "+d.getNombre())));
                                    tup.add(s);
                                  }
                                
                               }
                               table.inserta(tup);
                                }
                                else{
                                 JOptionPane.showMessageDialog(null,"Aun no se ingresan los campos");
                                }
                                break;//fin de caso2 opcion2
                            case 2:
                             Tabla t1= new Tabla(nombre,table);
                             tablas.add(t1);
                             JOptionPane.showMessageDialog(null,"Tabla "+nombre+" guardada exitosamente");
                                break;// fin de caso 3 opcion2
                        }
                    }while(opcion2!=2);
                  break;// fin de caso 1 opcion1
                  
                  
                  
                  
                  
              case 1://Mostrar tablas
               if(tablas.size()!=0){
                  String tabs[]= new String[tablas.size()];
                  for(int k=0;k<tablas.size();k++){
                   Tabla ax;
                   ax=tablas.get(k);
                   tabs[k]=ax.getNombre();
                  }
                 String mn;
                 mn=(String)JOptionPane.showInputDialog(null,"Selecciona tabla","Tabla",JOptionPane.INFORMATION_MESSAGE,null,tabs,tabs[tabs.length-1]);
                 Tabla aux=tablas.get(0);
                 for(int c=0;c<tablas.size();c++){
                   Tabla d=tablas.get(c);
                   if(d.getNombre().equals(mn)){
                    aux=tablas.get(c);
                   }
                 }
                  aux.recorrerTabla();
               }
               else{
               JOptionPane.showMessageDialog(null,"No hay tablas guardadas");
               }
                  break;//fin del caso 2 opcion 1 menu principal mostrar tablas
                  
                  
              case 2:
                  tablas.get(1).burbujatxt(1);
                  tablas.get(1).recorrerTabla();
                  break;
          }//fin de swich1 opcion
      }while(opcion!=3);
    }
    
}
