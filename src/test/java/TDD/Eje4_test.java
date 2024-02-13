package TDD;

import TDD.Eje4.Rectangle;
import TDD.Eje4.Square;
import TDD.Eje4.Triangle;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;
public class Eje4_test {

    @Test
    public void triangleAreaTest(){
        double base = 10;
        double height = 5;
        double waited = 25;
        Triangle triangle = new Triangle(base, height);
        double result = triangle.getArea();
        assertEquals(waited, result);
    }

    @Test
    public void squareAreaTest(){
        double side = 10;
        double waited = 100;
        Square triangle = new Square(side);
        double result = triangle.getArea();
        assertEquals(waited, result);
    }

    @Test
    public void rectangleAreaTest(){
        double base = 10;
        double height = 20;
        double waited = 200;
        Rectangle triangle = new Rectangle(base, height);
        double result = triangle.getArea();
        assertEquals(waited, result);
    }

}
