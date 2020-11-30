
/**
 * crea el nodo donde se almacenaran los datos temporalmente
 * 
 * @author (James Araya, Andy Alvarado) 
 * @version (05)
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
