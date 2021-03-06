/**
 * Almacena los datos de cada lista
 * 
 * @author (James Araya, Andy Alvarado) 
 * @version (05)
 */
public class Monomio
{
    private String variable;
     int base;
     int exponente;
   
    Monomio(int base, String variable, int exponente)
    {
        this.base=base;
        this.variable=variable;
        this.exponente=exponente;
    }
    
    public String toString()
    {
        return "+"+getBase()+getVariable()+"^"+getExponente();
    }
    
    public int getBase()
    {
        return base;
    }
    
    public void setBase(int base)
    {
        this.base=base;
    }
    
    public String getVariable()
    {
        return variable;
    }
    
    public void setVariable(String variable)
    {
        this.variable=variable;
    }
    
    public int getExponente()
    {
        return exponente;
    }
    
    public void setExponente(int exponente)
    {
        this.exponente=exponente;
    }
}
