package controllers;

import views.detail.JFrameDetail;
import views.main.JFrameMain;

public class DetailController {
    public DetailController() {
    }

    public void goToMain(JFrameDetail jFrameDetail) {
        jFrameDetail.setVisible(false);
    }

    public void goToMain(JFrameDetail jFrameDetail, JFrameMain jFrameMain) {
        jFrameMain.reload();
        jFrameDetail.setVisible(false);
    }
}
