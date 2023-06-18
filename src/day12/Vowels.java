package day12;

import java.util.Arrays;

public class Vowels {

        public static void main(String[] args) {
            String[] strings = {"manoj", "kumar", "barugu", "nani", "vicky"};

            Arrays.stream(strings)
                    .filter(s -> s.matches(".*[aeiouAEIOU].*"))
                    .forEach(s -> System.out.println(s + " - " + countVowels(s)));
        }

        private static int countVowels(String s) {
            return (int) s.chars()
                    .mapToObj(c -> (char) c)
                    .filter(c -> "aeiouAEIOU".indexOf(c) != -1)
                    .count();
        }
    }


