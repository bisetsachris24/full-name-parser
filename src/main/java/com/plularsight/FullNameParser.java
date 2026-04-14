package com.plularsight;

import java.util.Scanner;

public class FullNameParser {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Prompt user
        System.out.print("Please enter your name: ");
        String fullName = scanner.nextLine().trim();

        // Split the name
        String[] parts = fullName.split(" ");

        String firstName = "";
        String middleName = "";
        String lastName = "";

        if (parts.length == 2) {
            firstName = parts[0];
            lastName = parts[1];
            middleName = "(none)";
        }
        else if (parts.length == 3) {
            firstName = parts[0];
            middleName = parts[1];
            lastName = parts[2];
        }
        else {
            System.out.println("Invalid name format.");
            return;
        }

        // Output
        System.out.println("First name: " + firstName);
        System.out.println("Middle name: " + middleName);
        System.out.println("Last name: " + lastName);


    }
}