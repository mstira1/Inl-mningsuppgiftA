package inlamning;

import org.junit.Assert;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertThrows;

public class MorseConverterTest {
    private final MorseConverter converter = new MorseConverter();

    @Test
    public void testEngToMorse() {
        assertEquals(".- -... -.-.", converter.toMorse("ABC"));
        assertEquals(".... . .---", converter.toMorse("HEJ"));

    }

    @Test
    public void testMorseToText() {
        assertEquals("ABC", converter.toEnglish(".- -... -.-."));
        assertEquals("HEJ", converter.toEnglish(".... . .---"));


    }

    @Test
    public void testInvalidText() {
      assertThrows(IllegalArgumentException.class, () -> converter.toMorse("ÅÄÖ"));
    }

    @Test
    public void testInvalidMorse() {
        assertThrows(IllegalArgumentException.class, () -> converter.toEnglish("......"));
    }

    @Test
    public void testEmptyInput() {
        assertEquals("", converter.toMorse(""));
        assertEquals("", converter.toEnglish(""));
    }


}
