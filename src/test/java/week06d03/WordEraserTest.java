package week06d03;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WordEraserTest {

    @Test
    public void eraseWordTest() {
        WordEraser teszt = new WordEraser();
        assertEquals("körte barack sziva körte birsalma", teszt.eraseWord("alma körte barack alma sziva körte birsalma", "alma"));
    }

}
