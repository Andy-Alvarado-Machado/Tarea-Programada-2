
/**
 * Realiza el llamado las diferentes funcionalidades
 * 
 * @author (James Araya, Andy Alvarado) 
 * @version (01)
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
        String operacion, variable, resultados="";
        int respuestaOperacion=0;
        do{
            int opcion=vista.pedirOpcion(),respuesta=0,base,exponente,respuesta2=0;
            if(opcion==1)
            {
                do{
                    base=vista.base();
                    variable=vista.variable();
                    exponente=vista.exponente();
                    lista1=modelo.obtenerDatosLista1(base,variable,exponente);  
                    lista1.mostrar();  
                    respuesta=Integer.parseInt(JOptionPane.showInputDialog("¿Desea agregar otro monomio?:\n1-Sí\n2-No")); 
                }while(respuesta==1);
                operacion=vista.operacion(); 
                modelo.setOperador(operacion);
                do{ 
                    base=vista.base();
                    variable=vista.variable();
                    exponente=vista.exponente();
                    lista2=modelo.obtenerDatosLista2(base,variable,exponente);  
                    lista2.mostrar();
                    respuesta2=Integer.parseInt(JOptionPane.showInputDialog("¿Desea agregar otro monomio?:\n1-Sí\n2-No")); 
                }while(respuesta2==1);
                modelo.operarPolinomios(vista.nombreArchivo());
                lista3=modelo.obtenerLista3();
                lista3.mostrar();
                lista1=modelo.obtenerLista1();
                lista2=modelo.obtenerLista2();
                lista1.limpiar();
                lista2.limpiar();
                lista3.limpiar();
            }
            else if(opcion==2)
            {
                modelo.LeerOperaciones(vista.archivoLeer(),vista.nombreArchivo());  
            }
            
            respuestaOperacion=Integer.parseInt(JOptionPane.showInputDialog("¿Desea realizar otra operación?:\n1-Sí\n2-No"));

        }while(respuestaOperacion==1);
    }
}
