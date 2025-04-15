package ss7_interface_abstract_class.bai_tap.bai_tap_1;

public class Rectangle implements IResizeable {
    private double width = 1.0;
    private double height = 1.0;
    private String color = "red";

    public Rectangle() {
    }

    public Rectangle(double width, double height, String color) {
        this.width = width;
        this.height = height;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public void resize(double percent) {
        setWidth(getHeight() * percent / 100 + getHeight());
        setHeight(getHeight() * percent / 100 + getHeight());
    }
}
