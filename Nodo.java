
/**
 * Write a description of class Nodo here.
 * En esta clase se la clase Nodo que es necesaria para las demás clases
 * @author Andy Alvarado Machado C00315 
 * @version 27/10/2020
 */
public class Nodo
{
    private Nodo siguiente;
    private Monomio dato;
    
    public Nodo(Monomio dato, Nodo siguiente)
    {
        this.siguiente = siguiente;
        this.dato = dato;
    }
    
    public Nodo getSiguiente()
    {
        return siguiente;
    }
    
    public void setSiguiente(Nodo siguiente)
    {
        this.siguiente = siguiente;
    }
    
    public Monomio getDato()
    {
        return dato;
    }
    
    public void getDato(Monomio dato)
    {
        this.dato = dato;
    }
}
