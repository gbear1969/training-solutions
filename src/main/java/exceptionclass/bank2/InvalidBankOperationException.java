package exceptionclass.bank2;

public class InvalidBankOperationException extends RuntimeException {

    private ErrorCode code;

    public InvalidBankOperationException(ErrorCode code) {
        super(code.toString());
        this.code = code;
    }

    public ErrorCode getErrorCode() {
        return code;
    }
}

