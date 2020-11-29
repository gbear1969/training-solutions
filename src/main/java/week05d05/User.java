package week05d05;

public class User {
    private String firstName;
    private String lastName;
    private String email;

    public User(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        int h = email.length();
        int k = email.indexOf("@");
        int p = email.indexOf(".", k + 2);
        if ((h < 5) || (k < 1) || (p < k + 2)) {
            System.out.println("A megadott e-mail cím (" + email + ") helytelen!");
        }
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }
}
