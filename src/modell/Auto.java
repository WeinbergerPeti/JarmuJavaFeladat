package modell;

public class Auto extends Jarmu
{
    private boolean defekt;

    public Auto(boolean defekt, boolean beinditva, boolean uzemanyag, boolean megerkezett) 
    {
        super(beinditva, uzemanyag, megerkezett);
        this.defekt = defekt;
    }

    public boolean isDefekt() 
    {
        return defekt;
    }
    
    public void kereketCserel()
    {
        if(isDefekt()==true)
        {
            
        }
    }
    
    public boolean halad()
    {
        return false;
    }
}
