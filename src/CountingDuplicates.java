// Count the number of Duplicates
// Write a function that will return the count of distinct case-insensitive alphabetic characters and numeric digits that occur more than once in the input string. The input string can be assumed to contain only alphabets (both uppercase and lowercase) and numeric digits.
//
// Example
// "abcde" -> 0 # no characters repeats more than once
// "aabbcde" -> 2 # 'a' and 'b'
// "aabBcde" -> 2 # 'a' occurs twice and 'b' twice (bandB)
// "indivisibility" -> 1 # 'i' occurs six times
// "Indivisibilities" -> 2 # 'i' occurs seven times and 's' occurs twice
// "aA11" -> 2 # 'a' and '1'
// "ABBA" -> 2 # 'A' and 'B' each occur twice

import java.util.HashMap;

public class CountingDuplicates {
    public static int duplicateCount(String text) {
        char[] textArray= text.toLowerCase().toCharArray();
        HashMap<Character, Integer> letterCount = new HashMap<>();
        int duplicateCount = 0;
        for(char letter : textArray) {
            if(letterCount.containsKey(letter)) {
                letterCount.replace(letter, letterCount.get(letter) + 1);
            } else {
                letterCount.put(letter, 1);
            }
            if(letterCount.get(letter) == 2) {
                duplicateCount += 1;
            }
        }
        return duplicateCount;
    }

    public static void main(String[] args) {
        System.out.println(duplicateCount("indivisibility"));
    }
}

//Alternate Answer
//public class CountingDuplicates {
//    public static int duplicateCount(String text) {
//        int ans = 0;
//        text = text.toLowerCase();
//        while (text.length() > 0) {
//            String firstLetter = text.substring(0,1);
//            text = text.substring(1);
//            if (text.contains(firstLetter)) ans ++;
//            text = text.replace(firstLetter, "");
//        }
//        return ans;
//    }
//}
