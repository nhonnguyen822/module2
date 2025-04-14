package ss6_inheritance.bai_tap.bai_tap_3;

import java.util.Arrays;

public class TextPoint {
    public static void main(String[] args) {
        Point point = new Point();
        System.out.println(point);
        point = new Point(5, 5);
        System.out.println(point);
        System.out.println(Arrays.toString(point.getXY()));
    }

}
