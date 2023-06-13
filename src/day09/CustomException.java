package day09;

public class CustomException extends RuntimeException {

    public CustomException(String message) {
        super(message);
    }
}

class ExceptionHandling {
    public static void main(String[] args) {
        try {
            // Code that may throw a runtime exception
            int result = divideNumbers(10, 0);
        } catch (ArithmeticException e) {
            handleException();
        }
    }


    public static void handleException () {
        try {
            throw new CustomException("Custom exception occurred.");
        } catch (CustomException ce) {
            System.out.println(ce.getMessage());
        }
    }

    public static int divideNumbers ( int dividend, int divisor){
        return dividend / divisor;
    }
}
