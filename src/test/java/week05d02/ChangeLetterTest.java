package week05d02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ChangeLetterTest {

    @Test
    public void changeVowelsIgnoreCase() {
        ChangeLetter change = new ChangeLetter();
        String eredeti = "VIzalloFurogEP";

        assertEquals("v*z*ll*f*r*g*p", change.changeVowels(eredeti));
    }
}
