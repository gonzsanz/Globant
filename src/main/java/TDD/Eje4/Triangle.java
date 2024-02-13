package TDD.Eje4;

public class Triangle extends Polygon{

    private double base;
    private double height;

    public Triangle(double base, double height) {
        super(3);
        this.base = base;
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public double getHeight() {
        return height;
    }

    public double getArea() {
        return 0.5 * base * height;
    }
}
