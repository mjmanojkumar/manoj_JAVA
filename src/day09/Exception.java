package day09;

public class Exception {

    public Exception(String message) {
    }

    public static void main(String[] args) {
        String input1 = "23";
        String input2 = "45.67";
        String input3 = "test";
        String input4 = "123f";

        System.out.println(convertToInteger(input1));
        System.out.println(convertToInteger(input2));
        System.out.println(convertToInteger(input3));
        System.out.println(convertToInteger(input4));
    }

    public static int convertToInteger(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e) {
            e.printStackTrace();
            System.out.println("Error Occurred");
            return 0;
        }


    }
}
