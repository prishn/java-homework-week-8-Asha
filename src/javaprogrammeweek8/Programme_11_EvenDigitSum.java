package javaprogrammeweek8;

import java.util.Scanner;

/**
 * 11.	Even Digit Sum
 * Write a method named getEvenDigitSum with one parameter of type int called number.
 * The method should return the sum of the even digits within the number.
 * If the number is negative, the method should return -1 to indicate an invalid value.
 * EXAMPLE INPUT/OUTPUT:
 * getEvenDigitSum(123456789); → should return 20 since 2 + 4 + 6 + 8 = 20
 * getEvenDigitSum(252); → should return 4 since 2 + 2 = 4
 * getEvenDigitSum(-22); → should return -1 since the number is negative NOTE:
 * The method getEvenDigitSum should be defined as public static
 */
public class Programme_11_EvenDigitSum {
    // Main method creation
    public static void main(String[] args) {
        //Scanner declaration for reading input from console
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter a number: ");// Print the statement for user to enter the number to find out sum of even number
        int number = sc1.nextInt();// storing the value into the integer which enter by user
        sc1.close();//Close the scanner when done with it to free up resources

        int evenSum = getEvenDigitSum(number);// calling the getEvenDigitSum into the main method
        System.out.println("Sum of even digit in " + number + " is: " + evenSum); // concatenation for output
    }

    //method named getEvenDigitSum with one parameter of type int called number.
    public static int getEvenDigitSum(int num) {
        if (num < 0) {
            return -1; // neg numbers as invalid input
        }
        //while loop
        int sum = 0;// initialise value to  variable sum as 0
        while (num > 0) {
            int digit = num % 10;// get the last digit of number
            if (digit % 2 == 0) {// formula for even digit
                sum = sum + digit;// add the digit to the variable sum
            }
            num = num / 10;// remove the last digit by dividing by 10
        }
        return sum; // calculate the sum of even digit
    }
}
