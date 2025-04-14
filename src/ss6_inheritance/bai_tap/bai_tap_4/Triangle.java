package ss6_inheritance.bai_tap.bai_tap_4;

public class Triangle extends Shape {
    private String color = "while";

    public Triangle() {
    }

    public Triangle(double side1, double side2, double side3, String color) {
        super(side1, side2, side3);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean getTestTriangle() {
        if (super.getSide1() + super.getSide2() > super.getSide3()
                && super.getSide2() + super.getSide3() > super.getSide1()
                && super.getSide3() + super.getSide1() > super.getSide2()
                && super.getSide1() > 0
                && super.getSide2() > 0
                && super.getSide3() > 0) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        if (this.getTestTriangle()) {
            return "{ side1 =" + super.getSide1()
                    + " side2 = " + super.getSide2()
                    + " side3 =" + super.getSide3()
                    + " color :" + this.color + "}";

        }
        return "is not s triangle ";
    }
}
