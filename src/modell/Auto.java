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
        String szoveg="";
        if(isDefekt()==true)
        {
            szoveg="Defekt! Kereket kell cserélni!";
        }
    }
    
    public boolean halad()
    {
        return false;
    }
}
