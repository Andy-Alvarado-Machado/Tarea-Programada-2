
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
   /** public static void LeerOperaciones()
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
   
    public void separarPolinomios()
    {
        //Variables que conceden permisos para acceder a la modificacion de listas o de Strings
        //**************************************************************************
        String polinomio="1X^2+2X^4-5X^1*4X^3";
        int contador=0; //registra los caracteres en el sub string

        boolean vaciarMonomio=false;//nodo en el que se estara agregado el string

        String monomio="";//string donde se agregara el nodo
        boolean lista = false; //indica a que lista se agregaran los string, si está en false es Cola y si está en true es Cola2
        boolean multiplicacion=false,division=false;
        boolean siguienteNodo=false; //le concede el permiso al nodo para agregar el string
        //**************************************************************************
        //Recorrido de Strings
        for(int y=1; y<=polinomio.length(); y++)
        {
            if(polinomio.substring(contador,y).equals("+") || polinomio.substring(contador,y).equals("-"))
            {   
                if( polinomio.substring(contador,y).equals("-") && monomio.equals(""))//Evita perder el signo menos
                {monomio+="-";}
                else
                {
                    vaciarMonomio=true; //Avanza al siguiente nodo
                    siguienteNodo=true;//permite acceder al siguiente nodo que se va a agregar
                }
            }
            else if(polinomio.substring(contador,y).equals("/"))
            {
                lista=true; //Avanza a la siguiente lista
                division=true;
                vaciarMonomio=true; // Vacia el monomio para agregar el proximo
                siguienteNodo=true; //permite acceder al siguiente nodo que se va a agregar
            }
            else if(polinomio.substring(contador,y).equals("*"))
            {
                lista=true; //Avanza a la siguiente lista
                multiplicacion=true;
                vaciarMonomio=true;     // Vacia el monomio para agregar el proximo
                siguienteNodo=true;     //permite acceder al siguiente nodo que se va a agregar
            }
            else
            {
                monomio +=polinomio.substring(contador,y);    //rellena el string donde ira la lista   
            }
            
            
            if (lista==false && siguienteNodo==true )
            {
                monomio.split("X");
                //agregue lo que esta antes en base una X en variable y lo que sigue en expnente
                
                cola.agregarValor(monomio);//Agrega el monomio a la primera lista
                siguienteNodo=false; //agregar el polinomio al nodo seleccionado
            }

            if (lista=true && siguienteNodo==true || y==polinomio.length())
            {
                siguienteNodo=false; //agregar el polinomio al nodo seleccionado
                cola2.agregarValor(monomio);//Agrega el monomio a la segunda lista
            }
            if(vaciarMonomio==true && polinomio.substring(contador,y).equals("-") )
            {
                vaciarMonomio=false;
                monomio="-"; //vacia el string para volver a ser llenado en el siguiente nodo
            }
            else if(vaciarMonomio==true )
            {
                vaciarMonomio=false;    //evita que se vacie el monomio antes de tiempo
                monomio=""; //vacia el string para volver a ser llenado en el siguiente nodo
            }
            contador++; // permite llevar el control de los elementos que se agregaran al monomio
        }     
    */
    
    
    
    
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
