
/**
 * Write a description of class Polinomio here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Monomio
{
    private String base, variable, exponente;
   
    Monomio(String base, String variable, String exponente)
    {
        this.base=base;
        this.variable=variable;
        this.exponente=exponente;
    }
    
    public String toString()
    {
        return "  base"+getBase()+"  variable"+getVariable()+"  exponente"+getExponente();
    }
    
    public String getBase()
    {
        return base;
    }
    
    public void setBase(String base)
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
    
    public String getExponente()
    {
        return exponente;
    }
    
    public void setExponente(String exponente)
    {
        this.exponente=exponente;
    }
}
