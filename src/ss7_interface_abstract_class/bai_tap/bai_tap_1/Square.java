package ss7_interface_abstract_class.bai_tap.bai_tap_1;

public class Square implements IResizeable {
    private double size = 1.0;
    private String color = "while";

    public Square() {
    }

    public Square(double size, String color) {
        this.color = color;
        this.size = size;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Square{" +
                "size=" + size +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public void resize(double percent) {
        setSize(getSize() + (getSize() * percent / 100));
    }
}
