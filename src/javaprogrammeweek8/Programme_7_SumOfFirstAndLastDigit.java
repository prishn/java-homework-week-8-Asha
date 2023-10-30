package javaprogrammeweek8;

import java.util.Scanner;

/**
 * 7.First And Last Digit Sum
 * Write a method named sumFirstAndLastDigit with one parameter of type int called number.
 * The method needs to find the first and the last digit of the parameter number passed to the method,
 * using a loop and return the sum of the first and the last digit of that number.
 * If the number is negative then the method needs to return -1 to indicate an invalid value.
 * Example input/output
 * sumFirstAndLastDigit(252); →should return 4, the first digit is 2 and the last is 2 which gives us 2+2 and the sum is 4.
 * sumFirstAndLastDigit(257); →should return 9, the first digit is 2 and the last is 7 which gives us 2+7 and the sum is 9.
 * sumFirstAndLastDigit(0); → should return 0, the first digit and the last digit is 0 since we only have 1 digit,
 * which   gives us 0+0 and the sum is 0.
 * sumFirstAndLastDigit(5); → should return 10, the first digit and the last digit is 5 since we only have 1 digit,
 * which   gives us 5+5 and the sum is 10.
 * sumFirstAndLastDigit(-10); → should return -1, since the parameter is negative and needs to be positive.
 * NOTE: The method sumFirstAndLastDigit needs to be defined as public static
 */
public class Programme_7_SumOfFirstAndLastDigit {
    //Main method created
    public static void main(String[] args) {
        //Scanner declaration for reading input from console
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");// Printing the statement for user to enter the number
        int num1 = sc.nextInt();// storing the value into the integer which enter by user
        sc.close();//Close the scanner when done with it to free up resources

        int result = sumFirstAndLastDigit(num1);// calling the method sumFirstAndLastDigit into the main method
        // if else condition
        if (result == -1) {
            System.out.println("Invalid input. Please enter positive number"); // error message
        } else {
            System.out.println("Sum of the first and last digit number is: " + result);// valid output message
        }
    }

    //method named sumFirstAndLastDigit with one parameter of type int called number.
    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            return -1;// negative numbers are not allowed
        }
        int lastDigitNumber = number % 10;// get the last digit of number
        // while loop
        while (number >= 10) {
            number = number / 10; // remove the last digit by dividing by 10
        }
        int firstDigitNumber = number;// the remaining number is the first digit
        return firstDigitNumber + lastDigitNumber; // calculate the sum of first and last digit
    }
}
