package org.example.secondmodule.secondmodulefirsttask;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class WorkingWithDates {

    public static List<String> creatingNewListOfDates(List<String> list) {

        List<String> newDatesFormat = list.stream()
                .filter(s -> s.matches("[0-9]+[-/][0-9]+[-/][0-9]+"))
                .map(WorkingWithDates::convertDateFormat)
                .collect(Collectors.toList());

        return newDatesFormat;
    }

    public static String convertDateFormat(String s) {

        String newDate = "";
        if(s.contains("/")) {
            newDate = dateWithSlash(s);
        } else {
            newDate = dateWithDash(s);
        }

        return newDate;
    }

    public static String dateWithSlash(String s) {

        String result = "";
        String[] date = s.split("/");
        int lengthOfFirstElement = date[0].length();

        if(lengthOfFirstElement == 4) {
            result = date[0] + date[1] + date[2];
        } else {
            result = date[2] + date[1] + date[0];
        }

        return result;
    }

    public static String dateWithDash(String s) {
        String result = "";
        String[] date = s.split("-");

        result = date[2] + date[0] + date[1];

        return result;
    }

    public static List<String> creatingListOfDates() {
        List<String> list = new ArrayList<>();

        list.add("2008/12/31");
        list.add("08-15-2009");
        list.add("12/04/2012");
        list.add("2020/01/13");
        list.add("01-04-2005");
        list.add("31/08/2006");
        list.add("2012/05/07");
        list.add("2010/06/12");
        list.add("30/02/2016");
        list.add("04-10-2001");
        return list;
    }
}
