package ss6_inheritance.bai_tap.bai_tap_2;

import java.util.Arrays;

public class TextPoint3D {
    public static void main(String[] args) {
        Point3D point3D = new Point3D();
        System.out.println(point3D);
        point3D = new Point3D(5, 2, 5);
        System.out.println(point3D);
        System.out.println(Arrays.toString(point3D.getXYZ()));
        point3D.setXYZ(10, 10, 10);
        System.out.println(point3D);
    }
}
