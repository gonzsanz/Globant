package TDD.Eje4;

public abstract class Polygon {

    private int numSides;

    public Polygon (int numSides) {
        this.numSides = numSides;
    }

    public int getNumSides() {
        return numSides;
    }

    public abstract double getArea();
}
