package ss6_inheritance.bai_tap.bai_tap_4;

public class Shape {
    private double side1 = 1;
    private double side2 = 1;
    private double side3 = 1;

    public Shape() {
    }

    public Shape(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public double getPerimeter() {
        return this.side1 + this.side2 + this.side3;
    }

    public double getArea() {
        return Math.sqrt(getPerimeter() / 2 * (getPerimeter() - side1)
                * (getPerimeter() - side2)
                * (getPerimeter() - side3));
    }

    @Override
    public String toString() {
        return "Shape{" +
                "side1=" + side1 +
                ", side2=" + side2 +
                ", side3=" + side3 +
                '}';
    }
}
