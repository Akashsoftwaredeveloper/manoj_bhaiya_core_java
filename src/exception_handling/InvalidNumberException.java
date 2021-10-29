package exception_handling;

public class InvalidNumberException {
    public static class InvalidNumException extends Exception {

        InvalidNumException(String num) {
            super(num);
        }
    }
}