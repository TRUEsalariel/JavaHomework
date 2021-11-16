package JavaHW.GuiApp.WindowParts;

import JavaHW.GuiApp.WindowParts.guiParts.GameControlArea;
import JavaHW.GuiApp.WindowParts.guiParts.GameInfoArea;
import JavaHW.GuiApp.WindowParts.guiParts.PlayerControlArea;
import JavaHW.GuiApp.WindowParts.guiParts.PlayerInfoArea;
import sun.security.mscapi.CPublicKey;

import javax.swing.*;
import java.awt.*;

import static java.awt.Color.RED;

public class GuiPanel extends JPanel {
    private GameControlArea gameControlArea;
    private PlayerInfoArea playerInfoArea;
    private GameInfoArea gameInfoArea;
    private PlayerControlArea playerControlArea;


    private JTextArea gameLog;
    private JScrollPane scrollLog;


       public GuiPanel() {
           prepare();
           createParts();
           prepareLogArea();

           add(gameControlArea);
           add(playerInfoArea);
           add(gameInfoArea);
           add(playerControlArea);
           add(scrollLog);
       }

    public void prepare(){
        setBackground(Color.RED);
        setLayout(new GridLayout(5 , 1));
    }

    public void prepareLogArea(){
        gameLog = new JTextArea("Game Log");
        scrollLog = new JScrollPane(gameLog);
    }
   public void createParts() {
       gameControlArea = new GameControlArea();
       playerInfoArea = new PlayerInfoArea();
       gameInfoArea = new GameInfoArea();
       playerControlArea = new PlayerControlArea();
   }

}
