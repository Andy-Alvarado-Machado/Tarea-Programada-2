
/**
 * Write a description of class ImprimirLista here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import javax.swing.JOptionPane;
//Metodo de Excepciones
import java.io.*;
//Metodos de escritura
import java.io.FileWriter;
import java.io.PrintWriter;
//Metodos de lectura los datos
import java.io.FileReader;
import java.io.BufferedReader;
public class ImprimirLista
{
    public static void LeerOperaciones()
    {
        FileReader archivo;
        BufferedReader lector;

        try
        {
            archivo = new FileReader("C:\\Users\\jamej\\Desktop\\Tarea-Programada-2 - copia\\Archivos.txt");
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

    public static void main(String args[]) 
    {
        Lista polinomio1=new Lista();
        Lista2 polinomio2=new Lista2();
        String base , variable , exponente; 
        //4x^2+3x 
        base= "4";
        variable ="X";
        exponente ="2";

        polinomio1.insertar(new Polinomio(base,variable,exponente));
        polinomio1.mostrar();
        polinomio2.insertar(new Polinomio(base,variable,exponente));
        polinomio2.mostrar();
    }
}
