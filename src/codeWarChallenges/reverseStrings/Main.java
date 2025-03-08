package codeWarChallenges.reverseStrings;


/**
 * Complete the solution so that it reverses the string passed into it.
 *
 * 'world'  =>  'dlrow'
 * 'word'   =>  'drow'
 */
public class Main {
    public static void main(String[] args) {
        String s = "world";
        System.out.println(solution(s));
    }
    public static String solution(String str) {
        String[] arrS = new String[]{};
        arrS = str.split("");
        String[] arrReversed = new String[arrS.length];
        for (int i=arrS.length-1, j=0; i>= 0; i--, j ++) {
            arrReversed[j] = arrS[i];
        }

        return String.join("", arrReversed);
    }

    public static String solution2(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    public static String solution3(String str) {

        String newcad="";

        for(int i = str.length()-1; i >= 0; i--){
            newcad += str.charAt(i);
        }

        return newcad;
    }
}
