package JavaHW.GuiApp.WindowParts.guiParts;

import javax.swing.*;
import java.awt.*;

public class GameControlArea extends JPanel {
    private JButton btnStartGame;
    private JButton btnEndGame;


    public GameControlArea(){
        setLayout(new GridLayout(3, 1));
        btnStartGame = new JButton("Launcher Game");
        btnEndGame = new JButton("End Game");

        add(new JLabel("= Game Control =", SwingConstants.CENTER));
        add(btnStartGame);
        add(btnEndGame);
    }
}
