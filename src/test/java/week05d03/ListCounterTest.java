package week05d03;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ListCounterTest {

    @Test
    public void startsWithATest(){
        ListCounter listCounter = new ListCounter();
        List<String> testlist = Arrays.asList("Ananász", "eper", "alma");

        assertEquals(2, listCounter.listCounter(testlist));
    }

    @Test
    public void startsWithAEmptyTest(){
        ListCounter listCounter = new ListCounter();
        List<String> testlist = new ArrayList<>();

        assertEquals(0, listCounter.listCounter(testlist));    }

    @Test
    public void startsWithANonATest(){
        ListCounter listCounter = new ListCounter();
        List<String> testlist = Arrays.asList("körte", "eper", "Szőlő");

        assertEquals(0, listCounter.listCounter(testlist));    }

}
