/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.minhquang.lab3testing2;

/**
 *
 * @author MinhQuang
 */
public class DateUtils {

    public static int dayInMonth(Integer month, Integer year) {
        int result = 0;
        if (month == null || year == null) {
            return 0;
        }
//        if (month > 12 || month < 1 || year > 3000 || year < 1000) {
//            return result;
//        }
        if ( month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            result = 31;
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            result = 30;
        } else if (month == 2) {
            if (year % 400 == 0) {
                result = 29;
            } else if (year % 100 == 0) {
                result = 28;
            } else if (year % 4 == 0) {
                result = 29;
            } else {
                result = 28;
            }
        }
        return result;
    }

    public static boolean checkDate(Integer year, Integer month, Integer day) {
        boolean check = false;
        if (year != null && month != null && day != null) {
            int maxDay = dayInMonth(month, year);
            if ( year >= 1000 && year <= 3000) {

                if (day > 0 && day <= maxDay) {
                    check = true;
                }
            }

        } 
        return check;
    }
}
