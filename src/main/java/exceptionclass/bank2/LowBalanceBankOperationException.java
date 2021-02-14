package exceptionclass.bank2;

public class LowBalanceBankOperationException extends InvalidBankOperationException {

    public LowBalanceBankOperationException() {
        super(ErrorCode.LOW_BALANCE);
    }

    @Override
    public ErrorCode getErrorCode() {
        return super.getErrorCode();
    }
}