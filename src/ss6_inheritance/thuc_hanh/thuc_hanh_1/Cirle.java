package ss6_inheritance.thuc_hanh.thuc_hanh_1;

public class Cirle extends Shape {
    private Double radius = 1.0;

    public Cirle() {
    }

    public Cirle(Double radius) {
        this.radius = radius;
    }

    public Cirle(Double radius, Boolean filler, String color) {
        super(filler, color);
        this.radius = radius;
    }

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return this.radius * this.radius * Math.PI;
    }

    public double getPerimeter() {
        return this.radius * 2 * Math.PI;
    }

    @Override
    public String toString() {
        return "A Circle with radius= "
                + getRadius()
                + ", which is a subclass of "
                + super.toString();
    }
}
