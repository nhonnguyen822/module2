package ss6_inheritance.thuc_hanh.thuc_hanh_1;

public class TextRectangle {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);
        rectangle = new Rectangle(true, "black", 5.5, 10.5);
        System.out.println(rectangle);
        System.out.println("Area :" + rectangle.getArea());
        System.out.println("Perimeter :" + rectangle.getPerimeter());
    }
}
