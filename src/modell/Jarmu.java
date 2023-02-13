package modell;

public abstract class Jarmu 
{
    private boolean beinditva;
    private boolean uzemanyag;
    private boolean megerkezett;

    public Jarmu() 
    {
        this.beinditva = false;
        this.uzemanyag = true;
        this.megerkezett = false;
    }
    
    public void beindit()
    {

    }
    
    public void leallit()
    {

    }
    
    //ha az autó leállt akkor lehet tankolni
    public boolean tankol()
    {
        return false;
    }
    
    
    public boolean halad()
    {
        boolean siker = false;
        if(beinditva==true)
        {
            siker=true;
        }
        return siker;
    }
}


