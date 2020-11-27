
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
    Lista lista = new Lista();
    Lista2 lista2 = new Lista2();
    public String nombreArchivo()
    {
        String Archivos=JOptionPane.showInputDialog("Ingrese el nombre del archivo para escribir");
        return Archivos;
    }

    public int menuOpciones()
    {
        int opcion=Integer.parseInt(JOptionPane.showInputDialog("        MENÚ         \n\n"
                    +" 1 - Ingresar una operacion a la hoja de calculos\n"
                    +" 2 - Imprimir los resultados de las operaciones\n"));

        return opcion;
    }

    public int opcionIngresar(){
        int opcionIngresar=Integer.parseInt(JOptionPane.showInputDialog("Elija la opción:\n1-Ingresar manualmente\n2-Ingresar por medio de un archivo"));
        return opcionIngresar;
    }

    public String pedirString(){
        int respuesta=0,respuesta2=0;
        String operacion="";
        do{
            String base="", variable="",exponente="";
            base=JOptionPane.showInputDialog("Digite la base");
            variable=JOptionPane.showInputDialog("Digite la variable");
            exponente=JOptionPane.showInputDialog("Digite el exponente");
            lista.insertar(new Monomio(base,variable,exponente));
            respuesta=Integer.parseInt(JOptionPane.showInputDialog("¿Desea agregar otro monomio?:\n1-Sí\n2-No"));
        }while(respuesta==1);
        operacion=JOptionPane.showInputDialog("Digite la operacion");
        do{
            String base="", variable="",exponente="";
            base=JOptionPane.showInputDialog("Digite la base");
            variable=JOptionPane.showInputDialog("Digite la variable");
            exponente=JOptionPane.showInputDialog("Digite el exponente");
            lista2.insertar(new Monomio(base,variable,exponente));
            respuesta2=Integer.parseInt(JOptionPane.showInputDialog("¿Desea agregar otro monomio?:\n1-Sí\n2-No"));
        }while(respuesta2==1);
        return operacion;
    }
}
