package TDD.Eje4;

public class Square extends Polygon {

        private double side;

        public Square(double side) {
            super(4);
            this.side = side;
        }

        public double getSide() {
            return side;
        }

        public double getArea() {
            return side * side;
        }
}
