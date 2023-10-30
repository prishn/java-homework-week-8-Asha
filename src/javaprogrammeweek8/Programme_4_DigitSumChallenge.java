package javaprogrammeweek8;

import java.util.Scanner;

/**
 * 4. Digit Sum Challenge
 * Write a method with the name sumDigits that has one int parameter called number.
 * If the parameter is >= 10 then the method should process the number and return sum of all digits,
 * otherwise return -1 to indicate an invalid value.
 * The numbers from 0-9 have 1 digit so we don't want to process them; also we don't want to process negative numbers,
 * so also return -1 for negative numbers.
 * For example calling the method sumDigits(125) should return 8 since 1 + 2 + 5 = 8.
 * Calling the method sumDigits(1) should return -1 as per requirements described above.
 * Add some code to the main method to test out the sumDigits method to determine that it is working correctly for valid
 * and invalid values passed as arguments.
 * Hint: 	Use n % 10 to extract the least-significant digit.
 * Use n = n / 10 to discard the least-significant digit.
 * The method needs to be static
 * Create a class with the name DigitSumChallenge.
 */
public class Programme_4_DigitSumChallenge {
    // Main method created
    public static void main(String[] args) {
        //Scanner declaration for reading input from console
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter a number: "); // printing the statement for user to enter the number>10
        int number = sc1.nextInt(); //storing the value into the integer which enter by user
        //Calling the method sumDigits(number) should return -1
        int result = sumDigit(number);
        if (result == -1) {
            System.out.println("Invalid input"); // error message
        } else {
            System.out.println("Sum of digits is :" + result); // valid result printout
        }

        sc1.close();//Close the scanner when done with it to free up resources
    }

    //method with the name sumDigits that has one int parameter called number.
    public static int sumDigit(int number) {
        //The numbers from 0-9 and negative numbers,not processed so return -1
        if (number < 10 || number < 0) {
            return -1;
        }
        // while loop
        int sum = 0;
        while (number > 0) {
            //The code processes a number digit by digit, sums them,
            // and discards each digit as it's processed, ultimately calculating the sum of all the digits.
            int digit = number % 10; //get the last digit of number
            sum = digit + sum; // add the digit to the variable sum
            number = number / 10; // remove the last digit by dividing by 10
        }
        return sum; //return total sum
    }
}
