
/**
 * Write a description of class Cola2 here.
 * En esta clase se desarrollan los metodos para una lista cola
 * @author Andy Alvarado Machado C00315 
 * @version 27/10/2020
 */
import javax.swing.JOptionPane;
public class Cola2
{
    private Nodo inicioCola,ultimoCola;
    String Cola2="";
    //Se crea el constrcutor de la clase Cola2
    public Cola2()
    {
        inicioCola=null;
        ultimoCola=null;
    }
    //Este metodo verifica si la lista de tipo cola está vacia
    public boolean colaVacia(){
        if(inicioCola==null){
            return true;

        }else{
            return false;
        }

    }
    //En este metodo se integra un valor a la lista de tipo cola, por lo cual irá de primero de izquierda a derecha
    public void insertar(String valor){
        Nodo nuevo=new Nodo(valor);  
        nuevo.valor=valor;
        nuevo.siguiente=null;
        if(colaVacia()){
            inicioCola=nuevo;
            ultimoCola=nuevo;

        }else{
            ultimoCola.siguiente=nuevo;
            ultimoCola=nuevo;

        }
    }
    //Este metodo muestra el contenido de la lista tipo cola
    public void mostrar(){
        Nodo recorrido = inicioCola;
        String colaInvertida="";
        while(recorrido != null){
            Cola2 += recorrido.valor+" ";
            recorrido = recorrido.siguiente;
        }
        String cadena [] = Cola2.split(" ");
        for(int i=cadena.length-1;i>=0;i--){
            colaInvertida+=" "+cadena[i];
        }
        JOptionPane.showMessageDialog(null,colaInvertida);
        Cola2="";
    }
}
