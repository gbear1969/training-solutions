package exceptionmulticatch.converter;

public class InvalidBinaryStringException extends RuntimeException {

    public InvalidBinaryStringException() {
        super();
    }

    public InvalidBinaryStringException(String message) {
        super(message);
    }
}
