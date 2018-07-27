package one.circles;

import java.awt.*;

public class Background {
    private Color currentColor;
    private int r;
    private int g;
    private int b;

    public Background (){
        this.currentColor= new Color(0,0,255);
        System.out.println(currentColor);
    }

    public Color getCurrentColor() {
        return currentColor;
    }

    public void changeColor () {
        this.r =  (int)(Math.random()*255);
        this.g =  (int)(Math.random()*255);
        this.b =  (int)(Math.random()*255);
    }

    public int getR (){return r;}
    public int getG (){return g;}
    public int getB (){return b;}
}
