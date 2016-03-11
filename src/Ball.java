import java.awt.*;

public class Ball {
    private final BadmintonGame game;
    private int diameter = 30;
    private int x = 0;
    private int y = 0;
    public Ball(BadmintonGame game) {
        this.game = game;
    }


    public void paint(Graphics2D g) {
        g.fillOval(x, y, diameter, diameter);
    }

}
