package ss4_oop.thuc_thanh.thuc_hanh_1;

public class Retangle {
    double width, height;
    public Retangle() {

    }


    public Retangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return this.width * this.height;
    }

    public double getPerimeter() {
        return (this.width + this.height) * 2;
    }

    public String display() {
        return "Rectangle{width " + width + "height " + height + "}";
    }
}
