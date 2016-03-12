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



    void move(Rectangle racketBound) throws InterruptedException {
        if (x + pixelX < 0)
            pixelX = 1;
        if (x + pixelX > game.getWidth() - diameter)
            pixelX = -1;
        if (y + pixelY < 0)
            pixelY = 1;
        if (y + pixelY > game.getHeight()- diameter)
            game.gameOver();
        if(collision(racketBound))
            pixelY = -1;
        x = x + pixelX;
        y = y + pixelY;

    }

    private boolean collision(Rectangle racketBounds) {
        return racketBounds.intersects(getBounds());
    }


    public void paint(Graphics2D g) {
        g.fillOval(x, y, diameter, diameter);
    }

    public Rectangle getBounds() {
        return new Rectangle(x,y,diameter,diameter);
    }
}
