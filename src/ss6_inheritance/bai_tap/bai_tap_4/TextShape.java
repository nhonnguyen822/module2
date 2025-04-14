package ss6_inheritance.bai_tap.bai_tap_4;

public class TextShape {
    public static void main(String[] args) {
        Shape shape = new Shape();
        System.out.println(shape);
        shape = new Shape(2, 3, 5);
        System.out.println(shape);
    }
}
