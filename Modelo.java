
/**
 * Realiza las diferentes funciones que efectuan el programa
 * 
 * @author (James Araya, Andy Alvarado) 
 * @version (03)
 */
import javax.swing.JOptionPane; 
//Metodo de Excepciones
import java.io.*;
//Metodos de escritura
import java.io.FileWriter;
import java.io.PrintWriter;
//Metodos de lectura los datos
import java.io.FileReader;
import java.io.BufferedReader;
public class Modelo
{ 
    Lista lista1=new Lista();
    Lista lista2=new Lista();
    Lista lista3=new Lista();
    String polinomio;
    String operacion="";
    
    public  void LeerOperaciones()
    {   //Lee el archivo txt y los envia a la funcion separarPolinomio   
        FileReader archivo;
        BufferedReader lector;
        try
        {
            archivo = new FileReader("C:\\Users\\jamej\\Desktop\\Tarea-Programada-2\\Archivos.txt");
            if (archivo.ready())
            {
                lector = new BufferedReader(archivo);
                String archivoP; //Para Cuando se implemente a la funcion de polinomio
                while((archivoP = lector.readLine())!= null)
                {
                    polinomio=archivoP;
                    separarPolinomios(polinomio);
                    
                    
                    operarPolinomios();
                    
                    
                    
                    
                    lista1.limpiar();
                    lista2.limpiar();
                    lista3.limpiar();
                }
            }
            else
            {
                System.out.println("El archivo aun no esta listo ");
            }
        }
        catch(Exception e)
        {
            System.out.print("error" + e.getMessage());
        }
    }


    public void separarPolinomios(String polinomio1) 
    {   //Separa el String en monomios y en sus componentes
        //Variables que conceden permisos para acceder a la modificacion de listas o de Strings
        //**************************************************************************
        String polinomio=polinomio1;//"5X^2+3X^4|*|3X^1";
        int contador=0; //registra los caracteres en el sub string
        
        boolean vaciarBase=false;//nodo en el que se estara agregado el string
        boolean vaciarVariable=false;
        boolean vaciarExponente=false;
        
        String base1="";
        String variable="";
        String exponente1="";
        int  exponente;
        int base;
        
        boolean lista=true;
        boolean siguienteNodo=false;
        
        boolean baseP=true;
        boolean variableP=false;
        boolean exponenteP=false;
        
        boolean multiplicacion=false;
        boolean division=false;
        //**************************************************************************
        //Recorrido de Strings
        for(int y=1; y<=polinomio.length(); y++)
        {//"5x+3x+2x|*|5x+3x+2x"
            if(polinomio.substring(contador,y).equalsIgnoreCase("x") )
            {   
               variableP=true;//permite agregar la variable
               baseP=false;//impide el acceso a base
            }
            
            else if(polinomio.substring(contador,y).equals("+") || polinomio.substring(contador,y).equals("-") )
            {
                exponenteP=false;
                if (!(polinomio.substring(contador,y).equals("-") && base1.equals("")))
                {
                 siguienteNodo=true;//permite agregar al siguiente nodo
                }
            }
            
            else if(polinomio.substring(contador,y).equals("^"))
            {
                
                y++;
                contador++;
                variableP=false;//permite agregar la variable
                exponenteP=true;//permite agregar la variable
            }
            
            else if(polinomio.substring(contador,y).equals("|"))
            {
                exponenteP=false;
                if (polinomio.substring(contador+1,y+1).equals("+"))
                {
                    siguienteNodo=true;//permite agregar al siguiente nodo
                    y=y+2;
                    contador=contador+2;
                    exponenteP=false;
                    operacion="+"; 
                }
                else if (polinomio.substring(contador+1,y+1).equals("-"))
                {
                    siguienteNodo=true;//permite agregar al siguiente nodo
                    y=y+2;
                    contador=contador+2;
                    exponenteP=false;
                    operacion="-"; 
                }
            }
            
            else if(polinomio.substring(contador,y).equals("/")) 
            {
                siguienteNodo=true;//permite agregar al siguiente nodo
                y++;
                contador++;
                exponenteP=false;
                operacion="/"; 
                //Falta hacer recorrido
            }
            else if(polinomio.substring(contador,y).equals("*"))
            {
                siguienteNodo=true;//permite agregar al siguiente nodo
                y++;
                contador++;
                exponenteP=false;
                operacion="*"; 
            }
            
            if (baseP==true )//permite agregar a la base
            {
                
                base1+=polinomio.substring(contador,y);
            
            }
            
            if (variableP==true )//permite agregar a la variable
            {
                variable+=polinomio.substring(contador,y); 
            }
            
            if (exponenteP==true )//permite agregar al exponente
            { 
                exponente1+=polinomio.substring(contador,y);
            }
            
            if (lista==true && siguienteNodo==true)//Permite agrregar a la lista 1
            {
                base= Integer.parseInt(base1);
                exponente=Integer.parseInt(exponente1);
                lista1.insertar(new Monomio(base, variable, exponente));  
                siguienteNodo=false;
                exponenteP=false;
                baseP=true;
                if (polinomio.substring(contador,y).equals("-"))
                {
                    base1="-";
                    variable="";
                    exponente1="";
                }
                else
                {
                    base1="";
                    variable="";
                    exponente1="";
                }
                if (!(operacion.equals("")))
                {lista=false;}
            }
            if ((lista==false && siguienteNodo==true) || y==polinomio.length())//Permite agrregar a la lista 1
            {
                base= Integer.parseInt(base1);
                exponente=Integer.parseInt(exponente1);
                lista2.insertar(new Monomio(base, variable, exponente));  
                siguienteNodo=false;
                exponenteP=false;
                baseP=true;
                if (polinomio.substring(contador,y).equals("-"))
                {
                    base1="-";
                    variable="";
                    exponente1="";
                }
                else
                {
                    base1="";
                    variable="";
                    exponente1="";
                }
            }
            contador++; // permite llevar el control de los elementos que se agregaran al monomio
        } 
    }

    public void obtenerDatosLista1(int base, String variable, int exponente)
    {   //inserta los elementos en la primera lista
        lista1.insertar(new Monomio(base, variable, exponente)); 
        lista1.mostrar();
    }
    
    public void obtenerDatosLista2(int base, String variable, int exponente)
    {   //inserta los elementos en la primera lista
        lista2.insertar(new Monomio(base, variable, exponente)); 
        lista2.mostrar();
    }
    //************************************se pueden borrar despues
    public String operador()
    {
        return operacion;
    } 

    public void setOperador(String operacion){
        this.operacion=operacion;
    }

    public Lista obtenerLista1()
    {
        return lista1;
    } 

    public Lista obtenerLista2()
    {
        return lista2;
    }

    public int obtenerTamannio1(){
        return lista1.obtenerTamannio();
    }

    public int obtenerTamannio2(){
        return lista2.obtenerTamannio();
    }
    //********************************************************************************
    public void operarPolinomios()
    {
        Monomio[] vectorLista1=lista1.getData();
        Monomio[] vectorLista2=lista2.getData();
        int base=0;
        int exponente=0;
        String variable="";
        if (operacion.equals("*"))
        {
            for(int i=0;i<vectorLista1.length;i++)
            {
                for(int j=0;j<vectorLista2.length;j++){

                    base=vectorLista1[i].getBase()*vectorLista2[j].getBase();
                    variable=vectorLista1[i].getVariable();
                    exponente=vectorLista1[i].getExponente()+vectorLista2[j].getExponente();

                    lista3.insertar(new Monomio(base, variable, exponente)); 
                }
            }
        }
        else if (operacion.equals("/"))
        {

            for(int i=0;i<vectorLista1.length;i++)
            {
                for(int j=0;j<vectorLista2.length;j++){

                    base=vectorLista1[i].getBase()/vectorLista2[j].getBase();
                    variable=vectorLista1[i].getVariable();
                    exponente=vectorLista1[i].getExponente()-vectorLista2[j].getExponente();

                    lista3.insertar(new Monomio(base, variable, exponente)); 
                }
            }
        }
        else if(operacion.equals("+")){
            
            for(int i=0;i<vectorLista1.length;i++)
            {
                for(int j=0;j<vectorLista2.length;j++){
                    if((vectorLista1[i].getExponente()==vectorLista2[j].getExponente())){
                        base=vectorLista1[i].getBase()+vectorLista2[j].getBase();
                        variable=vectorLista1[i].getVariable();
                        exponente=vectorLista1[i].getExponente();
                        lista3.insertar(new Monomio(base, variable, exponente)); 
                    }
                }
            }
             Monomio[] vectorLista3=lista3.getData();
            for(int i=0;i<vectorLista1.length;i++)
            {
                    for(int k=0;k<vectorLista3.length;k++){
                        if(vectorLista1[i].getExponente()!=vectorLista3[k].getExponente()){
                            base=vectorLista1[i].getBase();
                            variable=vectorLista1[i].getVariable();
                            exponente=vectorLista1[i].getExponente();
                            lista3.insertar(new Monomio(base, variable, exponente)); 
                        }
                        if(vectorLista2[i].getExponente()!=vectorLista3[k].getExponente()){
                            base=vectorLista2[i].getBase();
                            variable=vectorLista2[i].getVariable();
                            exponente=vectorLista2[i].getExponente();
                            lista3.insertar(new Monomio(base, variable, exponente)); 
                        }
                    } 
            }

        }else if(operacion.equals("-")){
            vectorLista2[0].base=(-vectorLista2[0].getBase());  
            for(int i=0;i<vectorLista1.length;i++)
            {
                for(int j=0;j<vectorLista2.length;j++){
                    if((vectorLista1[i].getExponente()==vectorLista2[j].getExponente())){
                        base=vectorLista1[i].getBase()+vectorLista2[j].getBase();
                        variable=vectorLista1[i].getVariable();
                        exponente=vectorLista1[i].getExponente();
                        lista3.insertar(new Monomio(base, variable, exponente)); 
                    }
                }
            }
             Monomio[] vectorLista3=lista3.getData();
            for(int i=0;i<vectorLista1.length;i++)
            {
                    for(int k=0;k<vectorLista3.length;k++){
                        if(vectorLista1[i].getExponente()!=vectorLista3[k].getExponente()){
                            base=vectorLista1[i].getBase();
                            variable=vectorLista1[i].getVariable();
                            exponente=vectorLista1[i].getExponente();
                            lista3.insertar(new Monomio(base, variable, exponente)); 
                        }
                        if(vectorLista2[i].getExponente()!=vectorLista3[k].getExponente()){
                            base=vectorLista2[i].getBase();
                            variable=vectorLista2[i].getVariable();
                            exponente=vectorLista2[i].getExponente();
                            lista3.insertar(new Monomio(base, variable, exponente)); 
                        }
                    } 
            }

        }
        Monomio[] vectorLista3=lista3.getData();
        escribir(vectorLista3,vectorLista2,vectorLista1);
    }

    public Lista obtenerLista3()
    {

        return lista3;
    } 
    
    
    public void escribir(Monomio[] resultado,Monomio[] polinomio2,Monomio[] polinomio1)
    {
        String polinomio_1="",polinomio_2="",resultado1="";
        for(int y=0;y<polinomio1.length;y++)
        {
            polinomio_1+="+"+polinomio1[y].getBase()+polinomio1[y].getVariable()+"^"+polinomio1[y].getExponente();
        }
        for(int y=0;y<polinomio2.length;y++)
        {
            polinomio_2+="+"+polinomio2[y].getBase()+polinomio2[y].getVariable()+"^"+polinomio2[y].getExponente();
        }
        for(int y=0;y<resultado.length;y++)
        {
            resultado1+="+"+resultado[y].getBase()+resultado[y].getVariable()+"^"+resultado[y].getExponente();
        }
        FileWriter archivo = null;
        PrintWriter escritor = null;
        
        String resultadoFinal=polinomio_1 +operacion+ polinomio_2+" = "+resultado1;
        try
        {
            archivo = new FileWriter("C:\\Users\\jamej\\Desktop\\Tarea-Programada-2\\Resultado.txt",true);
            escritor = new PrintWriter(archivo);
            escritor.println(resultadoFinal);
            archivo.close();
        }
        catch(IOException e)
        {
            System.out.println(e.getMessage());
        }
        
    }
}
