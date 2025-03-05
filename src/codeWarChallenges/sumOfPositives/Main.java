package codeWarChallenges.sumOfPositives;

import java.util.Arrays;

/**
 * You get an array of numbers, return the sum of all the positives ones.
 *
 * Example
 * [1, -4, 7, 12] =>
 * 1 + 7 + 12 = 20
 * 1+7+12=20
 * Note
 * If there is nothing to sum, the sum is default to 0.
 */
public class Main {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(sum(arr));
    }
    public static int sum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                sum = sum + arr[i];
            }
        }
        return sum;
    }
    //alternative found online
    public static int sum2(int[] arr){
        return Arrays.stream(arr).filter(v -> v > 0).sum();
    }
}

