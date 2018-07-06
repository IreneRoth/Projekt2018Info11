import ch.aplu.jgamegrid.*;

public abstract class Geschoss extends Actor {
    
    public Geschoss (String datei) {
        super(datei);
    }
    public Geschoss(String datei, int anzahl){
        super(datei, anzahl);
    }
    
    public abstract void reagiereAufTreffer(Location loc);
    public abstract void geheZu(int x, int y);
    public abstract boolean istAmZiel();
}
