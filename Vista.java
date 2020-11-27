
/**
 * Write a description of class Vista here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.io.*;
import java.io.FileWriter;
import java.io.PrintWriter;
import javax.swing.JOptionPane;
public class Vista
{
    
    public String nombreArchivo()
    {
        String Archivos=JOptionPane.showInputDialog("Ingrese el nomre del archivo para escribir");
        return Archivos;
        
    }
    
    public int menuOpciones()
    {
        int opcion=Integer.parseInt(JOptionPane.showInputDialog("        MENÚ         \n\n"
        +" 1 - Ingresar una operacion a la hoja de calculos\n"
        +" 2 - Imprimir los resultados de las operaciones\n"));
        
        return opcion;
    }
}
