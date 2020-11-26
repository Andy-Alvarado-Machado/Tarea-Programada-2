public class Lista2 
{
    private Nodo inicio;
    private Nodo fin;

    public Lista2()
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

    public void insertar(Polinomio dato)
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
                System.out.print(temporal.getDato().toString());
                temporal=temporal.getSiguiente();
            }
        }
    }
}

