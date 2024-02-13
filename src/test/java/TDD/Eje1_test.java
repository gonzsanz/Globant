package TDD;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Eje1_test {

    @Test
    public void lengthTest() {
        int waited = 100;
        Eje1 eje1 = new Eje1();
        String[] result = eje1.fizzbuzz();
        assertEquals(waited,result.length);
    }

    @Test
    public void fizzTest() {
        Eje1 eje1 = new Eje1();
        String[] result = eje1.fizzbuzz();
        for (int i = 0; i < result.length; i++) {
            if ((i+1) % 3 == 0 && (i+1) % 5 != 0) {
                assertEquals("Fizz",result[i]);
            }
        }
    }

    @Test
    public void buzzTest() {
        Eje1 eje1 = new Eje1();
        String[] result = eje1.fizzbuzz();
        for (int i = 0; i < result.length; i++) {
            if ((i+1) % 5 == 0 && (i+1) % 3 != 0) {
                assertEquals("Buzz",result[i]);
            }
        }
    }

    @Test
    public void fizzbuzzTest() {
        Eje1 eje1 = new Eje1();
        String[] result = eje1.fizzbuzz();
        for (int i = 0; i < result.length; i++) {
            if ((i+1) % 3 == 0 && (i+1) % 5 == 0) {
                assertEquals("FizzBuzz",result[i]);
            }
        }
    }

    @Test
    public void numberTest() {
        Eje1 eje1 = new Eje1();
        String[] result = eje1.fizzbuzz();
        for (int i = 0; i < result.length; i++) {
            if ((i+1) % 3 != 0 && (i+1) % 5 != 0) {
                assertEquals(String.valueOf(i+1),result[i]);
            }
        }
    }

    @Test
    public void allTest() {
        Eje1 eje1 = new Eje1();
        String[] result = eje1.fizzbuzz();
        for (int i = 0; i < result.length; i++) {
            if ((i+1) % 3 == 0 && (i+1) % 5 != 0) {
                assertEquals("Fizz",result[i]);
            } else if ((i+1) % 5 == 0 && (i+1) % 3 != 0) {
                assertEquals("Buzz",result[i]);
            } else if ((i+1) % 3 == 0 && (i+1) % 5 == 0) {
                assertEquals("FizzBuzz",result[i]);
            } else {
                assertEquals(String.valueOf(i+1),result[i]);
            }
        }
    }
}
