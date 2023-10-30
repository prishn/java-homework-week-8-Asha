package javaprogrammeweek8;

import java.util.Scanner;

/**
 * 9. Print the sequence 1 1 2 3 5 8 13 21 (Fibonacci number)
 */
public class Programme_9_FibonacciNumber {
    // Main method created
    public static void main(String[] args) {
        // object creation for method isFibonacciNumber
        Programme_9_FibonacciNumber obj = new Programme_9_FibonacciNumber();
        obj.isFibonacciNumber(); // Calling the IsFibonacciNumber into the main method via object
    }
    // public instance method creation
    public void isFibonacciNumber(){
        Scanner sc1 = new Scanner(System.in); // Scanner declaration for reading input from console
        System.out.print("Enter the Fibonacci number: "); // print the statement for user to enter the fibonacci number
        int fibonacciNumber = sc1.nextInt(); // Storing the value into the integer which enter by user
        int num1 = 0; // Initialize the first fibonacci sequence
        int num2 = 1; // Initialize the second fibonacci sequence
        int num3; // Declare a variable to store the next number
        //use the print only to print in same line
        System.out.print(num1 + " " + num2); // print the first two terms
        for (int i = 2; i< fibonacciNumber; i++){
            num3 = num1 + num2; // calculating the next number by adding the previous two numbers
            //use the print only to print in same line
            System.out.print(" " +num3);// print the next number
            num1 = num2;// update num1 to the value of num2
            num2 = num3;// update num2 to the value of num3
        }
        sc1.close();// close the scanner when done with it to free up the resources
    }
}
