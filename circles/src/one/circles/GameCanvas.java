package one.circles;

import javax.swing.*;
import java.awt.*;

public class GameCanvas extends JPanel {

    private Main mainWindow;
    private long lastFrameTime;
    private Background background;
    private int counter=0;

    GameCanvas(Main mainWindow) {
        this.mainWindow = mainWindow;
        lastFrameTime = System.nanoTime();
        this.background= new Background();
        setBackground(background.getCurrentColor());
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        long currentTime = System.nanoTime();
        float deltaTime = (currentTime - lastFrameTime) * 0.000000001f;
        lastFrameTime = currentTime;

        // friday magic
        try {
            Thread.sleep(16);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        mainWindow.onDrawFrame(this, g, deltaTime);

        if (counter==70){
            background.changeColor();
            setBackground(new Color(background.getR(), background.getG(), background.getB()));
            //System.out.println("Color is changed");
            //System.out.println("[r="+background.getR()+",g="+ background.getG()+",b="+ background.getB()+"]");
            counter=0;
        }
        counter++;

        repaint();
    }

    public int getLeft() { return 0; }
    public int getRight() { return getWidth() - 1; }
    public int getTop() { return 0; }
    public int getBottom() { return getHeight() - 1; }
}
