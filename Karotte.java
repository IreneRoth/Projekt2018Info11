import ch.aplu.jgamegrid.*;
import java.awt.Color;

public class Karotte extends Geschoss
{
    final static int START_X = 7;
    final static int START_Y = 9;
    private int count=0;
    //private int x;
    //private int y;
    //
    private int xHase;
    private int yHase;
    private int xStart=630;
    private int yStart=810;

    public Karotte(){
        super ("Bilder/karotte.png",2);
        show();
    }

    public void act() {
        fliegen();
        /**count++;
        if(count == 10){
        count=0;
        showNextSprite();
        }*/

    } 

    public void geheZu(int x,int y) {
        xHase=x;
        yHase=y;
        //Location location=gameGrid.toLocation(x,y);
        //setLocation(location);
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
    
    public void fliegen() {
        if (xHase!=xStart && yHase!=yStart) {
            if(xHase < xStart){
                xStart--;
            } else{
                xStart++;
            }

            if(yHase < yStart){
                yStart--;
            } else{
                yStart++;
            }
            delay(10);
            Location location=gameGrid.toLocationInGrid(xStart,yStart);
            setLocation(location);
        } 
        
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