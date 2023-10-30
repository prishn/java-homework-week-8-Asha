package javaprogrammeweek8;

import java.util.Scanner;

/**
 * 14 Write a program in Java to display the pattern like a diamond.
 * While loop
 * <p>
 *        *
 *       ***
 *      *****
 *     *******
 *    *********
 *   ***********
 *  *************
 *   ***********
 *    *********
 *     *******
 *      *****
 *       ***
 *        *
 */
public class Programme_14_DiamondPattern {
    // creating main method
    public static void main(String[] args) {
        // Scanner declaration for reading input from console
        Scanner sc = new Scanner(System.in);
        // printing the statement for user to enter the number of rows to print diamond
        System.out.println("Enter the number of rows for the diamond: ");
        int n = sc.nextInt(); // storing the value into the integer which enter by user
        printDiamond(n);// calling the printDiamond method into the main method
        sc.close(); // closing scanner
    }
    // another static method created to print the diamond
    public static void printDiamond(int n){

        // upper half of the diamond
        int i = 1;
        while (i <= n){
            //print spaces
            int j = 1;
            while (j <= n - i){
                System.out.print(" ");
                j++;
            }

            // print asterisks
            j = 1;
            while (j <= 2 * i -1){
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }
        // lower half of the diamond
        i = n - 1;
        while (i >= 1){
            // print spaces
            int j = 1;
            while (j <= n - i){
                System.out.print(" ");
                j++;
            }
            // print asterisks
            j = 1;
            while (j <= 2 * i - 1){
                System.out.print("*");
                j++;
            }
            System.out.println();
            i--;
        }
    }
}