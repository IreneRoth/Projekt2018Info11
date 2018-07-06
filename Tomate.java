import ch.aplu.jgamegrid.*;
import java.awt.Color;

public class Tomate extends Geschoss 
{
    private int count=0;
    public Tomate(){
        super ("Bilder/tomate.png",2);
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
        Location location=gameGrid.toLocationInGrid(x,y);
        setLocation(location);
        System.out.println("CLICK" + x + " " + y);
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