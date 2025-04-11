package ss5_accessmodifier_static.bai_tap.bai_tap_1;

public class Run {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        circle1.display();
        System.out.println(circle1.getArea());
        Circle circle2 = new Circle(5, "green");
        circle2.display();
        System.out.println(circle2.getArea());
    }
}
