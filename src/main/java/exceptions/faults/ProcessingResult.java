package exceptions.faults;

public enum ProcessingResult {

    COMMENT(0),
    NO_ERROR(1),
    WORD_COUNT_ERROR(2),
    VALUE_ERROR(4),
    DATE_ERROR(8),
    VALUE_AND_DATE_ERROR(12),
    FIVE(5)    ;

    private final int code;

    ProcessingResult(int code){
        this.code=code;
    }

    public int getCode(){
        return code;
    }

}
