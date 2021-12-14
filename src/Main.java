import Views.HomeView;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        HomeView homeView = new HomeView();
        homeView.setBounds(0,0,800,600);
        homeView.setVisible(true);
        homeView.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        homeView.setLocationRelativeTo(null);
    }
}
