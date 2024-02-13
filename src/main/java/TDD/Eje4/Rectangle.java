package TDD.Eje4;

public class Rectangle extends Polygon{

        private double base;
        private double height;

        public Rectangle(double base, double height) {
            super(4);
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
            return base * height;
        }
}
