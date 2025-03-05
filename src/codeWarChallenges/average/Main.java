package codeWarChallenges.average;

import java.util.Arrays;

/**
 * Write a function which calculates the average of the numbers in a given array.
 *
 * Note: Empty arrays should return 0.
 */
public class Main {
    public static void main(String[] args) {

    }

    public static double findAverage(int[] array) {
        double sum = 0.0;
        int count = 0;
        for (double d : array) {
            sum+=d;
            count++;
        }
        return sum/count;
    }

    //solution found online
    public static double find_average(int[] array){
        return Arrays.stream(array).average().orElse(0);
    }
}
