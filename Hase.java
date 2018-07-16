import ch.aplu.jgamegrid.*;

public class Hase extends Actor
{
    double jetztZahl;
    int Zahl;
    double vorherigeZahl;
    int richtung;
    public Hase () {
        super (true,"Bilder/hase klein.png");
    }
    /**public void Hasebewegen () {
        jetztZahl=0;
        gameGrid.delay(500);//250
        jetztZahl=Math.random()*10;
        Zahl=(int) jetztZahl;
        if (richtung==180) {
            setHorzMirror(false);
        }
        if (vorherigeZahl!=Zahl) {
            switch (Zahl) {
                case 1:
                setDirection(180);
                setHorzMirror(true);
                richtung=180;
                break;
                case 2:
                setDirection(180);
                setHorzMirror(true);
                richtung=180;
                break;
                case 3:
                setDirection(180);
                setHorzMirror(true);
                richtung=180;
                break;
                case 4:
                setDirection(270);
                break;
                case 5:
                setDirection(270);
                break;
                case 6:
                setDirection(270);
                break;
                case 7:
                setDirection(0);
                break;
                case 8:
                setDirection(0);
                break;
                case 9:
                setDirection(90);
                break;
                case 10:
                setDirection(90);
                break;
            }
        } else {
            if (isMoveValid()==true) {
                move();
            }
            vorherigeZahl=Zahl;
            Hasebewegen ();
        }
        if (isMoveValid()==true) {
            move();
        } else {
            if (getDirection()!=0) {
                setDirection(getDirection()-180);
            } else {
                setDirection(180);
                setHorzMirror(true);
            }
            if (getDirection()<0) {
                setDirection(270);
            }
            richtung=(int)getDirection();
            for (int i=1; i<=3;i++) {
                setDirection(0);
                delay(500);
                setDirection(richtung);
                move();
                setDirection(0);
            }
        }
        if (vorherigeZahl!=Zahl) {
            setDirection(0);
        }
        vorherigeZahl=jetztZahl;
        //Hasenspiel.x=getX();
        //Hasenspiel.y=getY();
        Hasebewegen ();
    }*/
    
    public void act() {
        jetztZahl=0;
        gameGrid.delay(500);//250
        jetztZahl=Math.random()*10;
        Zahl=(int) jetztZahl;
        if (richtung==180) {
            setHorzMirror(false);
        }
        if (vorherigeZahl!=Zahl) {
            switch (Zahl) {
                case 1:
                setDirection(180);
                setHorzMirror(true);
                richtung=180;
                break;
                case 2:
                setDirection(180);
                setHorzMirror(true);
                richtung=180;
                break;
                case 3:
                setDirection(180);
                setHorzMirror(true);
                richtung=180;
                break;
                case 4:
                setDirection(270);
                break;
                case 5:
                setDirection(270);
                break;
                case 6:
                setDirection(270);
                break;
                case 7:
                setDirection(0);
                break;
                case 8:
                setDirection(0);
                break;
                case 9:
                setDirection(90);
                break;
                case 10:
                setDirection(90);
                break;
            }
        } else {
            if (isMoveValid()==true) {
                move();
            }
            vorherigeZahl=Zahl;
            //Hasebewegen ();
        }
        if (isMoveValid()==true) {
            move();
        } else {
            if (getDirection()!=0) {
                setDirection(getDirection()-180);
            } else {
                setDirection(180);
                setHorzMirror(true);
            }
            if (getDirection()<0) {
                setDirection(270);
            }
            richtung=(int)getDirection();
            for (int i=1; i<=3;i++) {
                setDirection(0);
                delay(500);
                setDirection(richtung);
                move();
                setDirection(0);
            }
        }
        if (vorherigeZahl!=Zahl) {
            setDirection(0);
        }
        vorherigeZahl=jetztZahl;
    }
}