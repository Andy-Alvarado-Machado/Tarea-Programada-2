
/**
 * Write a description of class Controlador here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import javax.swing.JOptionPane;
public class Controlador
{
    Vista vista=new Vista();
    Modelo modelo=new Modelo();

    public void ejecutar()
    {
        Lista lista1;
        Lista lista2;
        Lista lista3;
        String operacion, variable;
        int opcion=vista.pedirOpcion(),respuesta=0,base,exponente,respuesta2=0;
        if(opcion==1)
        {
            do{
                base=vista.base();
                variable=vista.variable();
                exponente=vista.exponente();
                modelo.obtenerDatosLista1(base,variable,exponente);
                respuesta=Integer.parseInt(JOptionPane.showInputDialog("¿Desea agregar otro monomio?:\n1-Sí\n2-No")); 
            }while(respuesta==1);
            operacion=vista.operacion();
            modelo.setOperador(operacion);
            do{
                base=vista.base();
                variable=vista.variable();
                exponente=vista.exponente();
                modelo.obtenerDatosLista2(base,variable,exponente);
                respuesta2=Integer.parseInt(JOptionPane.showInputDialog("¿Desea agregar otro monomio?:\n1-Sí\n2-No")); 
            }while(respuesta2==1);
            lista1=modelo.obtenerLista1();
            lista2=modelo.obtenerLista2();
            System.out.println();
            System.out.println();
            System.out.print("Lista 1: ");
            lista1.mostrar(); 
            System.out.println();
            System.out.println();
            System.out.print("Lista 2: ");
            lista2.mostrar();
            System.out.println();
            System.out.println();
            System.out.print("Lista 3: ");

            modelo.vectorLista1();
            lista3=modelo.obtenerLista3();
            lista3.mostrar();
            /*
            operacion=vista.pedirString();
            lista1=modelo.obtenerLista1();
            lista2=modelo.obtenerLista2();
            lista1.mostrar();
            System.out.print(operacion);
            lista2.mostrar();
             */
        }else if(opcion==2){
            modelo.LeerOperaciones();
            lista1=modelo.obtenerLista1();
            lista2=modelo.obtenerLista2();

            lista1.mostrar(); 
            System.out.println();
            lista2.mostrar();
            System.out.println();

            modelo.vectorLista1();
            lista3=modelo.obtenerLista3();
            lista3.mostrar();

            //System.out.print("\n"+modelo.obtenerTamannio1());
            //System.out.print("\n"+modelo.obtenerTamannio2());

        }
    }
}
