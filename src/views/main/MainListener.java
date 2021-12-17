package views.main;

import controllers.PersonController;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainListener implements ActionListener {
    private JFrameMain jFrameMain;
    private PersonController personController;

    public MainListener(JFrameMain jFrameMain) {
        this.jFrameMain = jFrameMain;
        personController = new PersonController();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        ActionsMain actionsMain = ActionsMain.valueOf(e.getActionCommand());
        switch (actionsMain) {
            case SHOW -> personController.getYears(jFrameMain.getjTextField());
        }
    }
}
