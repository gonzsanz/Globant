package TDD;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Eje5_test {

    @Test
    public void testToMorse() {
        assertEquals(".-", Eje5.toMorse("A"));
        assertEquals("-...", Eje5.toMorse("B"));
        assertEquals("-.-.", Eje5.toMorse("C"));
        assertEquals("-..", Eje5.toMorse("D"));
        assertEquals("E", Eje5.toText("."));
        assertEquals("F", Eje5.toText("..-."));
        assertEquals("G", Eje5.toText("--."));
        assertEquals("H", Eje5.toText("...."));
        assertEquals("I", Eje5.toText(".."));
        assertEquals(".- -... -.-.  -.. . ..-.", Eje5.toMorse("ABC DEF"));
        assertEquals("ABC DEF", Eje5.toText(".- -... -.-.  -.. . ..-."));
    }
}
