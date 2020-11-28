
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
    Lista lista1=new Lista();
    Lista lista2=new Lista();
    String polinomio;
    /*
    public void escribir()throws IOException
    {
        
        //Lista2 lista2 = new Lista2();
        FileWriter archivo = null;
        PrintWriter escritor = null;
        
        try
        {
           // archivo = new FileWriter("C:\\Users\\jamej\\Desktop\\Tarea-Programada-2\\"+vista.nombreArchivo()+".txt");
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
*/
    public  void LeerOperaciones()
    {      FileReader archivo;
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
                    separarPolinomios(polinomio);
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


    public void separarPolinomios(String polinomio1) 
    {
        
        //Variables que conceden permisos para acceder a la modificacion de listas o de Strings
        //**************************************************************************
        String polinomio=polinomio1;//"5X^2+3X^4|*|3X^1";
        int contador=0; //registra los caracteres en el sub string
        
        boolean vaciarBase=false;//nodo en el que se estara agregado el string
        boolean vaciarVariable=false;
        boolean vaciarExponente=false;
        
        String base1="";
        String variable="";
        String exponente1="";
        int base , exponente;
        
        boolean lista=true;
        boolean siguienteNodo=false;
        
        boolean baseP=true;
        boolean variableP=false;
        boolean exponenteP=false;
        
        boolean multiplicacion=false;
        boolean division=false;
        //**************************************************************************
        //Recorrido de Strings
        for(int y=1; y<=polinomio.length(); y++)
        {//"5x+3x+2x|*|5x+3x+2x"
            if(polinomio.substring(contador,y).equalsIgnoreCase("x") )
            {   
               variableP=true;//permite agregar la variable
               baseP=false;//impide el acceso a base
            }
            
            else if(polinomio.substring(contador,y).equals("+") || polinomio.substring(contador,y).equals("-") )
            {
                exponenteP=false;
                if (polinomio.substring(contador,y).equals("-") && base1.equals(""))
                {}
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
                 exponenteP=false;
            }
            
            else if(polinomio.substring(contador,y).equals("/")) 
            {
                siguienteNodo=true;//permite agregar al siguiente nodo
                lista=false;
                multiplicacion=true;
                y++;
                contador++;
                exponenteP=false;
                //Falta hacer recorrido
            }
            else if(polinomio.substring(contador,y).equals("*"))
            {
                siguienteNodo=true;//permite agregar al siguiente nodo
                lista=false;//falta Hacer recorrido
                division=true;
                y++;
                contador++;
                exponenteP=false;
            }
            
            if (baseP==true )//permite agregar a la base
            {
                
                base1+=polinomio.substring(contador,y);
            
            }
            
            if (variableP==true )//permite agregar a la variable
            {
                variable+=polinomio.substring(contador,y); 
            }
            
            if (exponenteP==true )//permite agregar al exponente
            { 
                exponente1+=polinomio.substring(contador,y);
            }
            
            if (lista==true && siguienteNodo==true)//Permite agrregar a la lista 1
            {
                base= Integer.parseInt(base1);
                exponente=Integer.parseInt(exponente1);
                lista1.insertar(new Monomio(base, variable, exponente));  
                siguienteNodo=false;
                exponenteP=false;
                baseP=true;
                if (polinomio.substring(contador,y).equals("-"))
                {
                    base1="-";
                    variable="";
                    exponente1="";
                }
                else
                {
                    base1="";
                    variable="";
                    exponente1="";
                }
            }
            if (lista==false && siguienteNodo==true || y==polinomio.length())//Permite agrregar a la lista 1
            {
                base= Integer.parseInt(base1);
                exponente=Integer.parseInt(exponente1);
                 
                siguienteNodo=false;
                exponenteP=false;
                baseP=true;
                if (polinomio.substring(contador,y).equals("-"))
                {
                    base1="-";
                    variable="";
                    exponente1="";
                }
                else
                {
                    base1="";
                    variable="";
                    exponente1="";
                }
            }
            contador++; // permite llevar el control de los elementos que se agregaran al monomio
        } 
    }
    
    public void obtenerDatosLista1(int base, String variable, int exponente){
    lista1.insertar(new Monomio(base, variable, exponente)); 
    lista1.mostrar();
    }
    
    public void obtenerDatosLista2(int base, String variable, int exponente){
    lista2.insertar(new Monomio(base, variable, exponente)); 
    }
    
    public Lista obtenerLista1()
    {
        return lista1;
    } 
    
    public Lista obtenerLista2()
    {
        return lista2;
    }

    
}
