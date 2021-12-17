package views.main;

import javax.swing.*;
import java.awt.*;

public class JFrameMain extends JFrame {

    private MainListener mainListener;
    private JTextField jTextField;
    private JButton jButton;

    public JFrameMain() throws HeadlessException {
        mainListener = new MainListener(this);

        setLayout(null);
        this.setBounds(0, 0, 800, 600);
        this.setResizable(false);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);

        init();
    }

    private void init() {
        jTextField = new JTextField();
        jTextField.setBounds(20, 20, 120, 30);
        this.add(jTextField);

        jButton = new JButton("Sumar");
        jButton.setBounds(20, 120, 70, 30);
        jButton.addActionListener(mainListener);
        jButton.setActionCommand(ActionsMain.SHOW.toString());
        this.add(jButton);
    }

    public JTextField getjTextField() {
        return jTextField;
    }
}
