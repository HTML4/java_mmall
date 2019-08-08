package com.mmall.util;

import org.apache.commons.lang3.StringUtils;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

import java.util.Date;

public class DateTimeUtil {
    public static final String STANDARO_FORMAT = "yyyy-MM-dd HH:mm:ss";
    //joda -> time
    //str -> Date
    //Date -> str
    public static Date strToDate(String dateTimeStr, String formatStr){
        DateTimeFormatter dateTimeFormatter = DateTimeFormat.forPattern(formatStr);
        DateTime dateTime = dateTimeFormatter.parseDateTime(dateTimeStr);
        return dateTime.toDate();
    }

    public static String dateToStr(Date date, String formateStr) {
        if(date == null) {
            return StringUtils.EMPTY;
        }
        DateTime dateTime = new DateTime(date);
        return dateTime.toString(formateStr);
    }

    public static Date strToDate(String dateTimeStr){
        DateTimeFormatter dateTimeFormatter = DateTimeFormat.forPattern(STANDARO_FORMAT);
        DateTime dateTime = dateTimeFormatter.parseDateTime(dateTimeStr);
        return dateTime.toDate();
    }

    public static String dateToStr(Date date) {
        if(date == null) {
            return StringUtils.EMPTY;
        }
        DateTime dateTime = new DateTime(date);
        return dateTime.toString(STANDARO_FORMAT);
    }

//    public static void main(String[] args) {
//        System.out.println(DateTimeUtil.dateToStr(new Date(), "yyyy-MM-dd HH:mm:ss"));
//        System.out.println(DateTimeUtil.strToDate("2010-01-01 11:11:11", "yyyy-MM-dd HH:mm:ss"));
//    }
}
