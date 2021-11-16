package JavaHW.GuiApp.WindowParts.guiParts;

import javax.swing.*;
import java.awt.*;

public class GameInfoArea extends JPanel {
    private String prefixEnemyCount = "Enemies: ";
    private String prefixLevelGame = "Level: ";
    private String prefixSizeMap = "Size map: ";
    private JLabel enemyCount;
    private JLabel levelGame;
    private JLabel sizeMap;

    public GameInfoArea(){
        setLayout(new GridLayout(4, 1));
        enemyCount = new JLabel(prefixEnemyCount + "-");
        levelGame = new JLabel(prefixLevelGame + "-");
        sizeMap = new JLabel(prefixSizeMap + "-:-");

        add(new JLabel("= Game Info =", SwingConstants.CENTER));
        add(enemyCount);
        add(levelGame);
        add(sizeMap);
    }
}
