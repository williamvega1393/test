package controllers;

import models.PersonModel;
import views.detail.JFrameDetail;
import views.register.JFrameRegister;

import javax.swing.*;
import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class MainController {
    public MainController() {
    }

    public void getYears(JTextField jTextField) {
        GregorianCalendar calendar = new GregorianCalendar();
        System.out.println(calendar.getMaximum(Calendar.DAY_OF_MONTH));

        GregorianCalendar calendar1 = new GregorianCalendar(2001, Calendar.APRIL, 12);
        GregorianCalendar calendar2 = new GregorianCalendar();

        int diffYear = calendar2.get(Calendar.YEAR) - calendar1.get(Calendar.YEAR);
        System.out.println(diffYear);

        Period periodo = Period.between(convertToLocalDate(calendar1), convertToLocalDate(calendar2));
        jTextField.setText(periodo.getYears() + "");
    }

    private LocalDate convertToLocalDate(GregorianCalendar dateToConvert) {
        return dateToConvert.toZonedDateTime().toLocalDate();
    }

    public void showSelectetList(JList getjList) {
        System.out.println(getjList.getSelectedValue());
    }

    public void goToRegister(JFrameRegister jFrameRegister) {
        jFrameRegister.setVisible(true);
    }

    public void goToDetail(JFrameDetail jFrameDetail, PersonModel personModel) {
        jFrameDetail.setVisible(true);
        jFrameDetail.load(personModel);
    }
}
