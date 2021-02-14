package exceptionclass.bank2;

public class InvalidAmountBankOperationException extends InvalidBankOperationException {

    public InvalidAmountBankOperationException() {
        super(ErrorCode.INVALID_AMOUNT);
    }

    @Override
    public ErrorCode getErrorCode() {
        return super.getErrorCode();
    }
}