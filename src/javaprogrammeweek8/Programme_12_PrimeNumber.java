package javaprogrammeweek8;

import java.util.Scanner;

/**
 * 12. Write a programme to input any number and check if it is prime or not.
 * (Prime number is a number that is greater than 1 and divided by 1 or itself only. In other words,
 * prime numbers can't be divided by other numbers than itself or 1.
 * For example 2, 3, 5, 7, 11, 13, 17.... are the prime numbers.)
 */
public class Programme_12_PrimeNumber {
    // Main method creation
    public static void main(String[] args) {
        // Scanner declaration for reading input from console
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number: ");// print the statement for user to enter nay number
        int a = sc.nextInt();// storing the value into the integer which enter by user
        sc.close();// close the scanner when done with ti to free up resources
        // nested if else condition and calling isPrimeNumber method into main method
        if (isPrimeNumber(a)){
            System.out.println(a + " is a prime number"); // valid output
        } else if(a <=1){
            System.out.println("Invalid input, please enter a positive number greater than 1 only");// error message
        }else{
            System.out.println(a + " is not a prime number"); // not prime number output
        }
    }
    // created another static method
    public static boolean isPrimeNumber(int num){
        if(num <=1){
            return false;
        }// for loop
        for (int i =2; i <= Math.sqrt(num); i++){      // formula to find out prime number or not
            if (num % i == 0){
                return false;
            }
        }
        return true;// return statement
    }
}




