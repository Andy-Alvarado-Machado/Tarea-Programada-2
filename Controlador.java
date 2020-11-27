
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
    Lista lista = new Lista();
    Lista2 lista2 = new Lista2();
    public void ejecutar()
    {
        String operacion;
        int opcionIngresar=vista.opcionIngresar();
        if(opcionIngresar==1){
        operacion=vista.pedirString();
        lista.mostrar();
        lista2.mostrar();
        }
        /*
        int opcion=vista.menuOpciones(); 
        
        do
        {
            switch(opcion)
            {
                case 1:
                    try{
                        modelo.escribir();
                        break;
                    }catch(Exception e)
                    {
                        System.out.print(e.getMessage());
                    }
                case 2:
                    modelo.LeerOperaciones();
                    break;
                
                case 3:
                
                default:
                    System.out.print("Ingreso un dato incorrecto\n");
            
            }
        }while(opcion!=3);
    }
    */
   
   
}
}
