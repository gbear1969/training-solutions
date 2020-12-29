package introexception.patient;

public class SsnValidator {
    public boolean isValidSsn(String ssn) {
        int sum = 0;

        if (ssn.length() == 9) {
            for (int i = 0; i < 8; i++) {
                if (i % 2 == 0) {
                    sum += Integer.parseInt(ssn.substring(i, i + 1)) * 3;
                } else {
                    sum += Integer.parseInt(ssn.substring(i, i + 1)) * 7;
                }
            }
            return (sum % 10) == Integer.parseInt(ssn.substring(8));
        }
        return false;
    }
}
