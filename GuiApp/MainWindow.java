package JavaHW.GuiApp;

import JavaHW.GuiApp.WindowParts.GameMap;
import JavaHW.GuiApp.WindowParts.GuiPanel;

import javax.swing.*;
import java.awt.*;



public class MainWindow extends JFrame {
    private int WindowWidth = 1024;
    private int WindowHeight = 768;
    private int WindowPosX = 300;
    private int WindowPosY = 100;
    private String WindowTitle = "Title";

    private GuiPanel guiPanel;
    private GameMap gameMap;


    MainWindow(){
        setupWindow();

        guiPanel = new GuiPanel();
        gameMap = new GameMap();

        add(gameMap);
        add(guiPanel, BorderLayout.EAST);

        setVisible(true);
    }

    private void setupWindow() {
        setSize(WindowWidth, WindowHeight);
        setLocation(WindowPosX, WindowPosY);
        setTitle(WindowTitle);
        setResizable(false);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
