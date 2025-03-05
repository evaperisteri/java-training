package codeWarChallenges.haystack;

/**
 * Can you find the needle in the haystack?
 * Write a function findNeedle() that takes an array full of junk but containing one "needle"
 * After your function finds the needle it should return a message (as a string) that says:
 * "found the needle at position " plus the index it found the needle, so:
 * Example(Input --> Output)
 * ["hay", "junk", "hay", "hay", "moreJunk", "needle", "randomJunk"] --> "found the needle at position 5"
 */
public class Main {

    public static void main(String[] args) {
        Object[] haystack = new Object[]{"hay", "junk", "hay", "hay", "moreJunk", "needle", "randomJunk"};
        Object[] haystack1 = {"3", "123124234", null, "needle", "world", "hay", 2, "3", true, false};
        Object[] haystack2 = {"283497238987234", "a dog", "a cat", "some random junk", "a piece of hay", "needle", "something somebody lost a while ago"};
        Object[] haystack3 = {1,2,3,4,5,6,7,8,8,7,5,4,3,4,5,6,67,5,5,3,3,4,2,34,234,23,4,234,324,324,"needle",1,2,3,4,5,5,6,5,4,32,3,45,54};
        Object[] haystack4 = {"hay", "junk", "hay", "hay", "moreJunk", "needle", "randomJunk"};
        System.out.println(findNeedle(haystack));
        System.out.println(findNeedle(haystack1));
        System.out.println(findNeedle(haystack2));
        System.out.println(findNeedle(haystack3));
        System.out.println(findNeedle(haystack4));
    }

    public static String findNeedle(Object[] haystack) {
        String needle = "needle";
        for (int i = 0; i < haystack.length; i++) {
            if (haystack[i] instanceof String && haystack[i].equals(needle)) {
                return "found the needle at position " + i;
            }
        }
        return "needle not found";
    }
}
