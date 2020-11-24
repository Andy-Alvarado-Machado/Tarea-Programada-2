
/**
 * Write a description of class Lector here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;
import javax.swing.JOptionPane;
public class Lector
{
    public void leer()
    {
        FileReader archivo;
        BufferedReader lector;
        
        try
        {
            archivo = new FileReader("C:\\Users\\jamej\\Desktop\\Tarea-Programada-2\\Archivos.txt");
            if (archivo.ready())
            {
                lector = new BufferedReader(archivo);
                String polinomio; //Para Cuando se implemente a la funcion de polinomio
                while((polinomio = lector.readLine())!= null)
                {
                    System.out.println(polinomio);
                }
            }
            else
            {
                System.out.println("El archivo aun no esta listo ");
            }
        }
        catch(Exception e)
        {
            System.out.print("error" + e.getMessage());
        }
        
    }
    
}
