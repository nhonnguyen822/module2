package ss6_inheritance.bai_tap.bai_tap_4;

public class TextTriangle {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        System.out.println(triangle);
        System.out.println("Area =" + triangle.getArea());
        System.out.println("Perimeter =" + triangle.getPerimeter());
        triangle = new Triangle(1, 1, 3, "red");
        System.out.println(triangle);
        System.out.println("Area =" + triangle.getArea());
        System.out.println("Perimeter =" + triangle.getPerimeter());
        triangle.setSide1(0);
        System.out.println(triangle);
    }
}
