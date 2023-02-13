package teszt;

import modell.Jarmu;
import modell.Auto;

class Hajo extends Jarmu{}

public class JarmuTeszt 
{
    public static void main(String[] args) 
    {
        new JarmuTeszt();
    }
    
    public JarmuTeszt()
    {
//        mintaSablonTeszt();
        haladAutoBeinditasNelkulTeszt();
        haladAutoBeinditassalTeszt();
        
        haladJarmuBeinditassalTeszt();
        haladJarmuBeinditasNelkulTeszt();
        
        haladJarmuUzemanyagNelkulTeszt();
    }
    
    private void mintaSablonTeszt()
    {
        int kapott = 7;
        int vart =4;
        assert kapott==vart : "nem egyenlőek";
    }

    private void haladAutoBeinditasNelkulTeszt() 
    {
        Auto auto = new Auto();
        boolean kapott = auto.halad();
        boolean vart = false;
        assert kapott == vart :"beindítás nélkül is haladt";
    }
    
    private void haladAutoBeinditassalTeszt() 
    {
        Auto auto = new Auto();
        auto.beindit();
        boolean kapott = auto.halad();
        boolean vart = true;
        assert kapott == vart :"Autó nem megy";
    }
    
    private void haladJarmuBeinditassalTeszt() 
    {
        Hajo hajo = new Hajo();
        hajo.halad();
        boolean kapott = hajo.halad();
        boolean vart = true;
        assert kapott == vart :"Jármű nem megy";
    }
    
    private void haladJarmuBeinditasNelkulTeszt() 
    {
        Hajo hajo = new Hajo();
        hajo.halad();
        boolean kapott = hajo.halad();
        boolean vart = false;
        assert kapott == vart :"beindítás nélkül is haladt";
    }

    private void haladJarmuUzemanyagNelkulTeszt() 
    {
        Hajo hajo = new Hajo();
        hajo.tankol();
        boolean kapott = hajo.tankol();
        boolean vart = false;
        assert kapott == vart :"Tankolás nélkül is haladt";
    }
}
