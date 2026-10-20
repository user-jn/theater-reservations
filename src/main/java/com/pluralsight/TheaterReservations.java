package com.pluralsight;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
public class TheaterReservations {
    public static void main(String[] args) {
    Scanner scnr = new Scanner(System.in);

    System.out.println("*** Theater Reservations ***");

    //get inputs
    System.out.print("Enter your first & last name: ");
    String name = scnr.nextLine().trim();

    // Split the name wherever there is a space
        String[] nameParts = name.split("\\s+");

    // storing first and last name
        String firstName = nameParts[0];
        String lastName = nameParts[1];

        // ask for date and store input
        System.out.print("The date you'll be reserving (MM/dd/yyyy): ");






    }

}
