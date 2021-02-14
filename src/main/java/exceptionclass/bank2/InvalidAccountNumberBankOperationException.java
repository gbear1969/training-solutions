package exceptionclass.bank2;

public class InvalidAccountNumberBankOperationException extends InvalidBankOperationException {

    public InvalidAccountNumberBankOperationException() {
        super(ErrorCode.INVALID_ACCOUNTNUMBER);
    }

    @Override
    public ErrorCode getErrorCode() {
        return super.getErrorCode();
    }
}
