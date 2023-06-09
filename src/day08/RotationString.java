package day08;

public class RotationString {
        public static boolean isRotation(String str1, String str2) {
            // Check if the strings have the same length
            if (str1.length() != str2.length()) {
                return false;
            }

            // Concatenate str1 with itself
            String concatenatedString = str1 + str1;

            // Check if str2 is a substring of the concatenated string
            return concatenatedString.contains(str2);
        }

        public static void main(String[] args) {
            String str1 = "JavaJ2eeStrutsHibernate";
            String str2 = "StrutsHibernateJavaJ2ee";

            if (isRotation(str1, str2)) {
                System.out.println("The strings are rotations of each other.");
            } else {
                System.out.println("The strings are not rotations of each other.");
            }
        }
    }


