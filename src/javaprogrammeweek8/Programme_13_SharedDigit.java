package javaprogrammeweek8;
/**
 * 13. Shared Digit
 * Write a method named hasSharedDigit with two parameters of type int.
 * Each number should be within the range of 10 (inclusive) - 99 (inclusive). If one of the numbers is not
 * within the range, the method should return false.
 * The method should return true if there is a digit that appears in both numbers, such as 2 in 12 and 23;
 * otherwise, the method should return false.
 * EXAMPLE INPUT/OUTPUT:
 * hasSharedDigit(12, 23); → should return true since the digit 2 appears in both numbers
 * hasSharedDigit(9, 99); → should return false since 9 is not within the range of 10-99
 * hasSharedDigit(15, 55); → should return true since the digit 5 appears in both numbers
 * NOTE: The method hasSharedDigit should be defined as public static
 */
public class Programme_13_SharedDigit {
    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12,23)); //should return true because 2 digit is shared
        System.out.println(hasSharedDigit(9, 99)); //should return false because 9 is less than number 10
        System.out.println(hasSharedDigit(15, 55));//should return true because 5 digit is shared
        System.out.println(hasSharedDigit(15, 95));//should return true because 5 digit is shared
        System.out.println(hasSharedDigit(25, 99));//should return false because all four digits are different
        System.out.println(hasSharedDigit(10, 99));//should return false because all four digits are different
        System.out.println(hasSharedDigit(19, 99));//should return true because 9 digit is shared
    }
    public static boolean hasSharedDigit(int a, int b){

        if((a < 10 || a > 99) || (b < 10 || b > 99)){
            return false;// numbers are not within the valid range
        } //logic
        int digitNum1 = a % 10;
        int digitNum2 = a / 10;
        int digitNum3 = b % 10;
        int digitNum4 = b / 10;
        return (digitNum1 == digitNum3 || digitNum1 == digitNum4 || digitNum2 == digitNum3 || digitNum2 == digitNum4);
    }
}
