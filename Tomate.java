import ch.aplu.jgamegrid.*;
import java.awt.Color;

public class Tomate extends Geschoss 
{
    private int count=0;
    private int xHase;
    private int yHase;
    private int xStart=630;
    private int yStart=810;
    private boolean fertig=false;

    public Tomate(){
        super ("Bilder/tomate.png",2);
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

    }
    public void geheZu(int x,int y) {
        setOnTop();
        setActEnabled(true);
        xHase=x;
        yHase=y;
    }

    public boolean istAmZiel(){
        return false;
    }

    public void reagiereAufTreffer(Location loc){
        int x = loc.getX();
        int y = loc.getY();
        show(1);

    }
}