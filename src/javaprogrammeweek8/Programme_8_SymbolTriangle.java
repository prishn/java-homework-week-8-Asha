package javaprogrammeweek8;

import java.util.Scanner;

/**
 * Display right angle triangle of @ using nested for loops
 * @
 * @@
 * @@@
 * @@@@
 * @@@@@
 */
public class Programme_8_SymbolTriangle {
    public static void main(String[] args) {
        //Scanner declaration for reading input from console
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Input number of rows: ");// printing the statement for user to enter number for rows
//        int num = sc1.nextInt();
//        if (num < 0) {
//            System.out.println("Please enter a positive number");// if user send negative number than error message should display
//        } else {}
            //Object creation for method rightAngleTriangle
            Programme_8_SymbolTriangle obj = new Programme_8_SymbolTriangle();
            obj.rightAngleTriangle(sc1.nextInt());// calling the method rightAngleTriangle into the main method
        sc1.close();//Close the scanner when done with it to free up resources
    }
    // Creating a instance method rightAngleTriangle with param no return type
    public void rightAngleTriangle(int x) {
        //for loop logic
        for (int a = 0; a <= x; a++) {
            for (int b = 0; b < a; b++) {
                System.out.print("@");// printing in same line
            }
            System.out.println();//move to next line after each row
        }
    }
}
