package day14;

import java.util.HashMap;
import java.util.Map;

public class Main {

        public static void main(String[] args) {
            String input = "test string";

            // Create a HashMap to store character frequency
            Map<Character, Integer> charFrequency = new HashMap<>();

            // Iterate through the input string
            for (char c : input.toCharArray()) {
                // Ignore non-alphabetic characters
                if (!Character.isLetter(c)) {
                    continue;
                }

                // Convert character to lowercase
                c = Character.toLowerCase(c);

                // Update character frequency in the HashMap
                charFrequency.put(c, charFrequency.getOrDefault(c, 0) + 1);
            }

            // Print distinct characters and their frequencies
            for (Map.Entry<Character, Integer> entry : charFrequency.entrySet()) {
                System.out.println(entry.getKey() + "-" + entry.getValue());
            }
        }
    }


