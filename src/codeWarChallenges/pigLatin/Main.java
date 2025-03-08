package codeWarChallenges.pigLatin;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * Move the first letter of each word to the end of it,
 * then add "ay" to the end of the word. Leave punctuation marks untouched.
 *
 * Examples
 * pigIt('Pig latin is cool'); // igPay atinlay siay oolcay
 * pigIt('Hello world !');     // elloHay orldway !
 */
public class Main {
    public static void main(String[] args) {
        String s1 = "Pig latin is cool";
        String s2 = "Hello world !";
        System.out.println(pigIt(s1));
        System.out.println(pigIt(s2));
    }
    public static String pigIt(String str) {
       String[] arr = str.split(" ");
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
              if (s.matches("[a-zA-Z]+")) {
                String pigS = s.substring(1) + s.charAt(0) + "ay";
                arr[i] = pigS;
            }
        }
        return String.join(" ", arr);
    }

    //alternatives found online
    public static String pigIt2(String str) {
        return str.replaceAll("(\\w)(\\w*)", "$2$1ay");
    }
    public static String pigIt3(String str) {
        return Arrays.stream(str.trim().split(" "))
                .map(v -> v.matches("[a-zA-Z]+") ? v.substring(1).concat(v.substring(0, 1)).concat("ay") : v)
                .collect(Collectors.joining(" "));
    }
}
