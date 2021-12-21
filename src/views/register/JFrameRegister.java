package views.register;

import javax.swing.*;
import java.awt.*;

public class JFrameRegister extends JFrame {
    private RegisterListener registerListener;
    private JButton jButtonBack;

    public JFrameRegister() throws HeadlessException {
        registerListener = new RegisterListener(this);

        this.setLayout(null);
        this.setTitle("Register");
        this.setBounds(0, 0, 800, 600);
        this.setResizable(false);
        this.setLocationRelativeTo(null);

        jButtonBack = new JButton("Back");
        jButtonBack.setBounds(10, 10, 100, 30);
        jButtonBack.setActionCommand(ActionsRegister.BACK.toString());
        jButtonBack.addActionListener(registerListener);
        this.add(jButtonBack);

    }
}
