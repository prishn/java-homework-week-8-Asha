package javaprogrammeweek8;

import java.util.Scanner;

/**
 * 3. Write a Java program that takes the user to provide a single character from the
 * alphabet. Print Vowel of Consonant, depending on the user input. If the user input
 * Is not a letter (between a and z or A and Z), or is a string of length > 1, print an
 * error message.
 * For eg:
 * Input an alphabet: p
 * Expected Output:
 * Input letter is Consonant
 */
public class Programme_3_FindVowelOrConsonant {
    // Main method created
    public static void main(String[] args) {
        //Object creation for method vowelOrConsonant
        Programme_3_FindVowelOrConsonant obj = new Programme_3_FindVowelOrConsonant();
        obj.vowelOrConsonant();// calling the vowelOrConsonant method into the main method via object
    }

    //public instance method creation
    public void vowelOrConsonant() {
        Scanner sc1 = new Scanner(System.in); //Scanner declaration for reading input from console
        System.out.println("Enter an alphabet: ");// printing the statement for user to enter alphabets
        String input = sc1.next().toLowerCase(); // converting into lowercase the string which enter by user

        // Retrieve the first character of the string and store it in the variable letter.
        char letter = input.charAt(0);
        // nested if else statement used
        if (input.length() > 1) { // condition
            System.out.println("Error. Not a single character"); // error message
            // Check if the first character of the input string is not a letter.
        } else if (!Character.isLetter(input.charAt(0))) {
            System.out.println("Error. Not a letter. Enter either uppercase or lowercase letter"); // error message
            // Check if the character letter is a vowel
        } else if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
            System.out.println("Input letter is vowel");// printout for vowel output
        } else {
            System.out.println("Input letter is consonant"); // Printout the consonant output
        }
        sc1.close();//Close the scanner when done with it to free up resources
    }
}
