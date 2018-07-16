import ch.aplu.jgamegrid.*;
import java.awt.Color;

public class Karotte extends Geschoss
{
    final static int START_X = 7;
    final static int START_Y = 9;
    private int count=0;
    //private int x;
    //private int y;
    private int xHase;
    private int yHase;
    private int xStart=630;
    private int yStart=810;
    private boolean fertig=false;

    public Karotte(){
        super ("Bilder/karotte.png",2);
        show();
    }

    public void act() {
        if (fertig==true) {
            gameGrid.setSimulationPeriod(1);
            removeSelf();
        }
        if (xHase!=xStart) {
            if(xHase < xStart){
                xStart--;
            } else{
                xStart++;
            }
            //yStart=yStart-1;
            Location location=gameGrid.toLocationInGrid(xStart,yStart);
            setLocation(location);
            gameGrid.setSimulationPeriod(1);
        }
        if (yHase!=yStart) {
            if(yHase < yStart){
                yStart--;
            } else{
                yStart++;
            }
            Location location=gameGrid.toLocationInGrid(xStart,yStart);
            setLocation(location);
            gameGrid.setSimulationPeriod(1);
        }
        if (xHase==xStart && yHase==yStart) {
            if (yHase==yStart) {
                showNextSprite();
                fertig=true;
                gameGrid.setSimulationPeriod(500);
            }
        }
        
        /**count++;
        if(count == 10){
        count=0;
        showNextSprite();
        }*/

    }

    public void geheZu(int x,int y) {
        setOnTop();
        setActEnabled(true);
        xHase=x;
        yHase=y;
        //fliegen();
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

    }

    public boolean istAmZiel(){
        return true;
    }

    public void reagiereAufTreffer(Location loc){
        int x = loc.getX();
        int y = loc.getY();
        show(1);

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