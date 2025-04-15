package ss7_interface_abstract_class.thuc_hanh.thuc_hanh_3;

import java.util.Arrays;
import java.util.Comparator;

public class ComparableCircleTest {
    public static void main(String[] args) {
        Circle[] circles = new Circle[3];
        circles[0] = new Circle(3.6);
        circles[1] = new Circle();
        circles[2] = new Circle(3.5, "indigo", false);
        System.out.println("Pre-sorted:");
        for (Circle circle : circles) {
            System.out.println(circle);
        }
        Comparator circler = new CircleComparator();
        Arrays.sort(circles, circler);
        System.out.println("Pre-sorted:");
        for (Circle circle : circles) {
            System.out.println(circle);
        }
    }
}
