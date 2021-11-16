package JavaHW.GuiApp.WindowParts.guiParts;

import javax.swing.*;
import java.awt.*;

public class PlayerControlArea extends JPanel {
    private JButton btnMoveUp;
    private JButton btnMoveDown;
    private JButton btnMoveLeft;
    private JButton btnMoveRight;

    public PlayerControlArea(){
        setLayout(new GridLayout(2, 3));
        btnMoveUp = new JButton("⤊");//\uD83E\uDC44-47
        btnMoveLeft = new JButton("⇚");
        btnMoveRight = new JButton("⇛");
        btnMoveDown = new JButton("⤋");

        add(new JPanel());
        add(btnMoveUp);
        add(new JPanel());
        add(btnMoveLeft);
        add(btnMoveDown);
        add(btnMoveRight);
    }
}
