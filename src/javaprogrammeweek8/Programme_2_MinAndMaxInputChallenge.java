package javaprogrammeweek8;

import java.util.Scanner;

/**
 * 2. Read the numbers from the console entered by the user and print the minimum and maximum number
 * the user has entered.
 * -Before the user enters the number, print the message Enter number:
 * -If the user enters an invalid number, break out of the loop and print the minimum and maximum number.
 * Hint:
 * -Use an endless while loop.
 * -Create a class with the name MinAndMaxInputChallenge.
 */

public class Programme_2_MinAndMaxInputChallenge {
    // Main method created
    public static void main(String[] args) {
        //Object creation for method minAndMaxNumbers
        Programme_2_MinAndMaxInputChallenge obj = new Programme_2_MinAndMaxInputChallenge();
        obj.minAndMaxNumbers(); // calling the minAndMaxNumbers method into the main method via object
    }

    // public instance method creation
    public void minAndMaxNumbers() {
        Scanner sc = new Scanner(System.in); //Scanner declaration for reading input from console
        int min = Integer.MAX_VALUE; // set the min to the max possible value initially
        int max = Integer.MIN_VALUE; // set the max to the min possible value initially
        boolean firstNumber = true;

        // while loop
        while (true) {
            System.out.println("Enter the number: ");// printing the statement for user to enter numbers
            boolean isAnInt = sc.hasNextInt(); ////checking enter number is int data type or not

            if (isAnInt) {
                int num = sc.nextInt();//storing the value into the integer which enter by user

                if (firstNumber) {
                    firstNumber = false;
                    min = num;
                    max = num;
                } else {
                    if (num > max) {
                        max = num;
                    }
                    if (num < min) {
                        min = num;
                    }
                }
            } else {
                break;// exit the loop on invalid input
            }
        }
        if (firstNumber) {
            System.out.println("No valid numbers entered");
        } else {
            System.out.println("Minimum Number: " + min);
            System.out.println("Maximum Number: " + max);
        }
        sc.close();//Close the scanner when done with it to free up resources
    }
}
