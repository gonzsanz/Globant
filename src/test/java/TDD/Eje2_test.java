package TDD;

import org.junit.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
public class Eje2_test {

    @Test
    public void lengthTest() {
        int waited = 100;
        Eje2 eje2 = new Eje2();
        List<String> result = eje2.fizzbuzz();
        assertEquals(waited, result.size());
    }

    @Test
    public void fizzTest() {
        Eje2 eje2 = new Eje2();
        List<String> result = eje2.fizzbuzz();

        for (int i = 0; i< result.size(); i++) {
            if ((i+1) % 3 == 0 && (i+1) % 5 != 0) {
                assertEquals("Fizz", result.get(i));
            }
        }
    }

    @Test
    public void buzzTest() {
        Eje2 eje2 = new Eje2();
        List<String> result = eje2.fizzbuzz();

        for (int i = 0; i< result.size(); i++) {
            if ((i+1) % 5 == 0 && (i+1) % 3 != 0) {
                assertEquals("Buzz", result.get(i));
            }
        }
    }

    @Test
    public void fizzbuzzTest() {
        Eje2 eje2 = new Eje2();
        List<String> result = eje2.fizzbuzz();

        for (int i = 0; i< result.size(); i++) {
            if ((i+1) % 3 == 0 && (i+1) % 5 == 0) {
                assertEquals("FizzBuzz", result.get(i));
            }
        }
    }

    @Test
    public void numberTest() {
        Eje2 eje2 = new Eje2();
        List<String> result = eje2.fizzbuzz();

        for (int i = 0; i< result.size(); i++) {
            if ((i+1) % 3 != 0 && (i+1) % 5 != 0) {
                assertEquals(String.valueOf(i+1), result.get(i));
            }
        }
    }

    @Test
    public void allTest() {
        Eje2 eje2 = new Eje2();
        List<String> result = eje2.fizzbuzz();

        for (int i = 0; i< result.size(); i++) {
            if ((i+1) % 3 == 0 && (i+1) % 5 != 0) {
                assertEquals("Fizz", result.get(i));
            }
            if ((i+1) % 5 == 0 && (i+1) % 3 != 0) {
                assertEquals("Buzz", result.get(i));
            }
            if ((i+1) % 3 == 0 && (i+1) % 5 == 0) {
                assertEquals("FizzBuzz", result.get(i));
            }
            if ((i+1) % 3 != 0 && (i+1) % 5 != 0) {
                assertEquals(String.valueOf(i+1), result.get(i));
            }
        }
    }

}
