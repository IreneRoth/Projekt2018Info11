import ch.aplu.jgamegrid.*;
import java.awt.Color;

public class GrosseKarotte extends Geschoss
{
    private int count=0;
    public GrosseKarotte(){
        super ("Bilder/grosseKarotte.png",2);
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
    }

    public boolean istAmZiel(){
        return false;
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