package codeWarChallenges.validBraces;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

/**
 * Write a function that takes a string of braces, and determines if the order of the braces is valid.
 * It should return true if the string is valid, and false if it's invalid.
 * This Kata is similar to the Valid Parentheses Kata, but introduces new characters:
 * brackets [], and curly braces {}. Thanks to @arnedag for the idea!
 * All input strings will be nonempty, and will only consist of parentheses,
 * brackets and curly braces: ()[]{}.

 * What is considered Valid?
 * A string of braces is considered valid if all braces are matched with the correct brace.
 */
public class Main {
    public static void main(String[] args) {
        String s1 = "(){}[]";
        String s2 = "([{}])";
        String s3 = "(}";
        String s4 = "[({})](]";
        String s5 ="[(])";
        System.out.println(isValid(s1));
        System.out.println(isValid(s2));
        System.out.println(isValid(s3));
        System.out.println(isValid(s4));
        System.out.println(isValid(s5));
    }

    public static boolean isValid(String braces) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < braces.length(); i++) {
            char currentChar = braces.charAt(i);

            if (currentChar == '(' || currentChar == '[' || currentChar == '{') {
                // Push opening braces onto the stack
                stack.push(currentChar);
            } else {
                // If the stack is empty, it means there's no matching opening brace
                if (stack.isEmpty()) {
                    return false;
                }

                // Check if the current closing brace matches the top of the stack
                char topChar = stack.pop();
                if ((currentChar == ')' && topChar != '(') ||
                        (currentChar == ']' && topChar != '[') ||
                        (currentChar == '}' && topChar != '{')) {
                    return false;
                }
            }
        }

        // If the stack is empty, all braces were matched correctly
        return stack.isEmpty();
    }
}
