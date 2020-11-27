
/**
 * Write a description of class Modelo here.
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
public class Modelo
{ 
    String polinomio;
    public void escribir()throws IOException
    {
        Vista vista = new Vista();
        Lista lista = new Lista();
        Lista2 lista2 = new Lista2();
        FileWriter archivo = null;
        PrintWriter escritor = null;
        
        try
        {
            archivo = new FileWriter("C:\\Users\\jamej\\Desktop\\Tarea-Programada-2\\"+vista.nombreArchivo()+".txt");
            escritor = new PrintWriter(archivo);
            escritor.print("Prueba escritura");

        }
        catch(Exception e)
        {
            throw e;
        }
        finally
        {
            archivo.close();
        }
    }

    public  void LeerOperaciones()
    {   FileReader archivo;
        BufferedReader lector;

        try
        {
            archivo = new FileReader("C:\\Users\\jamej\\Desktop\\Tarea-Programada-2\\Archivos.txt");
            if (archivo.ready())
            {
                lector = new BufferedReader(archivo);
                String archivoP; //Para Cuando se implemente a la funcion de polinomio
                while((archivoP = lector.readLine())!= null)
                {
                    
                    polinomio=archivoP;
                    //System.out.println(polinomio);
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

    Vista vista = new Vista();

    public static void separarPolinomios()
    {
        Lista lista1=new Lista();
        
        //Variables que conceden permisos para acceder a la modificacion de listas o de Strings
        //**************************************************************************
        String polinomio="5x+3x+2x|*|5x+3x+2x";
        int contador=0; //registra los caracteres en el sub string
        
        boolean vaciarBase=false;//nodo en el que se estara agregado el string
        boolean vaciarVariable=false;
        boolean vaciarExponente=false;
        
        String base="";
        String variable="";
        String exponente="";
        
        boolean lista=true;
        boolean siguienteNodo=false;
        
        boolean baseP=true;
        boolean variableP=false;
        boolean exponenteP=false;
        //**************************************************************************
        //Recorrido de Strings
        for(int y=1; y<=polinomio.length(); y++)
        {//"5x+3x+2x|*|5x+3x+2x"
            if(polinomio.substring(contador,y).equals("X") )
            {   
               variableP=true;//permite agregar la variable
               baseP=false;//impide el acceso a base
            }
            
            else if(polinomio.substring(contador,y).equals("+") || polinomio.substring(contador,y).equals("-"))
            {
                if (polinomio.substring(contador,y).equals("-") && base.equals(""))
                {
                    base+="-";
                }
                else
                {
                    siguienteNodo=true;//permite agregar al siguiente nodo
                }
            }
            
            else if(polinomio.substring(contador,y).equals("^"))
            {
                y++;
                contador++;
                variableP=false;//permite agregar la variable
                exponenteP=true;//permite agregar la variable
            }
            
            else if(polinomio.substring(contador,y).equals("|"))
            {
                //Falta hacer recorrido
            }
            
            else if(polinomio.substring(contador,y).equals("/")) 
            {
                //Falta hacer recorrido
            }
            else if(polinomio.substring(contador,y).equals("*"))
            {
                //falta Hacer recorrido
            }
            
            if (baseP==true )//permite agregar a la base
            {
                base+=polinomio.substring(contador,y);
            }
            
            if (variableP==true )//permite agregar a la variable
            {
                variable+=polinomio.substring(contador,y); 
                y++;
                contador++;
            }
            
            if (exponenteP==true )//permite agregar al exponente
            { 
                exponente+=polinomio.substring(contador,y);
            }
            
            if (lista==true && siguienteNodo==true)//Permite agrregar a la lista 1
            {
                lista1.insertar(new Monomio(base, variable, exponente));   
                lista1.mostrar();
            }
            contador++; // permite llevar el control de los elementos que se agregaran al monomio
        }   
    }
}
