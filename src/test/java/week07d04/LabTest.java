package week07d04;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

public class LabTest {

    @Test
    void testConstruktorNull() {
        Lab labNull = new Lab("Lecke1");
        assertEquals("Lecke1", labNull.getTitle());
        assertFalse(labNull.isCompleted());
        assertEquals(null, labNull.getCompletedAt());
    }

    @Test
    void testConstruktorCompleted() {
        Lab lab = new Lab("Lecke2", LocalDate.of(2020, 12, 13));
        assertEquals("Lecke2", lab.getTitle());
        assertTrue(lab.isCompleted());
        assertEquals(LocalDate.of(2020, 12, 13), lab.getCompletedAt());
    }

    @Test
    void testCompleteNow() {
        Lab labNull = new Lab("Lecke1");
        labNull.complete();
        assertEquals("Lecke1", labNull.getTitle());
        assertTrue(labNull.isCompleted());
        assertEquals(LocalDate.now(), labNull.getCompletedAt());
    }

    @Test
    void testCompleteDate() {
        Lab labNull = new Lab("Lecke1");
        labNull.complete(LocalDate.of(2020,12,13));
        assertEquals("Lecke1", labNull.getTitle());
        assertTrue(labNull.isCompleted());
        assertEquals(LocalDate.of(2020,12,13), labNull.getCompletedAt());
    }
}
