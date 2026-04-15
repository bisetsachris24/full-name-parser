package com.plularsight;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TheatherReservation {
    public static void main(String[] args) {

        Scanner theScanner = new Scanner(System.in);

        System.out.println("Please enter your name: ");
        String myName = theScanner.nextLine();
        String[] nameHolder = myName.split(" ");
        System.out.println(nameHolder[0]);
        System.out.println(nameHolder[1]);

        System.out.println("What date will you be coming (MM/dd/yyyy)");
        String myDate =theScanner.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDate showDate = LocalDate.parse(myDate, formatter);

        System.out.println(" How many tickets");
        int ticketsNums = theScanner.nextInt();
        if (ticketsNums>1){
            System.out.println(ticketsNums+ " tickets " +"reserved for "+ showDate+ " under " +nameHolder[1]+ ", "+ nameHolder[0]);

        }else {
            System.out.println(ticketsNums + " ticket " + "reserved for " + showDate + " under " + nameHolder[1]+", "+ nameHolder[0] );
        }

    }
}
