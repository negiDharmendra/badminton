import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class BadmintonGame extends JPanel {


    private final Ball ball;
    private final Racket racket;
    private static BadmintonGame badmintonGame;

    public BadmintonGame() {
        ball = new Ball(this);
        racket = new Racket();
        setBackground(Color.white);

        addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                racket.keyPressed(e);
            }

            @Override
            public void keyReleased(KeyEvent e) {
                racket.keyReleased();
            }
        });
        setFocusable(true);
    }

    private void move() throws InterruptedException {
        ball.move(racket.getBounds());
        racket.move(this.getWidth());
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2D = (Graphics2D) g;
        g2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        ball.paint(g2D);
        racket.paint(g2D, this.getHeight());

    }

    public static void main(String[] args) throws InterruptedException {
        JFrame frame = new JFrame("Badminton");
        badmintonGame = new BadmintonGame();
        frame.add(badmintonGame);
        frame.setSize(700, 600);
        frame.setResizable(false);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);


        String message = "Do you want to play";
        int playerResponse = JOptionPane.showConfirmDialog(null, message, "Start", JOptionPane.YES_NO_OPTION);

        if (playerResponse == 0)
            play();
        else
            System.exit(0);

    }

    private static void play() throws InterruptedException {
        while (true) {
            badmintonGame.move();
            badmintonGame.repaint();
            Thread.sleep(5);
        }
    }

    public void gameOver() throws InterruptedException {
        String message = "Game over";
        int playerResponse = JOptionPane.showConfirmDialog(null, message, "Game Over", JOptionPane.CLOSED_OPTION);

        if (playerResponse == 0)
            System.exit(1);
    }
}
