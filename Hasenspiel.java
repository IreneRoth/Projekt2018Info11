
import ch.aplu.jgamegrid.*;
import java.awt.Color;
import java.awt.event.KeyEvent;


public class Hasenspiel extends GameGrid implements GGMouseListener
{
    
    //TODO: MausListener einbauen und dann noch die anderen Methoden aufrufen.
    //TODO: ok.
    private GeschossTyp typ;
    
    public Hasenspiel () {
        super (14,10,90,Color.red,false);
        setGeschossTyp(GeschossTyp.NORMALE_KAROTTE);
        addMouseListener(this, GGMouse.lClick);
        simulationPeriod=10;
        doRun();
    }
    
    public Hasenspiel(GeschossTyp typ){
        super (14,10,90,Color.red,false);
        setGeschossTyp(typ);
        addMouseListener(this, GGMouse.lClick);
        doRun();    
    }

    public Geschoss erstelleGeschossObjekt(){
        Geschoss g = null;
        switch (getGeschossTyp()){
            
          case NORMALE_KAROTTE:
            g = new Karotte();
            break;
            
            case TOMATE:
            g = new Karotte();
            break;
            
            case GROSSEKAROTTE:
            g = new Karotte();
            break;
            
          default:
            System.out.println("Oje der Computer ist kaputt das darf nicht passieren ");
            break;
        }
        return g;
    }
    
    
    public boolean mouseEvent(GGMouse mouse) {
        if (mouse.getEvent()==GGMouse.lClick) {
            Geschoss g = erstelleGeschossObjekt();
            addActor(g,new Location(7,9));
            //Location location=toLocationInGrid(mouse.getX(),mouse.getY());
            g.geheZu(mouse.getX(),mouse.getY());
        }
        return true;
    }
    
    public void starteSpiel(){
        Hase hase = new Hase();
        addActor(hase,new Location(7,5));
        show();
    }
    
    public void addTestKarotte(){    
        Karotte karotte = new Karotte();
        addActor(karotte,new Location(1,1));
    }
        
    
    
    //zum Testen
    public void addAddActor(Actor ac, int x, int y){
        addActor(ac,new Location(x,y));
        show();
    }

    public GeschossTyp getGeschossTyp(){
        return this.typ;
    }
    
    public void setGeschossTyp(GeschossTyp typ){
        this.typ = typ;
    }
    
    public static void main(String[] args)
    {
        new Hasenspiel();
    }
}