package views.main;

import controllers.PersonController;
import views.detail.JFrameDetail;
import views.register.JFrameRegister;

import javax.swing.*;
import java.awt.*;

public class JFrameMain extends JFrame {

    private MainListener mainListener;
    private JTextField jTextField;
    private JButton jButton;
    private JButton jButtonRegister;
    private JFrameRegister jFrameRegister;
    private JFrameDetail jFrameDetail;
    private JList jList;
    private PersonController personController;

    public JFrameMain(PersonController personController) throws HeadlessException {
        this.personController = personController;
        mainListener = new MainListener(this);

        jFrameRegister = new JFrameRegister();
        jFrameDetail = new JFrameDetail(personController, this);

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

        jButtonRegister = new JButton("Register");
        jButtonRegister.setBounds(120, 120, 70, 30);
        jButtonRegister.addActionListener(mainListener);
        jButtonRegister.setActionCommand(ActionsMain.SHOW_REGISTER.toString());
        this.add(jButtonRegister);

        jList = new JList();
        DefaultListModel listModel = new DefaultListModel();
        personController.getPersons().forEach(personModel -> listModel.addElement(personModel));
        jList.setModel(listModel);
        jList.addListSelectionListener(mainListener);
        jList.setBounds(20, 160, 200, 200);
        this.add(jList);
    }

    public JTextField getjTextField() {
        return jTextField;
    }

    public JFrameRegister getjFrameRegister() {
        return jFrameRegister;
    }


    public JFrameDetail getjFrameDetail() {
        return jFrameDetail;
    }

    public JList getjList() {
        return jList;
    }

    public void reload() {
        DefaultListModel listModel = new DefaultListModel();
        personController.getPersons().forEach(personModel -> listModel.addElement(personModel));
        jList.setModel(listModel);
    }
}
