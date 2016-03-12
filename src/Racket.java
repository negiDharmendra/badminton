import java.awt.*;
import java.awt.event.KeyEvent;

public class Racket {

    private int width = 100;
    private int height = 20;
    private int x = 0;
    private int pixelX = 0;
    private int y;

    void move(int courtWidth) {
        if (x + pixelX > 0 && x + pixelX < courtWidth - width)
            x = x + pixelX;

    }

    public void paint(Graphics g, int courtHeight) {
        y = courtHeight - this.height-10;
        g.fillRect(x, y, width, height);
    }


    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_LEFT)
            pixelX = -2;
        if (e.getKeyCode() == KeyEvent.VK_RIGHT)
            pixelX = 2;
    }

    public void keyReleased() {
        pixelX = 0;
    }
}
