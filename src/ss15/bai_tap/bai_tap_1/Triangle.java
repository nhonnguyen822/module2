package ss15.bai_tap.bai_tap_1;

public class Triangle {
    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c) throws IllegalTriangleException {
        if (a <= 0 || b <= 0 || c <= 0) {
            throw new IllegalTriangleException("độ dài cạnh không thể nhỏ hơn không");
        } else if (a + b < c || b + c < a || c + a < b) {
            throw new IllegalTriangleException("độ dài 2 cạnh không thể nhỏ hơn cạnh còn lại");
        } else {
            this.a = a;
            this.b = b;
            this.c = c;
        }
    }
}
