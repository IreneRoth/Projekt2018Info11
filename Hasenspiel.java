
import ch.aplu.jgamegrid.*;
import java.awt.Color;
import java.awt.event.KeyEvent;


public class Hasenspiel extends GameGrid implements GGMouseListener, GGActorCollisionListener
{

    private GeschossTyp typ;
    
    public Hasenspiel () {
        super (14,10,90,Color.red,false);
        setGeschossTyp(GeschossTyp.NORMALE_KAROTTE);
        addMouseListener(this, GGMouse.lClick);
        simulationPeriod=10;
        doRun();
        // das ist ein Kommentar, um das GitHubRepository zu checken
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
            
          default:
            System.out.println("Oje der Computer ist kaputt das darf nicht passieren ");
            break;
        }
        return g;
    }
    
    public int collide(Actor actor1, Actor actor2){
        if(actor1 instanceof Hase && actor2 instanceof Geschoss){
            ((Geschoss) actor2).reagiereAufTreffer(actor2.getLocation());
            return 10;
        } else
        if(actor2 instanceof Hase && actor1 instanceof Geschoss){
            ((Geschoss) actor1).reagiereAufTreffer(actor1.getLocation());
            return 10;
        }
        // nach 10 zyklen wird der collision listener wieder aktiviert....
        return 0;
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