
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
            do{
                base=vista.base();
                variable=vista.variable();
                exponente=vista.exponente();
                modelo.obtenerDatosLista2(base,variable,exponente);
                respuesta2=Integer.parseInt(JOptionPane.showInputDialog("¿Desea agregar otro monomio?:\n1-Sí\n2-No")); 
            }while(respuesta2==1);
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
            lista2.mostrar();
        }

    }
}
