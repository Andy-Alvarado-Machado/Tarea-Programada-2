
/**
 * separa los String y agraga elementos a la lista
 * 
 * @author (James y Andy) 
 * @version (000001)
 */
public class Control2
{
    public static void main(String args[])
    {
        String polinomio="4X^2+3X^3-5X^1/3X^2+2X^3";
        int contador=0; //registra los caracteres en el sub string
        
        int nodos=0;//nodo en el que se estara agregado el string
        
        String monomio="";//string donde se agregara el nodo
        boolean lista = false; //indica a que lista se agregaran los string
        
        boolean siguienteNodo=false; //le concede el permiso a l nodo para qgregar el string
        for(int y=0; y<polinomio.length(); y++)
        {
            if(polinomio.substring(contador,y).equals("+") || polinomio.substring(contador,y).equals("-"))
            {
                nodos+=1;   //Avanza al siguiente nodo
                siguienteNodo=true;
            }
            else if(polinomio.substring(contador,y).equals("/"))
            {
                lista=true; //Avanza a la siguiente lista
            }
            else if(polinomio.substring(contador,y).equals("*"))
            {
                lista=true; //Avanza a la siguiente lista
            }
            else
            {
                if( polinomio.substring(contador,y).equals("-"))
                {
                    monomio = monomio +"-"+ polinomio.substring(contador,y);    //reyena el string donde ira la lista con el negativo
                }
                else
                {
                     monomio = monomio + polinomio.substring(contador,y);    //reyena el string donde ira la lista
                }
            }
            
            if (lista==false && siguienteNodo==true)
            {
                siguienteNodo=false; //agregar el polinomio al nodo seleccionado
            }
            
            if (lista=true && siguienteNodo==true)
            {
                siguienteNodo=false; //agregar el polinomio al nodo seleccionado
            }
            if(polinomio.substring(contador,y).equals("+") || polinomio.substring(contador,y).equals("-"))
            {
                monomio=""; //vacia el string para volver a ser llenado en el siguiuente nodo
            }
            contador+=1;
        }
    }
}
