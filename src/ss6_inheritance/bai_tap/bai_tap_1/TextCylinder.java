package ss6_inheritance.bai_tap.bai_tap_1;

public class TextCylinder {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        System.out.println(cylinder);
        cylinder = new Cylinder(5.0);
        System.out.println(cylinder);
        System.out.println("Volume :" + cylinder.getVolume());
        cylinder = new Cylinder(10.0, 8.0, "yellow");
        System.out.println(cylinder);
        System.out.println("Volume :" + cylinder.getVolume());
    }
}
