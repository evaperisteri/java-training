package codeWarChallenges.divisibleByXAndY;

/**
 * Create a function that checks if a number n is divisible by two numbers x AND y.
 * All inputs are positive, non-zero numbers.
 *
 * Examples:
 * 1) n =   3, x = 1, y = 3 =>  true because   3 is divisible by 1 and 3
 * 2) n =  12, x = 2, y = 6 =>  true because  12 is divisible by 2 and 6
 * 3) n = 100, x = 5, y = 3 => false because 100 is not divisible by 3
 * 4) n =  12, x = 7, y = 5 => false because  12 is neither divisible by 7 nor 5
 */
public class Main {
    public static void main(String[] args) {
    long n = 3;
    long x = 1;
    long y = 3;
        System.out.println(isDivisible(n, x, y));
        System.out.println(isDivisible(12, 2, 6));
        System.out.println(isDivisible(100, 5, 3));
    }
    public static boolean isDivisible(long n, long x, long y) {
        return (n % x ==0 && n % y==0);
    }
}
