package modell;

public class Auto extends Jarmu
{
    private boolean defekt;

    public Auto(boolean defekt) 
    {
        this.defekt = defekt;
    }

    public boolean isDefekt() {
        return defekt;
    }
    
    
    
    public void kereketCserel()
    {
        
    }
    
    public boolean halad()
    {
        return false;
    }
}
