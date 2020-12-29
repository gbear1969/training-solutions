package stringbasic.pets;

public class RnValidator {
    public boolean isValidRn(String rn) {
        if (rn.length() == 6) {
            int r = Integer.parseInt(rn);
            return true;
        }
        return false;
    }
}
