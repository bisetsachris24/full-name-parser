package com.plularsight;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class covertStringtoDates {
    public static void main(String[] args) {
     //   String userInput;
        // DateTimeFormatter formatter;
        String myDate = "10/17/2022";

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDate aDate = LocalDate.parse(myDate, formatter);

        System.out.println(aDate);
    }
}
