package ss7_interface_abstract_class.bai_tap.bai_tap_2;

public class Square implements IColorable {
    private double size=1.0;
    private String color="black";

    public Square() {
    }

    public Square(double size, String color) {
        this.size = size;
        this.color = color;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Square{" +
                "size=" + size +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides.");
    }
}
