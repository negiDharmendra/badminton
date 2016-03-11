import javax.swing.*;
import java.awt.*;

public class BadmintonGame extends JPanel {


    private final Ball ball;

    public BadmintonGame() {
        ball = new Ball(this);
        setBackground(Color.white);
    }

   private  void move (){
        ball.move();
    }

    @Override
    public void paint(Graphics g){
        super.paint(g);
        Graphics2D g2D= (Graphics2D) g;
        g2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
        ball.paint(g2D);

    }

    public static void main(String[] args) throws InterruptedException {
        JFrame frame = new JFrame("Badminton");
        BadmintonGame badmintonGame = new BadmintonGame();
        frame.add(badmintonGame);
        frame.setSize(700, 600);
        frame.setResizable(false);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        while (true){
            badmintonGame.move();
            badmintonGame.repaint();
            Thread.sleep(10);
        }

    }

}
