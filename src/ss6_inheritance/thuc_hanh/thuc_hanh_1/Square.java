package ss6_inheritance.thuc_hanh.thuc_hanh_1;

public class Square extends Rectangle {
    public Square() {
    }

    public Square(Double size) {
        super(size, size);
    }

    public Square(Double size, Boolean filler, String color) {
        super(filler, color, size, size);
    }

    public double getSize() {
        return getWidth();
    }

    public void setSize(double size) {
        setWidth(size);
        setHeight(size);
    }

    @Override
    public void setWidth(double width) {
        setSize(width);
    }

    @Override
    public void setHeight(double height) {
        setSize(height);
    }

    @Override
    public String toString() {
        return "A Square with side= "
                + getSize()
                + ", which is a subclass of "
                + super.toString();
    }
}
