
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
   
   modelo.separarPolinomios();
   
}
}
