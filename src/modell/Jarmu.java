package modell;

public abstract class Jarmu 
{
    private boolean beinditva;
    private boolean uzemanyag;
    private boolean megerkezett;

    public Jarmu(boolean beinditva, boolean uzemanyag, boolean megerkezett) 
    {
        this.beinditva = beinditva;
        this.uzemanyag = uzemanyag;
        this.megerkezett = megerkezett;
    }

    public boolean isBeinditva() {
        return beinditva;
    }

    public boolean isUzemanyag() {
        return uzemanyag;
    }

    public boolean isMegerkezett() {
        return megerkezett;
    }
    
    public void beindit()
    {
        String szoveg="";
        if(isBeinditva()==true)
        {
            szoveg="Beindítva!";
        }
    }
    
    public void leallit()
    {
        String szoveg="";
        if(isMegerkezett()==true)
        {
            szoveg="Megérkezett a motor leáll!";
        }
        else if(tankol()==true)
        {
            szoveg="Tankol a motor leáll!";
        }
    }
    
    public boolean tankol()
    {
        
        return false;
    }
    
    public boolean halad()
    {
        return false;
    }
}


