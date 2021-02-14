package exceptionmulticatch.converter;

public class BinaryStringConverter {

    public boolean[] binaryStringToBooleanArray(String bStrs) {
        if (bStrs == null) {
            throw new NullPointerException("binaryString null");
        }
        boolean[] booleans = new boolean[bStrs.length()];
        for (int i = 0; i < bStrs.length(); i++) {
            if (bStrs.charAt(i) != '0' && bStrs.charAt(i) != '1') {
                throw new IllegalArgumentException();
            }
            booleans[i] = bStrs.charAt(i) == '1';
        }
        return booleans;
    }

    public String booleanArrayToBinaryString(boolean[] booleans) {
        if (booleans == null || booleans.length == 0) {
            throw new IllegalArgumentException();
        }
        String bStrs = "";
        for (int i = 0; i < booleans.length; i++) {
            if (booleans[i]) {
                bStrs += "1";
            } else {
                bStrs += "0";
            }
        }
        return bStrs;
    }

}