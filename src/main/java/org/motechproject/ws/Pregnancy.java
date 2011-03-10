package org.motechproject.ws;

import java.util.Calendar;
import java.util.Date;

public class Pregnancy {
    private Date deliveryDate;
    private Date thirdTrimesterBeginningDate;
    private Date secondTrimesterBeginningDate;
    private Calendar deliveryCalendar = Calendar.getInstance();

    public Pregnancy(Date deliveryDate) {
        this.deliveryDate = deliveryDate;
        this.thirdTrimesterBeginningDate = monthsFrom(-3);
        this.secondTrimesterBeginningDate = monthsFrom(-6);
        this.deliveryCalendar.setTime(deliveryDate);
    }

    public boolean inThirdTrimester(Date date) {
        return  date.after(thirdTrimesterBeginningDate) || thirdTrimesterBeginningDate.equals(date);
    }

    public boolean inSecondTrimester(Date date) {
        return (date.after(secondTrimesterBeginningDate) && date.before(thirdTrimesterBeginningDate)) ||
                secondTrimesterBeginningDate.equals(date)  ;
    }

    private java.util.Date monthsFrom(int difference) {
        Calendar instance = Calendar.getInstance();
        instance.setTime(deliveryDate);
        instance.add(Calendar.MONTH, difference);
        return instance.getTime();
    }

    @Override
    public boolean equals(Object obj) {
        Calendar oth = Calendar.getInstance();
        oth.setTime((Date) obj);

        int otherYear = oth.get(Calendar.YEAR);
        int otherMonth = oth.get(Calendar.MONTH);
        int otherDay = oth.get(Calendar.DAY_OF_MONTH);

        int year = deliveryCalendar.get(Calendar.YEAR);
        int month = deliveryCalendar.get(Calendar.MONTH);
        int day = deliveryCalendar.get(Calendar.DAY_OF_MONTH);

        return year == otherYear && month == otherMonth && day == otherDay;
    }

    @Override
    public int hashCode() {
        return deliveryDate.hashCode();
    }
}
