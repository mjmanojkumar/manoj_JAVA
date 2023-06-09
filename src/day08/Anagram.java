package day08;
import java.util.Arrays;


public class Anagram {
        public static boolean areAnagrams(String str1, String str2) {
            // Convert the strings to lowercase (optional)
            str1 = str1.toLowerCase();
            str2 = str2.toLowerCase();

            // Remove whitespace (optional)
            str1 = str1.replace(" ", "");
            str2 = str2.replace(" ", "");

            // Sort the characters in each string
            char[] arr1 = str1.toCharArray();
            char[] arr2 = str2.toCharArray();
            Arrays.sort(arr1);
            Arrays.sort(arr2);

            // Compare the sorted strings
            return Arrays.equals(arr1, arr2);
        }

        public static void main(String[] args) {
            String string1 = "listen";
            String string2 = "silent";
            if (areAnagrams(string1, string2)) {
                System.out.println("The strings are anagrams.");
            } else {
                System.out.println("The strings are not anagrams.");
            }
        }
    }


