package views.detail;

import controllers.DetailController;
import controllers.PersonController;
import views.main.JFrameMain;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DetailListener implements ActionListener {
    private JFrameDetail jFrameDetail;
    private JFrameMain jFrameMain;
    private DetailController detailController;
    private PersonController personController;

    public DetailListener(JFrameDetail jFrameDetail, PersonController personController, JFrameMain jFrameMain) {
        this.jFrameDetail = jFrameDetail;
        this.jFrameMain = jFrameMain;
        this.personController = personController;
        detailController = new DetailController();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        ActionsDetail actionsMain = ActionsDetail.valueOf(e.getActionCommand());
        switch (actionsMain) {
            case BACK -> detailController.goToMain(jFrameDetail);
            case DELETE -> {
                personController.delete(jFrameDetail.getPersonModel());
                detailController.goToMain(jFrameDetail, jFrameMain);
            }
        }
    }
}
