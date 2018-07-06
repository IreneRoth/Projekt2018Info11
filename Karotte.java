import ch.aplu.jgamegrid.*;
import java.awt.Color;

public class Karotte extends Geschoss
{
    
    final static int START_X = 7;
    final static int START_Y = 9;
    private int count=0;
    private int xHase;
    private int yHase;
    private int xAbstand;
    private int yAbstand;

    public Karotte(){
        super ("Bilder/karotte.png",2);
        show();
    }

    
    public void act() {    
        count++;
        if(count == 10){
            count=0;
            showNextSprite();
        }

    } 

    public void geheZu(int x,int y) {
        Location location=gameGrid.toLocation(x,y);
        setLocation(location);
        /*if (START_X >= x) { 
        x = START_X-x;
        y= START_Y-y;
        } else {
        x = x-START_X;
        y = y-START_Y;
        }
        xAbstand=(int) x/y;
        yAbstand=(int) y/x;
        x=xAbstand;
        y=yAbstand;
        fliegen(x,y);
        }*/

        /*public void fliegen(int x, int y) {
        delay(100);
        xAbstand=xAbstand+x;
        yAbstand=yAbstand+y;
        Location location=gameGrid.toLocationInGrid(xAbstand,yAbstand);
        setLocation(location);
        if (xHase!=xAbstand && yHase!=yAbstand) {
        fliegen(x,y);
        }*/
    }

    public boolean istAmZiel(){
        return true;
    }

    public void reagiereAufTreffer(Location loc){
        int x = loc.getX();
        int y = loc.getY();
        show(1);

    }

    public void mouseTouched(Actor actor, GGMouse mouse, java.awt.Point spot)
    {

    }

    /**Location location = gameGrid.toLocationInGrid(mouse.getX(), mouse.getY());
    switch (mouse.getEvent())
    {
    case GGMouse.lPress:
    actor = gameGrid.getOneActorAt(location);
    break;
    case GGMouse.lDrag:
    if (actor != null)
    actor.setLocation(location);
    break;*/
}