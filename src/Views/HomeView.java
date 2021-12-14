package Views;

import Controllers.HomeController;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HomeView extends JFrame implements ActionListener {

    private JTextField textField;

    private JLabel labelIn;
    private JLabel labelOut;
    private JLabel labelError;

    private JButton buttonAdd;
    private JButton buttonSub;

    private HomeController homeController;

    public HomeView() {
        setLayout(null);
        homeController = new HomeController();

        textField = new JTextField();
        textField.setBounds(20, 20, 120, 30);
        this.add(textField);

        labelIn = new JLabel("");
        labelIn.setBounds(20, 50, 60, 30);
        this.add(labelIn);

        labelError = new JLabel("");
        labelError.setBounds(150, 20, 60, 30);
        this.add(labelError);

        labelOut = new JLabel("Salida");
        labelOut.setBounds(20, 80, 60, 30);
        this.add(labelOut);

        buttonAdd = new JButton("Sumar");
        buttonAdd.setBounds(20, 120, 70, 30);
        buttonAdd.addActionListener(this);
        this.add(buttonAdd);

        buttonSub = new JButton("Restar");
        buttonSub.setBounds(100, 120, 70, 30);
        buttonSub.addActionListener(this);
        this.add(buttonSub);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        labelError.setText("");
        if (e.getSource() == buttonAdd) {
            try {
                int num = Integer.parseInt(textField.getText());
                homeController.add(num);
                labelIn.setText(labelIn.getText() + " + " + num);
                textField.setText("");
                labelOut.setText(homeController.getRes() + "");
            } catch (NumberFormatException numberFormatException) {
                labelError.setText("Valor no valido, ingresa un número entero");
            }
        }
        if (e.getSource() == buttonSub) {
            try {
                int num = Integer.parseInt(textField.getText());
                homeController.sub(num);
                labelIn.setText(labelIn.getText() + " - " + num);
                textField.setText("");
                labelOut.setText(homeController.getRes() + "");
            } catch (NumberFormatException numberFormatException) {
                labelError.setText("Valor no valido, ingresa un número entero");
            }
        }
    }
}
