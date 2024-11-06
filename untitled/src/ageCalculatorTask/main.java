package ageCalculatorTask;

import java.util.Scanner;
import java.time.Period;
import java.time.LocalDate;


public class main {

    public static int userInput(Scanner myScanner, int rangeFrom, int rangeTo, String inputType) {
        int userNumber = 0;
        boolean isValid = false; //false by default

        //Ensures only numbers are entered
        while (!isValid) {
            System.out.println("Enter "+inputType+":");
            try {
                userNumber = myScanner.nextInt();  // Try to read an integer
                if (userNumber >= rangeFrom && userNumber <= rangeTo){
                    isValid = true;  // Exit loop if input is an integer
                }
                else{
                    System.out.println("Invalid input. Please enter within the acceptable range.");
                }

            } catch (Exception e) {//if an error is caught, "isValid = true" is skipped and isValid remains false
                System.out.println("Invalid input. Please enter a valid input of "+inputType+".");
                myScanner.next();  // Clear the invalid input
            }
        }
        return userNumber;
    }

    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);

        int day = userInput(myScanner, 1, 31, "day" );
        int month = userInput(myScanner, 1, 12,"month");
        int year = userInput(myScanner, 1000, 2024,"year");

        myScanner.close();

        LocalDate birthDate = LocalDate.of(year, month, day);

        // Current date
        LocalDate currentDate = LocalDate.now();

        //time between
        Period age = Period.between(birthDate, currentDate);

        System.out.println(day + "/" + month + "/" + year);

        // Output the age in years, months, and days
        System.out.println("Age: " + age.getYears() + " years, "
                + age.getMonths() + " months, "
                + age.getDays() + " days");
    }
}
