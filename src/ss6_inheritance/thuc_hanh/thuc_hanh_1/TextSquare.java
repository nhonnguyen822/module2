package ss6_inheritance.thuc_hanh.thuc_hanh_1;

public class TextSquare {
    public static void main(String[] args) {
        Square square = new Square();
        System.out.println(square);
        square = new Square(10.0);
        System.out.println(square);
        System.out.println("Area :" + square.getArea());
        System.out.println("Perimeter :" + square.getPerimeter());
    }
}
