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

        //use formatter for user input
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        //now to store the date with variable
        LocalDate reservationDate = LocalDate.parse(scnr.nextLine().trim(), formatter);

        // next we collect the number of tickets user reserved

        System.out.print("Number of tickets to preserve: ");
        int numTickets = scnr.nextInt(); // stores in int variable & scans the correct data type int

        // now we display inputs in desired formatting
        // ticket(s) reserved for (date) under (LastName, FirstName)

        System.out.println(numTickets + " tickets reserved for "
                + reservationDate + " under "
                + lastName + ", " + firstName + ".");




    }

}
