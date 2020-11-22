
/**
 * Write a description of class Modelo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Modelo
{
    Cola cola = new Cola();
    Cola2 cola2 = new Cola2();
    Vista vista = new Vista();
    public void separarPolinomios()
    {
        String polinomio=vista.pedirPolinomio();//4x+3x*2x-4x
        int contador=0; //registra los caracteres en el sub string

        boolean vaciarMonomio=false;//nodo en el que se estara agregado el string

        String monomio="";//string donde se agregara el nodo
        boolean lista = false; //indica a que lista se agregaran los string, si está en false es Cola y si está en true es Cola2
        boolean multiplicacion=false,division=false;
        boolean siguienteNodo=false; //le concede el permiso al nodo para agregar el string
        for(int y=1; y<=polinomio.length(); y++)
        {
            if(polinomio.substring(contador,y).equals("+") || polinomio.substring(contador,y).equals("-"))
            {
                if( polinomio.substring(contador,y).equals("-") && monomio.equals(""))
                {monomio+="-";}
                else
                {
                    vaciarMonomio=true; //Avanza al siguiente nodo
                    siguienteNodo=true;
                }
            }
            else if(polinomio.substring(contador,y).equals("/"))
            {
                lista=true; //Avanza a la siguiente lista
                division=true;
                vaciarMonomio=true;
                siguienteNodo=true;
            }
            else if(polinomio.substring(contador,y).equals("*"))
            {
                lista=true; //Avanza a la siguiente lista
                multiplicacion=true;
                vaciarMonomio=true;
                siguienteNodo=true;
            }
            else
            {
                monomio +=polinomio.substring(contador,y);    //rellena el string donde ira la lista   
            }
            
            
            if (lista==false && siguienteNodo==true )
            {
                cola.agregarValor(monomio);//Agrega el monomio a la primera lista
                siguienteNodo=false; //agregar el polinomio al nodo seleccionado
            }

            if (lista=true && siguienteNodo==true || y==polinomio.length())
            {
                siguienteNodo=false; //agregar el polinomio al nodo seleccionado
                cola2.agregarValor(monomio);//Agrega el monomio a la segunda lista
            }
            if(vaciarMonomio==true && polinomio.substring(contador,y).equals("-") )
            {
                vaciarMonomio=false;
                monomio="-"; //vacia el string para volver a ser llenado en el siguiente nodo
            }
            else if(vaciarMonomio==true )
            {
                vaciarMonomio=false;
                monomio=""; //vacia el string para volver a ser llenado en el siguiente nodo
            }
            contador++;
        }       
    }     
}

