package stringtype.registration;

public class UserValidator {
    public boolean isValidUsername (String username) {
        return  "".equals(username);
    }

    public boolean isValidPassword (String password1, String password2) {
        return  password1.equals(password2) && password1.length() > 7;
    }

    public boolean isValidEmail (String email) {
        int kukachely = email.indexOf("@",1);
        int ponthely = email.indexOf(".", kukachely+2);
        return   kukachely > 0 && ponthely > kukachely + 1 && email.length() > ponthely + 1;
    }

}
