
/**
 * Write a description of class Modelo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Modelo
{
    Cola cola = new Cola();
    public void resta()
    { 
        String str = "4x-2x+3x^3-x^2-6x"; 
        String[] arreglo =str.split("-");
        
        for(int i=0;i<arreglo.length;i++){
        String a=arreglo[i];
        cola.insertar(a); 
        }
        cola.mostrar();
    } 
    
    public void divi_multi(){
      String X="4X^2-3X^3-5X^1/3X^2-2X^3";
        int Operadormultiplicar=0;
        int Operadordividir=0;
        boolean multiplicar=false;
        boolean dividir=false, resta=false;;
        String polinomio1="";
        String polinomio2="";
        if (X.contains("*")==true || X.contains("/")==true)
        {
            if (X.contains("*")==true)
            {
                multiplicar=true;
            }
            else
            {
                dividir=true;
            }
        }
        if (multiplicar==true)
        {
            Operadormultiplicar=X.indexOf("*");
            polinomio1=X.substring(0,(Operadormultiplicar));
            polinomio2=X.substring((Operadormultiplicar+1),X.length());
            System.out.println(polinomio1+"\n"+polinomio2 );
        }
        if (dividir==true)
        {
            Operadordividir=X.indexOf("/");
            polinomio1=X.substring(0,(Operadordividir));
            polinomio2=X.substring((Operadordividir+1),X.length());
            System.out.println(polinomio1+"\n"+polinomio2 );
        }
    
        }
    }

