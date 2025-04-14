package ss6_inheritance.bai_tap.bai_tap_1;

public class TextCircle {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);
        circle = new Circle(5.0, "green");
        System.out.println(circle);
        System.out.println("Area :" + circle.getArea());
    }
}
