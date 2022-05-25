package com.xxoo.utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DateUtil {

    /**
     * 获取某段时间的前一年时间
     */
    public String getOneYearDate() {
        SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, 2013);//年
        calendar.set(Calendar.MONTH, 9);//月
        calendar.set(Calendar.DAY_OF_MONTH, 9);//日
        calendar.add(Calendar.YEAR, -1);
        java.util.Date y = calendar.getTime();
        String year = format.format(y);
        return year;
    }
}
