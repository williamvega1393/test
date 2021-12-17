package controllers;

import javax.swing.*;
import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class PersonController {
    public PersonController() {
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
}
