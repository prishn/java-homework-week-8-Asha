package javaprogrammeweek8;

import java.util.Scanner;

/**
 * 5. Palindrome Number
 * Write a method called isPalindrome with one int parameter called number.
 * The method needs to return a boolean.
 * It should return true if the number is a palindrome number otherwise it should return false.
 * Check the tips below for more info about palindromes.
 * Example Input/Output
 * isPalindrome(-1221); → should return true
 * isPalindrome(707); → should return true
 * isPalindrome(11212); → should return false because the reverse is 21211 and that is not equal to  11212.
 * Tip: What is a Palindrome number? A palindrome number is a number which when reversed is equal  to the original number.
 * For example: 121, 12321, and 1001 etc.
 * Tip: Logic to check a palindrome number
 * Find the reverse of the given number. Store it in some variable, say reverse. Compare the number with the reverse.
 * If both are the same then the number is a palindrome otherwise it is not.
 * Tip: Logic to reverse a number
 * Declare and initialize another variable to store the reverse of a number, for example reverse = 0.
 * Extract the last digit of the given number by performing the modulo division (remainder).
 * Store the last digit to some variable say lastDigit = num % 10.
 * Increase the place value of reverse by one.
 * To increase place value multiply the reverse variable by 10 e.g. reverse = reverse * 10.  Add lastDigit to reverse.
 * Since the last digit of the number is processed, remove the last digit of num. To remove the last digit  divide number by 10.
 * Repeat steps until the number is not equal to (or greater than) zero.
 * A while loop would be good for this coding exercise.
 * Tip: Be careful with negative numbers. They can also be palindrome numbers.
 * Tip: Be careful with reversing a number, you will need a parameter for comparing a reversed number
 * with the starting number (parameter).
 * NOTE: The method isPalindrome needs to be defined as public static
 */
public class Programme_5_PalindromeNumber {
    // Main method created
    public static void main(String[] args) {
        //Scanner declaration for reading input from console
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number: ");// printing the statement for user to enter any number including negative numbers
        int number = sc.nextInt();//storing the value into the integer which enter by user

        //Calling the method isPalindrome(number)
        if (isPalindrome(number)) {
            System.out.println(number + " is a palindrome number"); // true result
        } else {
            System.out.println(number + " is not a palindrome number"); // false result
        }
        sc.close(); //Close the scanner when done with it to free up resources
    }

    //method with the name isPalindrome that has one int parameter called number.
    public static boolean isPalindrome(int number) {
        if (number < 0) {
            number = Math.abs(number); // convert negative number to positive for comparison
        }
        int num1 = number; // store the num1(original number) for comparison
        int reverse = 0; // initialise the variable reverse to store the reverse number and initially set as 0

        // while loop
        while (number > 0) {
            int lastDigit = number % 10; // get the last digit of number
            reverse = reverse * 10 + lastDigit;//get the reverse and multiply reverse with 10 and add last digit
            number = number / 10;// remove the last digit by dividing by 10
        }
        return num1 == reverse; // return original number is equable to reverse or not
    }
}


