package JavaHW.GuiApp.WindowParts.guiParts;

import javax.swing.*;
import java.awt.*;

public class PlayerInfoArea extends JPanel {
    private String prefixHP = "Health: ";
    private String prefixStr = "Strength: ";
    private String prefixPosition = "Position: ";
    private JLabel playerHP;
    private JLabel playerStr;
    private JLabel playerPosition;

    public PlayerInfoArea(){
        setLayout(new GridLayout(4, 1));
        playerHP = new JLabel(prefixHP + "-");
        playerStr = new JLabel(prefixStr + "-");
        playerPosition = new JLabel(prefixPosition + "-:-");

        add(new JLabel("= Player Info =", SwingConstants.CENTER));
        add(playerHP);
        add(playerStr);
        add(playerPosition);
    }
}
