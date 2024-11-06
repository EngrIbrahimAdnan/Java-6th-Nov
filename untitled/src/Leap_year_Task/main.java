package Leap_year_Task;

import java.util.Scanner;

public class main {
    public static void checkLeapYear(int year) {
        if ((year % 4 == 0 && (year % 100 != 0 || year % 400 == 0))) {
            System.out.println("Yay! " + year + " is a Leap year.");
        } else {
            System.out.println(year + " is not a Leap year.");
        }
    }

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int userNumber = 0;
        boolean isValid = false;//false by default

        //Ensures only numbers are entered
        while (!isValid) {
            System.out.println("Enter year:");
            try {
                userNumber = myScanner.nextInt();  // Try to read an integer
                isValid = true;  // Exit loop if input is an integer
            } catch (Exception e) {//if an error is caught, "isValid = true" is skipped and isValid remains false
                System.out.println("Invalid input. Please enter a valid year.");
                myScanner.next();  // Clear the invalid input
            }
        }
        myScanner.close();
        checkLeapYear(userNumber);

// ------------------------- TESTING SECTION -------------------------
// Uncomment the following code to test the checkLeapYear function with sample years
// int[] testYears = {1700, 1800, 1900, // not leap years
//                    2004, 2008, 2012}; // leap years
//
// for (int year : testYears) {
//     checkLeapYear(year); // Call the method to check each year
// }
// -------------------------------------------------------------------

    }
}