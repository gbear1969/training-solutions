package stringtype.registration;

import java.util.Scanner;

public class Registration {
    public static void main(String[] args) {

        Scanner szkenner = new Scanner(System.in);

        System.out.println("Kérem, adja meg a felhasználónevét!");
        String username = szkenner.nextLine();

        System.out.println("Kérem, adja meg a jelszavát! (min. 8 karakter)");
        String password1 = szkenner.nextLine();

        System.out.println("Kérem, ismételje meg a jelszavát!");
        String password2 = szkenner.nextLine();

        System.out.println("Kérem, adja meg az e-mail címét!");
        String email = szkenner.nextLine();

        UserValidator validator = new UserValidator();

        System.out.println("Felhasználónév : " + username + (validator.isValidUsername(username) ? " (helytelen!)" : " (rendben!)"));
        System.out.println("Jelszó" + (validator.isValidPassword(password1, password2) ? " rendben!" : " helytelen!"));
        System.out.println("E-mail : " + email + (validator.isValidEmail(email)  ? " (rendben!)" : " (helytelen!)"));

    }
}
