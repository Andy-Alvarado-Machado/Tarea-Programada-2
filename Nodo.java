
/**
 * Write a description of class Nodo here.
 * En esta clase se la clase Nodo que es necesaria para las demás clases
 * @author Andy Alvarado Machado C00315 
 * @version 27/10/2020
 */
public class Nodo
{
    String informacion;
    Nodo siguienteNodo;
    //Se crea el constrcutor de la clase Nodo
    public Nodo(String valor)
    {
        this.informacion=valor;
        siguienteNodo=null;
    }
    
}
