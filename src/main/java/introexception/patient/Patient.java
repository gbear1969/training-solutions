package introexception.patient;

public class Patient {
    private String name;
    private String socialSecurityNumber;
    private int yearOfBirth;

    public Patient(String name, String socialSecurityNumber, int yearOfBirth) {
            if (name.isBlank() || !new SsnValidator().isValidSsn(socialSecurityNumber) ||  yearOfBirth < 1900) {
                throw new IllegalArgumentException();
            }
            this.name = name;
            this.socialSecurityNumber = socialSecurityNumber;
            this.yearOfBirth = yearOfBirth;
    }

    public String getName() {
        return name;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }
}
