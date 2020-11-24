
/**
 * Write a description of class Controlador here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Controlador
{
    Modelo modelo = new Modelo();
    Cola cola= new Cola();
    Cola2 cola2= new Cola2();
    public void ejecutar(){
        modelo.separarPolinomios();
        cola.mostrar();
        cola2.mostrar();
    }
}
