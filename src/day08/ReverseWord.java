package day08;

public class ReverseWord {
        public static String reverseWords(String sentence) {
            String[] words = sentence.split(" ");
            String reversedSentence = "";

            for (String word : words) {
                String reversedWord = reverseWord(word);
                reversedSentence += reversedWord + " ";
            }

            return reversedSentence.trim();
        }

        private static String reverseWord(String word) {
            char[] characters = word.toCharArray();
            int left = 0;
            int right = characters.length - 1;

            while (left < right) {
                char temp = characters[left];
                characters[left] = characters[right];
                characters[right] = temp;
                left++;
                right--;
            }

            return new String(characters);
        }

        public static void main(String[] args) {
            String sentence = "Java J2EE Reverse Me";
            String reversedSentence = reverseWords(sentence);
            System.out.println("Reversed sentence: " + reversedSentence);
        }
    }


