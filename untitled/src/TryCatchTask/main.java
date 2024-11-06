package TryCatchTask;
import java.util.Scanner;

public class main {
    public static boolean checkUserInput(String inputType, Scanner myScanner, String correctInput) {
        System.out.println("Enter " + inputType + ":"); // print input/password message
        String userInput = myScanner.nextLine(); // Try to read the input to username/password
        return userInput.equals(correctInput); // returns if there is a match
    }

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        String Username = "Ibrahim"; // correct username
        String Password = "Ibrahim"; // correct password
        String tryInput; // used to check if user wants to retry

        int tryLimit; // number of tries per loop
        boolean UsernameAttempt; // stores whether input username matches string "Username"
        boolean passwordAttempt; // stores whether input password matches string "Password"

        do {
            tryLimit=5;
            UsernameAttempt = checkUserInput("Username", myScanner, Username); // Get username from user

            // loops until try limit is reached
            do {
                try {
                    passwordAttempt = checkUserInput("Password", myScanner, Password); // Get password from user
                    if (tryLimit == 0) { // number of tries runs out
                        throw new Exception("Maximum attempts exceeded");
                    } else { // if there are still attempts remaining

                        // only true if both credentials are true
                        if (UsernameAttempt && passwordAttempt) {
                            System.out.println("Login successful!");
                        } else {
                            System.out.println("Login Failed!");
                            System.out.println("You have " + tryLimit + " more tries");
                            tryLimit--; // decrements attempt counter for next loop
                        }
                    }

                    // when try limit runs out, an exception is thrown out
                } catch (Exception e) {
                    System.out.println("Too many failed attempts");
                    break;
                }

            } while (!UsernameAttempt || !passwordAttempt); // Only false if both credentials are true

            do {
                System.out.println("Want to try again? Type 'Yes' or 'No'.");
                tryInput = myScanner.nextLine().toLowerCase();  // Read input from user

                // notifies user if neither options are provided
                if (!tryInput.equals("yes") && !tryInput.equals("no")) {
                    System.out.println("input not recongized");
                }
            }
            while (!tryInput.equals("yes") && !tryInput.equals("no"));

        }
        while (tryInput.equals("yes"));

        System.out.println("Goodbye");
        myScanner.close();
    }
}
