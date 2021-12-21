import controllers.PersonController;
import views.main.JFrameMain;

public class Main {
    public static void main(String[] args) {
        PersonController personController = new PersonController();
        JFrameMain jFrameMain = new JFrameMain(personController);
        jFrameMain.setVisible(true);
    }
}
