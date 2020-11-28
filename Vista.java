
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
    Lista lista1 = new Lista();
    Lista lista2= new Lista();
    Modelo modelo = new Modelo();
    public String nombreArchivo()
    {
        String Archivos=JOptionPane.showInputDialog("Ingrese el nomre del archivo para escribir");
        return Archivos;

    }

    public int pedirOpcion()
    {
        int opcion=Integer.parseInt(JOptionPane.showInputDialog("        MENÚ         \n\n"
                    +" 1 - Ingresar manualmente\n"
                    +" 2 - Ingresar por medio de un archivo\n"));

        return opcion;
    }

    public String pedirString(){
        int respuesta=0,respuesta2=0;
        String operacion="", variable;
        int base,exponente;
        do{
            base=Integer.parseInt(JOptionPane.showInputDialog("Digite la base"));
            variable=JOptionPane.showInputDialog("Digite la variable");
            exponente=Integer.parseInt(JOptionPane.showInputDialog("Digite el exponente"));
            modelo.obtenerDatosLista1(base,variable,exponente);
            respuesta=Integer.parseInt(JOptionPane.showInputDialog("¿Desea agregar otro monomio?:\n1-Sí\n2-No")); 
        }while(respuesta==1);
        operacion=JOptionPane.showInputDialog("Digite la operacion");
        do{
            base=Integer.parseInt(JOptionPane.showInputDialog("Digite la base"));
            variable=JOptionPane.showInputDialog("Digite la variable");
            exponente=Integer.parseInt(JOptionPane.showInputDialog("Digite el exponente"));
            modelo.obtenerDatosLista2(base,variable,exponente); 
            respuesta2=Integer.parseInt(JOptionPane.showInputDialog("¿Desea agregar otro monomio?:\n1-Sí\n2-No"));
        }while(respuesta2==1);
        return operacion;
    }
}