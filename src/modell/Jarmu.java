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
        if(isBeinditva()==true)
        {
            
        }
    }
    
    public void leallit()
    {
        if(isMegerkezett()==true)
        {
            
        }
        else if(tankol()==true)
        {
            
        }
    }
    
    //ha az autó leállt akkor lehet tankolni
    public boolean tankol()
    {
        return false;
    }
    
    
    public boolean halad()
    {
        return false;
    }
}


