
/**
 * Inicializa la lista y sus diferentes metodos
 * 
 * @author (James Araya, Andy Alvarado) 
 * @version (04)
 */
import javax.swing.JOptionPane;
public class Lista
{

    Nodo inicio;
    Nodo fin;
    String Lista="";
    public Lista()
    {
        inicio= null;
        fin=null;
    }

    public boolean listVacia()
    {
        if (inicio==null)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public void insertar(Monomio dato)
    {
        Nodo actual;
        if (listVacia( ))
        {
            actual= new Nodo(dato,null);
            inicio=actual;
            fin=actual;
        }
        else
        {
            actual=new Nodo(dato, null); 
            fin.setSiguiente(actual);
            fin=actual;
        }
    }

    public void mostrar() 
    {
        if(listVacia())
        {
            System.out.print("lista Vacia");
            return;
        }
        else
        {
            Nodo temporal;
            temporal=inicio;
            while(temporal!=null)
            {
                Lista+= temporal.getDato().toString();
                temporal=temporal.getSiguiente();
            }
            JOptionPane.showMessageDialog(null,Lista);
        }
        Lista="";
    }

    public int obtenerTamannio(){
        int contador=0;
        Nodo temporal;
        temporal=inicio;
        while (temporal!=null)
        {
            contador++;
            temporal= temporal.getSiguiente();
        }

        return contador;
    }

    public Monomio[] getData(){

        int contador=0;

        Monomio[] vectorMonomios=new Monomio[obtenerTamannio()];
        Nodo temp=inicio;

        while (temp!=null)
        {
            vectorMonomios[contador]=temp.getDato();
            contador++;
            temp= temp.getSiguiente();
        }
        limpiar();
        return vectorMonomios;
    }

    public void limpiar(){
        inicio=null;
        fin=null;
    }

    public Nodo getInicio(){
        return this.inicio;
    }
}

