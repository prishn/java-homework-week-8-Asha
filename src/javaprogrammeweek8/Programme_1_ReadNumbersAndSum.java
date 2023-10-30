package javaprogrammeweek8;

import java.util.Scanner;

/**
 * 1. Read 10 numbers from the console entered by the user and print the sum of those numbers.
 * -Use the hasNextInt() method from the scanner to check if the user has entered an int value.
 * -If hasNextInt() returns false, print the message Invalid Number.
 * Continue reading until you have read 10 numbers.
 * -Use the nextInt() method to get the number and add it to the sum.
 * -Before the user enters each number, print the message Enter number #x:
 * where x represents the count, i.e. 1, 2, 3, 4, etc.
 * -For example, the first message printed to the user would be Enter number #1:,
 * the next Enter number #2:, and so on.
 * Hint:
 * -Use a while loop.
 * -Use a counter variable for counting valid numbers.
 * -Close the scanner after you don't need it anymore.
 * -Create a class with the name ReadingUserInputChallenge.
 */
public class Programme_1_ReadNumbersAndSum {
    //main method created
    public static void main(String[] args) {
        // object creation for method readAndSumNumbers
        Programme_1_ReadNumbersAndSum obj = new Programme_1_ReadNumbersAndSum();
        obj.readAndSumNumbers(); // calling the readAndSumNumbers method into the main method through the object
    }

    // public instance method creation
    public void readAndSumNumbers() {
        Scanner sc1 = new Scanner(System.in); //Scanner declaration for reading input from console
        int sum = 0; // set the sum value as zero as initially
        int count = 0; //set the count value as zero initially

        // while loop
        while (true) {
            int order = count + 1;
            System.out.println("Enter the number #" + order + ": ");// printing the statement for user to enter numbers
            boolean a = sc1.hasNextInt();//checking enter number is int data type or not
            //if-else statement
            if (a) {
                int number = sc1.nextInt(); //storing the value into the integer which enter by user
                count++;// increasing number by one
                sum += number; //calculating sum of numbers
                if (count == 10) {
                    System.out.println("Sum of the 10 numbers is: " + sum);
                    break; // exit from the loop when reach to 10 numbers
                }
            } else {
                System.out.println("Invalid Number");
                break; // Exit from the loop on invalid input
            }
        }
        sc1.close();//Close the scanner when done with it to free up resources
    }
}
