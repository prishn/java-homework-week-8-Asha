package javaprogrammeweek8;

import java.util.Scanner;

/**
 * 6.Write a program in Java to display the pattern like a triangle with a number.   For eg.
 * Input number of rows: 10
 * Expected Output:
 * 1
 * 12
 * 123
 * 1234
 * 12345
 * 123456
 * 1234567
 * 12345678
 * 123456789
 * 12345678910
 */
public class Programme_6_NumberTriangle {

    public static void main(String[] args) {
        //Scanner declaration for reading input from console
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");// printing the statement for user to enter number for rows
        int num = sc1.nextInt();//storing the value into the integer which enter by user
        //if else condition
        if (num < 0) {
            System.out.println("Please enter a positive number");// if user send negative number than error message should display
        } else {
            //Object creation for method numTriangle
            Programme_6_NumberTriangle obj = new Programme_6_NumberTriangle();
            obj.numTriangle(num); // calling the method numTriangle(number) into the main method
        }
        sc1.close();//Close the scanner when done with it to free up resources
    }

    // Creating a instance method numTriangle with param no return type
    public void numTriangle(int number) {
        //for loop logic
        for (int a = 0; a <= number; a++) {
            for (int b = 0; b < a; b++) {
                System.out.print(b + 1); // printing in same line
            }
            System.out.println(); //move to next line after each row
        }
    }
}
