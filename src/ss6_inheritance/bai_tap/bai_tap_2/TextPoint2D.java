package ss6_inheritance.bai_tap.bai_tap_2;

import java.util.Arrays;

public class TextPoint2D {
    public static void main(String[] args) {
        Point2D point2D = new Point2D();
        System.out.println(point2D);
        System.out.println(Arrays.toString(point2D.getXY()));
        point2D = new Point2D(5, 10);
        System.out.println(point2D);
        System.out.println(Arrays.toString(point2D.getXY()));
    }
}
