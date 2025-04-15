package ss7_interface_abstract_class.thuc_hanh.thuc_hanh_2;

public abstract class Circle {
    private double radius = 1;
    private String color = "red";
    private boolean filled = true;

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle() {
    }

    public Circle(double radius, String color, boolean filled) {
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                (isFilled() ? "filler" : "is not filler");
    }
}
