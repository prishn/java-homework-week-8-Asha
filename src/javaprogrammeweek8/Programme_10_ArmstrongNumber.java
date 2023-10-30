package javaprogrammeweek8;

import java.util.Scanner;

/**
 * 10.Write a program to input any number and check if it Armstrong number or not
 * 153 = (1*1*1)+(5*5*5)+(3*3*3)
 * where:
 * (1*1*1)=1 (5*5*5)=125 (3*3*3)=27
 * So:
 * 1+125+27=153
 */
public class Programme_10_ArmstrongNumber {
    // Main method creation
    public static void main(String[] args) {
        // creating an object for isArmstrongNumber method
        Programme_10_ArmstrongNumber obj = new Programme_10_ArmstrongNumber();
        obj.isArmstrongNumber();// calling the isArmstrongNumber into the main method
    }

    // Instance method created
    public void isArmstrongNumber() {
        Scanner sc1 = new Scanner(System.in);//Scanner declaration for reading input from console
        System.out.println("Enter a number: "); // Print the statement for user to enter the number to find out armstrong number
        int number = sc1.nextInt(); // storing the value into the integer which enter by user
        sc1.close();//Close the scanner when done with it to free up resources

        int originalNumber = number; // store the original input number
        int numberOfDigits = String.valueOf(number).length(); // calculate the number of digits in the input number
        double sum = 0;// Initialize the sum to zero
        // while loop
        while (number > 0) {
            int digit = number % 10; // Extract the last digit from the number
            sum += Math.pow(digit, numberOfDigits);// add the cube of the digit to the sum
            number = number / 10; // remove the last digit from the number
        }
        // if else statement
        if (sum == originalNumber) {
            System.out.println(originalNumber + " is an Armstrong number");
        } else {
            System.out.println(originalNumber + " is not an Armstrong number");
        }
    }
}
