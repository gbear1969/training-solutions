package typeconversion.whichtype;

public enum Type {
    LONG(Long.MIN_VALUE, Long.MAX_VALUE),
    BYTE(Byte.MIN_VALUE, Byte.MAX_VALUE),
    SHORT(Short.MIN_VALUE, Short.MAX_VALUE),
    INT(Integer.MIN_VALUE, Integer.MAX_VALUE);

    private final long minValue;
    private final long maxValue;

    Type(long minValue, long maxValue) {
        this.minValue = minValue;
        this.maxValue = maxValue;
    }

    public Long getMinValue() {
        return minValue;
    }

    public Long getMaxValue() {
        return maxValue;
    }
}