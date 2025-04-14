package ss6_inheritance.thuc_hanh.thuc_hanh_1;

public class TextShape {
    public static void main(String[] args) {
        Shape shape = new Shape();
        System.out.println(shape);
        shape = new Shape(false, "red");
        System.out.println(shape);
    }
}
