import java.awt.*;

public class Ball {
    private final BadmintonGame game;
    private int diameter = 30;
    private int x = 0;
    private int y = 0;
    private int pixelX = 1;
    private int pixelY = 1;
    public Ball(BadmintonGame game) {
        this.game = game;
    }



    void move() {
        if (x + pixelX < 0)
            pixelX = 1;
        if (x + pixelX > game.getWidth() - diameter)
            pixelX = -1;
        if (y + pixelY < 0)
            pixelY = 1;
        if (y + pixelY > game.getHeight()- diameter)
            pixelY = -1;
        x = x + pixelX;
        y = y + pixelY;

    }


    public void paint(Graphics2D g) {
        g.fillOval(x, y, diameter, diameter);
    }

}
