
/**
 * Write a description of class escritor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.io.IOException;
import java.io.FileWriter;
import java.io.PrintWriter;
import javax.swing.JOptionPane;
public class escritor
{
    public static void main(String args[])throws IOException
    {
        FileWriter archivo = null;
        PrintWriter escritor = null;
        
        try
        {
            archivo = new FileWriter("C:\\Users\\jamej\\Desktop\\Tarea-Programada-2\\Archivos.txt");
            escritor = new PrintWriter(archivo);
            
            escritor.print("Prueba escritura");
        }
        catch(Exception e)
        {
            System.out.print("error"+ e.getMessage());
        }
        finally
        {
            archivo.close();
        }
    }
}
