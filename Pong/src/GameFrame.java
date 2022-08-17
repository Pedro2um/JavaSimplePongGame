import javax.swing.*;
import java.awt.*;

public class GameFrame extends JFrame {
    GamePanel panel;
    static final String GAME_NAME = "Pong Game";
    GameFrame(){
        panel = new GamePanel();
        this.add(panel);
        this.setTitle(GAME_NAME);
        this.setResizable(false);
        this.setBackground(Color.black);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }
}
