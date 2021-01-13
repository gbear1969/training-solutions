package week11d03;

import introexception.patient.Patient;
import org.junit.jupiter.api.Test;
import week08d03.StringLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class WordFilterTest {

    @Test
    void wordsWithChar() {
        WordFilter wf = new WordFilter();
        List<String> list = new ArrayList<>();
        list.add("macska");
        list.add("kutya");
        list.add("Cirmos");
        list.add("Bundi");
        assertEquals(Arrays.asList("macska", "Cirmos"), wf.wordsWithChar(list, 'c'));

    }

    @Test
    void wordsWithCharWithNull() {
        WordFilter wf2 = new WordFilter();
        Exception ex = assertThrows(IllegalArgumentException.class, () -> wf2.wordsWithChar(null, 'c'));
        assertEquals("Nem megfelelő tömb vagy karakter!", ex.getMessage());


    }
    @Test
    void wordsWithCharWithoutChar() {
        WordFilter wf3 = new WordFilter();
        List<String> list = new ArrayList<>();
        Exception ex = assertThrows(IllegalArgumentException.class, () -> wf3.wordsWithChar(list, ' '));
        assertEquals("Nem megfelelő tömb vagy karakter!", ex.getMessage());


    }
}

