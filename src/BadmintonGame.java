import javax.swing.*;
import java.awt.*;

public class BadmintonGame extends JPanel {


    public BadmintonGame() {
        setBackground(Color.white);
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


    }

}
