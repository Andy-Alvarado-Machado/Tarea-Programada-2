
/**
 * Write a description of class Controlador here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Controlador
{
    Vista vista=new Vista();
    Modelo modelo=new Modelo();

    public void ejecutar()
    {
        Lista lista1;
        Lista lista2;
        String operacion;
        int opcion=vista.pedirOpcion();
        if(opcion==1)
        {
        operacion=vista.pedirString();
        lista1=modelo.obtenerLista1();
        lista2=modelo.obtenerLista2();
        lista1.mostrar();
        System.out.print(operacion);
        lista2.mostrar();
        }else if(opcion==2){
        modelo.LeerOperaciones();
        lista1=modelo.obtenerLista1();
        lista2=modelo.obtenerLista2();
        lista1.mostrar();
        lista2.mostrar();
        }
        
        
    }
}
