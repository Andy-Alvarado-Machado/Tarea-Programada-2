
/**
 * Write a description of class Vista here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.io.IOException;
import java.io.FileWriter;
import java.io.PrintWriter;
import javax.swing.JOptionPane;
public class Vista
{
    
    public String pedirPolinomio()
    {
        String polinomio="";
        polinomio=JOptionPane.showInputDialog("Digite la operacion que desee realizar");
        return polinomio;
    }
    
     public int escogerEscritura()
    {
        int opcion=Integer.parseInt(JOptionPane.showInputDialog("Escola la forma de obtener los polinomios:\n1.Manual\n2.Por un archivo"));
        return opcion;
    }
    
}
