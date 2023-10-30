package javaprogrammeweek8;

import java.util.Scanner;

/**
 * Display left angle triangle of * using nested for loops
 *   *
 *   * *
 *   * * *
 *   * * * *
 *   * * * * *
 */
public class Programme_15_LeftTriangle {
    // creating main method
    public static void main(String[] args) {
        // scanner declaration for reading the input from console
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter number of rows: ");// print the statement for user to enter the number of rows
        int n = sc1.nextInt();// storing the value into the integer which enter by user
        sc1.close(); // scanner closer
        // object creation for leftTriangle method
        Programme_15_LeftTriangle obj = new Programme_15_LeftTriangle();
        obj.leftTriangleStar(n); // calling leftTriangle method into the main method
    }
    // created another instance method with param
    public void leftTriangleStar(int a){
        // for loop
        for(int i = 1; i <= a; i++){
            for (int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
