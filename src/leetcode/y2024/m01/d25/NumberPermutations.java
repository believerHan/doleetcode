package leetcode.y2024.m01.d25;

import java.util.ArrayList;
import java.util.List;

public class NumberPermutations {

    public static List<String> generatePermutations(String input) {
        List<String> permutations = new ArrayList<>();
        char[] chars = input.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            char originalChar = chars[i];

            // Increment
            chars[i] = (originalChar == '9') ? '0' : (char) (originalChar + 1);
            permutations.add(new String(chars));

            // Decrement
            chars[i] = (originalChar == '0') ? '9' : (char) (originalChar - 1);
            permutations.add(new String(chars));

            // Restore original char for next iteration
            chars[i] = originalChar;
        }

        return permutations;
    }

    private static char incrementChar(char c) {
        return (c == '9') ? '0' : (char) (c + 1);
    }

    private static char decrementChar(char c) {
        return (c == '0') ? '9' : (char) (c - 1);
    }

    public static void main(String[] args) {
        String number = "0000";

        System.out.println("Original Number: " + number);

        List<String> permutations = generatePermutations(number);

        System.out.println("Possible Permutations:");
        for (String permutation : permutations) {
            System.out.println(permutation);
        }
    }
}
