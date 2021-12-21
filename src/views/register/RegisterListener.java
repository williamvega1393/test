package views.register;

import controllers.RegisterController;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegisterListener implements ActionListener {
    private JFrameRegister jFrameRegister;
    private RegisterController registerController;

    public RegisterListener(JFrameRegister jFrameRegister) {
        this.jFrameRegister = jFrameRegister;
        registerController = new RegisterController();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        ActionsRegister actionsMain = ActionsRegister.valueOf(e.getActionCommand());
        switch (actionsMain) {
            case BACK -> registerController.goToMain(jFrameRegister);
        }
    }
}
