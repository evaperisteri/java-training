package codeWarChallenges.facebookLikesCount;

/**
 * You probably know the "like" system from Facebook and other pages. People can "like" blog posts,
 * pictures or other items. We want to create the text that should be displayed next to such an item.
 *
 * Implement the function which takes an array containing the names of people that like an item.
 * It must return the display text as shown in the examples:
 *
 * []                                -->  "no one likes this"
 * ["Peter"]                         -->  "Peter likes this"
 * ["Jacob", "Alex"]                 -->  "Jacob and Alex like this"
 * ["Max", "John", "Mark"]           -->  "Max, John and Mark like this"
 * ["Alex", "Jacob", "Mark", "Max"]  -->  "Alex, Jacob and 2 others like this"
 * Note: For 4 or more names, the number in "and 2 others" simply increases.
 */
public class Main {
    public static void main(String[] args) {
        String[] names = {};
        String[] names1 = {"Peter"};
        String[] names2 = {"Jacob", "Alex"};
        String[] names3 = {"Max", "John", "Mark"};
        String[] names4 = {"Alex", "Jacob", "Mark", "Max"};

        System.out.println(whoLikesIt(names));
        System.out.println(whoLikesIt(names1));
        System.out.println(whoLikesIt(names2));
        System.out.println(whoLikesIt(names3));
        System.out.println(whoLikesIt(names4));
    }

    public static String whoLikesIt(String... names) {
        String result = "";
        if (names.length == 0){
            result = "no one likes this";
        } else if (names.length == 1){
            result = names[0].toString() + " likes this";
        } else if (names.length == 2){
            result =names[0].toString() + " and " + names[1].toString() + " like this";
        }else if (names.length == 3) {
            result = names[0].toString() + ", " + names[1].toString() + " and " + names[2].toString() + " like this";
        } else if (names.length >= 4) {
            int count = names.length - 2;
            result = names[0].toString() + ", " + names[1].toString() + " and " + count + " others like it";
        }
        return result;
    }

    //online I found this alternative
    public static String whoLikesIt2(String... names) {
        switch (names.length) {
            case 0: return "no one likes this";
            case 1: return String.format("%s likes this", names[0]);
            case 2: return String.format("%s and %s like this", names[0], names[1]);
            case 3: return String.format("%s, %s and %s like this", names[0], names[1], names[2]);
            default: return String.format("%s, %s and %d others like this", names[0], names[1], names.length - 2);
        }
    }
}
