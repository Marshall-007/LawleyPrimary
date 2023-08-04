package com.bttp.pojo;

import java.util.Calendar;

public class Generator {

    public String currentDate() {
        Calendar now = Calendar.getInstance();
        int day = now.get(Calendar.DAY_OF_MONTH);
        int month = now.get(Calendar.MONTH);
        int year = now.get(Calendar.YEAR);
        String date = zero(day) + "/" + zero(month) + "/" + year;
        return date;
    }

    public String currentTime() {
        Calendar now = Calendar.getInstance();
        int hrs = now.get(Calendar.HOUR_OF_DAY);
        int min = now.get(Calendar.MINUTE);
        int sec = now.get(Calendar.SECOND);

        String time = zero(hrs) + ":" + zero(min) + ":" + zero(sec);

        return time;
    }

    public String zero(int num) {
        String number = (num < 10) ? ("0" + num) : ("" + num);
        return number;
    }
}