package codeWarChallenges.stringEnding;

/**
 * Complete the solution so that it returns true if the first
 * argument(string) passed in ends with the 2nd argument (also a string).
  * Examples:
  * solution('abc', 'bc') // returns true
 * solution('abc', 'd') // returns false
 */
public class Main {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "bc";
        String s3 = "d";

        System.out.println(solution(s1, s2));
        System.out.println(solution(s1, s3));
    }

    public static boolean solution(String str, String ending) {

        return str.endsWith(ending);
    }

}
