package ss7_interface_abstract_class.thuc_hanh.thuc_hanh_2;

import ss7_interface_abstract_class.thuc_hanh.thuc_hanh_1.Animal;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ComparableCircle[] circles = new ComparableCircle[3];
        circles[0] = new ComparableCircle(3.6);
        circles[1] = new ComparableCircle();
        circles[2] = new ComparableCircle(3.5, "indigo", false);
        System.out.println("Pre-sorted:");
        for (ComparableCircle circle : circles) {
            System.out.println(circle);
        }
        Arrays.sort(circles);
        for (ComparableCircle circle : circles) {
            System.out.println(circle);
        }
    }
}
