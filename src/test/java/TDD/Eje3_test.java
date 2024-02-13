package TDD;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;
public class Eje3_test {

    @Test
    public void reverseTest() {
        String waited = "odnum aloH";
        Eje3 eje3 = new Eje3();
        String result = eje3.reverseString();

        assertEquals(waited, result);
    }

}
