package views.detail;

import controllers.PersonController;
import models.PersonModel;
import views.main.JFrameMain;

import javax.swing.*;
import java.awt.*;

public class JFrameDetail extends JFrame {
    private DetailListener registerListener;
    private JButton jButtonBack;
    private JButton jButtonDelete;
    private JTextField jTextFieldFirstName;
    private JTextField jTextFieldLastName;

    private PersonModel personModel;

    public JFrameDetail(PersonController personController, JFrameMain jFrameMain) throws HeadlessException {
        registerListener = new DetailListener(this, personController, jFrameMain);

        this.setLayout(null);
        this.setTitle("Detalle");
        this.setBounds(0, 0, 800, 600);
        this.setResizable(false);
        this.setLocationRelativeTo(null);

        jTextFieldFirstName = new JTextField();
        jTextFieldFirstName.setBounds(10, 10, 100, 30);
        this.add(jTextFieldFirstName);

        jTextFieldLastName = new JTextField();
        jTextFieldLastName.setBounds(10, 50, 100, 30);
        this.add(jTextFieldLastName);

        jButtonBack = new JButton("Back");
        jButtonBack.setBounds(10, 100, 100, 30);
        jButtonBack.setActionCommand(ActionsDetail.BACK.toString());
        jButtonBack.addActionListener(registerListener);
        this.add(jButtonBack);

        jButtonDelete = new JButton("Delete");
        jButtonDelete.setBounds(120, 100, 100, 30);
        jButtonDelete.setActionCommand(ActionsDetail.DELETE.toString());
        jButtonDelete.addActionListener(registerListener);
        this.add(jButtonDelete);
    }

    public void load(PersonModel personModel) {
        if (personModel != null) {
            this.personModel = personModel;
            jTextFieldFirstName.setText(personModel.getFirstName());
            jTextFieldLastName.setText(personModel.getLastName());
        }
    }

    public PersonModel getPersonModel() {
        return personModel;
    }
}
