import controllers.RegisterController;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Test extends JFrame implements ActionListener, ListSelectionListener {

    private JTextField textField;

    private JLabel labelIn;
    private JLabel labelOut;
    private JLabel labelError;

    private JButton buttonAdd;
    private JButton buttonSub;

    private RegisterController homeController;
    private JComboBox jComboBox;
    private JList<String> jList;
    private JScrollPane jScrollPane;

    public Test() {
        setLayout(null);
        homeController = new RegisterController();

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

        jComboBox = new JComboBox<Integer>();
        for (int i = 1871; i <= 2021; i++) {
            jComboBox.addItem(i);
        }
        jComboBox.setBounds(100, 160, 70, 30);
        jComboBox.addActionListener(this);
        jComboBox.setSelectedItem(2000);
        this.add(jComboBox);


        jList = new JList<>();
        DefaultListModel<String> model = new DefaultListModel();
        ArrayList<String> list = new ArrayList<>();
        list.add("B");
        list.add("A");
        list.add("D");
        list.add("C");
        list.sort((o1, o2) -> o1.compareTo(o2) * -1);
        list.forEach(model::addElement);
        jList.addListSelectionListener(this);
        jList.setModel(model);

        jScrollPane = new JScrollPane();
        jScrollPane.setBounds(100, 200, 200, 200);
        jScrollPane.setViewportView(jList);
        this.add(jScrollPane);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
//        labelError.setText("");
//        if (e.getSource() == buttonAdd) {
//            try {
//                int num = Integer.parseInt(textField.getText());
//                homeController.add(num);
//                labelIn.setText(labelIn.getText() + " + " + num);
//                textField.setText("");
//                labelOut.setText(homeController.getRes() + "");
//            } catch (NumberFormatException numberFormatException) {
//                labelError.setText("Valor no valido, ingresa un número entero");
//            }
//
//            int res = JOptionPane.showConfirmDialog(this, "Prueba", "Titulo de prueba", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
//            if (res == JOptionPane.NO_OPTION) {
//                labelOut.setText("No");
//            }
//            if (res == JOptionPane.YES_OPTION) {
//                labelOut.setText("Si");
//            }
//            if (res == JOptionPane.CLOSED_OPTION) {
//                labelOut.setText("Dialogo cerrado");
//            }
//        }
//        if (e.getSource() == buttonSub) {
//            try {
//                int num = Integer.parseInt(textField.getText());
//                homeController.sub(num);
//                labelIn.setText(labelIn.getText() + " - " + num);
//                textField.setText("");
//                labelOut.setText(homeController.getRes() + "");
//            } catch (NumberFormatException numberFormatException) {
//                labelError.setText("Valor no valido, ingresa un número entero");
//            }
//
//            jComboBox.removeAllItems();
//            for (int i = 0; i < 31; i++) {
//                jComboBox.addItem(i + 1);
//            }
//        }
//
//        if (e.getSource() == jComboBox) {
//            if (jComboBox.getSelectedItem() != null) {
//                labelIn.setText(jComboBox.getSelectedItem().toString());
//            }
//        }
    }

    @Override
    public void valueChanged(ListSelectionEvent e) {
        if (e.getSource() == jList) {
            String select = jList.getSelectedValue();
            textField.setText(select);
        }
    }
}
