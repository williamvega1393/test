package views.main;

import controllers.MainController;
import models.PersonModel;

import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainListener implements ActionListener, ListSelectionListener {
    private JFrameMain jFrameMain;
    private MainController mainController;

    public MainListener(JFrameMain jFrameMain) {
        this.jFrameMain = jFrameMain;
        mainController = new MainController();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        ActionsMain actionsMain = ActionsMain.valueOf(e.getActionCommand());
        switch (actionsMain) {
            case SHOW -> mainController.getYears(jFrameMain.getjTextField());
            case SHOW_REGISTER -> mainController.goToRegister(jFrameMain.getjFrameRegister());
        }
    }

    @Override
    public void valueChanged(ListSelectionEvent e) {
        if (e.getSource() == jFrameMain.getjList()) {
            if (jFrameMain.getjList().getValueIsAdjusting()) {
                mainController.goToDetail(
                        jFrameMain.getjFrameDetail(),
                        (PersonModel) jFrameMain.getjList().getSelectedValue()
                );
            }
        }
    }
}
