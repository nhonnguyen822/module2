package ss7_interface_abstract_class.bai_tap.bai_tap_1;

public class TextInterface {
    public static void main(String[] args) {
        Circle circle = new Circle(10, "green");
        Rectangle rectangle = new Rectangle(10, 20, "green");
        Square square = new Square(10, "green");
        System.out.println(circle);
        System.out.println(rectangle);
        System.out.println(square);
        double random = Math.floor(Math.random() * (100 - 1) + 1);
        circle.resize(random);
        rectangle.resize(random);
        square.resize(random);
        System.out.println(circle);
        System.out.println(rectangle);
        System.out.println(square);
    }
}
