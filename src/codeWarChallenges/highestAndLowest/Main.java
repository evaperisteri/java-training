package codeWarChallenges.highestAndLowest;

import static java.util.Arrays.stream;

/**
 * In this little assignment you are given a string of space separated numbers,
 * and have to return the highest and lowest number.
  * Examples
 * highAndLow("1 2 3 4 5") // return "5 1"
 * highAndLow("1 2 -3 4 5") // return "5 -3"
 * highAndLow("1 9 3 4 -5") // return "9 -5"
 * Notes
 * All numbers are valid Int32, no need to validate them.
 * There will always be at least one number in the input string.
 * Output string must be two numbers separated by a single space, and highest number is first.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(highAndLow("1 2 3 4 5"));
        System.out.println(highAndLow("1 2 -3 4 5"));
        System.out.println(highAndLow("1 9 3 4 -5"));
    }

    public static String highAndLow(String numbers) {

        String[] newStr;
        newStr = numbers.split("\\s");
        int[] arr = new int[newStr.length];
        for(int i =0; i<newStr.length;i++){

            arr[i] = Integer.parseInt(newStr[i]);
        }
        Integer high;
        Integer low;
        high = findMax(arr);
        low = findMin(arr);
        String result =  high.toString() + " " + low.toString();
        return result;
    }
//found this alternative method on codeWar solutions...
    static String highAndLow2(String numbers) {
        var stats = stream(numbers.split(" ")).mapToInt(Integer::parseInt).summaryStatistics();
        return stats.getMax() + " " + stats.getMin();
    }

    public static int findMax(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty");
        }

        int max = array[0]; // Start with the first element
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i]; // Update max if a larger value is found
            }
        }
        return max;
    }

    public static int findMin(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty");
        }

        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
}
